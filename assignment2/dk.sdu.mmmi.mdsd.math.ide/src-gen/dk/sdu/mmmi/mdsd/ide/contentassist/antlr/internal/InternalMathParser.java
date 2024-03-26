package dk.sdu.mmmi.mdsd.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import dk.sdu.mmmi.mdsd.services.MathGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'let '", "' let '", "' = '", "'='", "'in'", "' in '", "'end'", "' end '", "'var '", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMathParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMathParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMathParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMath.g"; }


    	private MathGrammarAccess grammarAccess;

    	public void setGrammarAccess(MathGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleMathExp"
    // InternalMath.g:53:1: entryRuleMathExp : ruleMathExp EOF ;
    public final void entryRuleMathExp() throws RecognitionException {
        try {
            // InternalMath.g:54:1: ( ruleMathExp EOF )
            // InternalMath.g:55:1: ruleMathExp EOF
            {
             before(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            ruleMathExp();

            state._fsp--;

             after(grammarAccess.getMathExpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalMath.g:62:1: ruleMathExp : ( ( rule__MathExp__ExpAssignment ) ) ;
    public final void ruleMathExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:66:2: ( ( ( rule__MathExp__ExpAssignment ) ) )
            // InternalMath.g:67:2: ( ( rule__MathExp__ExpAssignment ) )
            {
            // InternalMath.g:67:2: ( ( rule__MathExp__ExpAssignment ) )
            // InternalMath.g:68:3: ( rule__MathExp__ExpAssignment )
            {
             before(grammarAccess.getMathExpAccess().getExpAssignment()); 
            // InternalMath.g:69:3: ( rule__MathExp__ExpAssignment )
            // InternalMath.g:69:4: rule__MathExp__ExpAssignment
            {
            pushFollow(FOLLOW_2);
            rule__MathExp__ExpAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMathExpAccess().getExpAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleExp"
    // InternalMath.g:78:1: entryRuleExp : ruleExp EOF ;
    public final void entryRuleExp() throws RecognitionException {
        try {
            // InternalMath.g:79:1: ( ruleExp EOF )
            // InternalMath.g:80:1: ruleExp EOF
            {
             before(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getExpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalMath.g:87:1: ruleExp : ( ruleVar ) ;
    public final void ruleExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:91:2: ( ( ruleVar ) )
            // InternalMath.g:92:2: ( ruleVar )
            {
            // InternalMath.g:92:2: ( ruleVar )
            // InternalMath.g:93:3: ruleVar
            {
             before(grammarAccess.getExpAccess().getVarParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleVar();

            state._fsp--;

             after(grammarAccess.getExpAccess().getVarParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleVar"
    // InternalMath.g:103:1: entryRuleVar : ruleVar EOF ;
    public final void entryRuleVar() throws RecognitionException {
        try {
            // InternalMath.g:104:1: ( ruleVar EOF )
            // InternalMath.g:105:1: ruleVar EOF
            {
             before(grammarAccess.getVarRule()); 
            pushFollow(FOLLOW_1);
            ruleVar();

            state._fsp--;

             after(grammarAccess.getVarRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // InternalMath.g:112:1: ruleVar : ( ( rule__Var__Group__0 ) ) ;
    public final void ruleVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:116:2: ( ( ( rule__Var__Group__0 ) ) )
            // InternalMath.g:117:2: ( ( rule__Var__Group__0 ) )
            {
            // InternalMath.g:117:2: ( ( rule__Var__Group__0 ) )
            // InternalMath.g:118:3: ( rule__Var__Group__0 )
            {
             before(grammarAccess.getVarAccess().getGroup()); 
            // InternalMath.g:119:3: ( rule__Var__Group__0 )
            // InternalMath.g:119:4: rule__Var__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Var__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVarAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVar"


    // $ANTLR start "entryRuleLet"
    // InternalMath.g:128:1: entryRuleLet : ruleLet EOF ;
    public final void entryRuleLet() throws RecognitionException {
        try {
            // InternalMath.g:129:1: ( ruleLet EOF )
            // InternalMath.g:130:1: ruleLet EOF
            {
             before(grammarAccess.getLetRule()); 
            pushFollow(FOLLOW_1);
            ruleLet();

            state._fsp--;

             after(grammarAccess.getLetRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLet"


    // $ANTLR start "ruleLet"
    // InternalMath.g:137:1: ruleLet : ( ( rule__Let__Group__0 ) ) ;
    public final void ruleLet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:141:2: ( ( ( rule__Let__Group__0 ) ) )
            // InternalMath.g:142:2: ( ( rule__Let__Group__0 ) )
            {
            // InternalMath.g:142:2: ( ( rule__Let__Group__0 ) )
            // InternalMath.g:143:3: ( rule__Let__Group__0 )
            {
             before(grammarAccess.getLetAccess().getGroup()); 
            // InternalMath.g:144:3: ( rule__Let__Group__0 )
            // InternalMath.g:144:4: rule__Let__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Let__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLet"


    // $ANTLR start "entryRulePlusMinus"
    // InternalMath.g:153:1: entryRulePlusMinus : rulePlusMinus EOF ;
    public final void entryRulePlusMinus() throws RecognitionException {
        try {
            // InternalMath.g:154:1: ( rulePlusMinus EOF )
            // InternalMath.g:155:1: rulePlusMinus EOF
            {
             before(grammarAccess.getPlusMinusRule()); 
            pushFollow(FOLLOW_1);
            rulePlusMinus();

            state._fsp--;

             after(grammarAccess.getPlusMinusRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlusMinus"


    // $ANTLR start "rulePlusMinus"
    // InternalMath.g:162:1: rulePlusMinus : ( ( rule__PlusMinus__Group__0 ) ) ;
    public final void rulePlusMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:166:2: ( ( ( rule__PlusMinus__Group__0 ) ) )
            // InternalMath.g:167:2: ( ( rule__PlusMinus__Group__0 ) )
            {
            // InternalMath.g:167:2: ( ( rule__PlusMinus__Group__0 ) )
            // InternalMath.g:168:3: ( rule__PlusMinus__Group__0 )
            {
             before(grammarAccess.getPlusMinusAccess().getGroup()); 
            // InternalMath.g:169:3: ( rule__PlusMinus__Group__0 )
            // InternalMath.g:169:4: rule__PlusMinus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlusMinusAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlusMinus"


    // $ANTLR start "entryRuleTerm"
    // InternalMath.g:178:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // InternalMath.g:179:1: ( ruleTerm EOF )
            // InternalMath.g:180:1: ruleTerm EOF
            {
             before(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getTermRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalMath.g:187:1: ruleTerm : ( ( rule__Term__Group__0 ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:191:2: ( ( ( rule__Term__Group__0 ) ) )
            // InternalMath.g:192:2: ( ( rule__Term__Group__0 ) )
            {
            // InternalMath.g:192:2: ( ( rule__Term__Group__0 ) )
            // InternalMath.g:193:3: ( rule__Term__Group__0 )
            {
             before(grammarAccess.getTermAccess().getGroup()); 
            // InternalMath.g:194:3: ( rule__Term__Group__0 )
            // InternalMath.g:194:4: rule__Term__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRulePrimary"
    // InternalMath.g:203:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalMath.g:204:1: ( rulePrimary EOF )
            // InternalMath.g:205:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMath.g:212:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:216:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalMath.g:217:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalMath.g:217:2: ( ( rule__Primary__Alternatives ) )
            // InternalMath.g:218:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalMath.g:219:3: ( rule__Primary__Alternatives )
            // InternalMath.g:219:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "rule__Let__Alternatives_1"
    // InternalMath.g:227:1: rule__Let__Alternatives_1 : ( ( ( rule__Let__Group_1_0__0 ) ) | ( ( rule__Let__Group_1_1__0 ) ) | ( ( rule__Let__Group_1_2__0 ) ) );
    public final void rule__Let__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:231:1: ( ( ( rule__Let__Group_1_0__0 ) ) | ( ( rule__Let__Group_1_1__0 ) ) | ( ( rule__Let__Group_1_2__0 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 11:
            case 12:
                {
                alt1=1;
                }
                break;
            case 15:
            case 16:
                {
                alt1=2;
                }
                break;
            case 17:
            case 18:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMath.g:232:2: ( ( rule__Let__Group_1_0__0 ) )
                    {
                    // InternalMath.g:232:2: ( ( rule__Let__Group_1_0__0 ) )
                    // InternalMath.g:233:3: ( rule__Let__Group_1_0__0 )
                    {
                     before(grammarAccess.getLetAccess().getGroup_1_0()); 
                    // InternalMath.g:234:3: ( rule__Let__Group_1_0__0 )
                    // InternalMath.g:234:4: rule__Let__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Let__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLetAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:238:2: ( ( rule__Let__Group_1_1__0 ) )
                    {
                    // InternalMath.g:238:2: ( ( rule__Let__Group_1_1__0 ) )
                    // InternalMath.g:239:3: ( rule__Let__Group_1_1__0 )
                    {
                     before(grammarAccess.getLetAccess().getGroup_1_1()); 
                    // InternalMath.g:240:3: ( rule__Let__Group_1_1__0 )
                    // InternalMath.g:240:4: rule__Let__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Let__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLetAccess().getGroup_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMath.g:244:2: ( ( rule__Let__Group_1_2__0 ) )
                    {
                    // InternalMath.g:244:2: ( ( rule__Let__Group_1_2__0 ) )
                    // InternalMath.g:245:3: ( rule__Let__Group_1_2__0 )
                    {
                     before(grammarAccess.getLetAccess().getGroup_1_2()); 
                    // InternalMath.g:246:3: ( rule__Let__Group_1_2__0 )
                    // InternalMath.g:246:4: rule__Let__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Let__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLetAccess().getGroup_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__Alternatives_1"


    // $ANTLR start "rule__Let__Alternatives_1_0_1"
    // InternalMath.g:254:1: rule__Let__Alternatives_1_0_1 : ( ( 'let ' ) | ( ' let ' ) );
    public final void rule__Let__Alternatives_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:258:1: ( ( 'let ' ) | ( ' let ' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMath.g:259:2: ( 'let ' )
                    {
                    // InternalMath.g:259:2: ( 'let ' )
                    // InternalMath.g:260:3: 'let '
                    {
                     before(grammarAccess.getLetAccess().getLetKeyword_1_0_1_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getLetAccess().getLetKeyword_1_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:265:2: ( ' let ' )
                    {
                    // InternalMath.g:265:2: ( ' let ' )
                    // InternalMath.g:266:3: ' let '
                    {
                     before(grammarAccess.getLetAccess().getLetKeyword_1_0_1_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getLetAccess().getLetKeyword_1_0_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__Alternatives_1_0_1"


    // $ANTLR start "rule__Let__Alternatives_1_0_3"
    // InternalMath.g:275:1: rule__Let__Alternatives_1_0_3 : ( ( ' = ' ) | ( '=' ) );
    public final void rule__Let__Alternatives_1_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:279:1: ( ( ' = ' ) | ( '=' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMath.g:280:2: ( ' = ' )
                    {
                    // InternalMath.g:280:2: ( ' = ' )
                    // InternalMath.g:281:3: ' = '
                    {
                     before(grammarAccess.getLetAccess().getSpaceEqualsSignSpaceKeyword_1_0_3_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getLetAccess().getSpaceEqualsSignSpaceKeyword_1_0_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:286:2: ( '=' )
                    {
                    // InternalMath.g:286:2: ( '=' )
                    // InternalMath.g:287:3: '='
                    {
                     before(grammarAccess.getLetAccess().getEqualsSignKeyword_1_0_3_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getLetAccess().getEqualsSignKeyword_1_0_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__Alternatives_1_0_3"


    // $ANTLR start "rule__Let__Alternatives_1_1_1"
    // InternalMath.g:296:1: rule__Let__Alternatives_1_1_1 : ( ( 'in' ) | ( ' in ' ) );
    public final void rule__Let__Alternatives_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:300:1: ( ( 'in' ) | ( ' in ' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMath.g:301:2: ( 'in' )
                    {
                    // InternalMath.g:301:2: ( 'in' )
                    // InternalMath.g:302:3: 'in'
                    {
                     before(grammarAccess.getLetAccess().getInKeyword_1_1_1_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getLetAccess().getInKeyword_1_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:307:2: ( ' in ' )
                    {
                    // InternalMath.g:307:2: ( ' in ' )
                    // InternalMath.g:308:3: ' in '
                    {
                     before(grammarAccess.getLetAccess().getInKeyword_1_1_1_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getLetAccess().getInKeyword_1_1_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__Alternatives_1_1_1"


    // $ANTLR start "rule__Let__Alternatives_1_2_1"
    // InternalMath.g:317:1: rule__Let__Alternatives_1_2_1 : ( ( 'end' ) | ( ' end ' ) );
    public final void rule__Let__Alternatives_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:321:1: ( ( 'end' ) | ( ' end ' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMath.g:322:2: ( 'end' )
                    {
                    // InternalMath.g:322:2: ( 'end' )
                    // InternalMath.g:323:3: 'end'
                    {
                     before(grammarAccess.getLetAccess().getEndKeyword_1_2_1_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getLetAccess().getEndKeyword_1_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:328:2: ( ' end ' )
                    {
                    // InternalMath.g:328:2: ( ' end ' )
                    // InternalMath.g:329:3: ' end '
                    {
                     before(grammarAccess.getLetAccess().getEndKeyword_1_2_1_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getLetAccess().getEndKeyword_1_2_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__Alternatives_1_2_1"


    // $ANTLR start "rule__PlusMinus__Alternatives_1"
    // InternalMath.g:338:1: rule__PlusMinus__Alternatives_1 : ( ( ( rule__PlusMinus__Group_1_0__0 ) ) | ( ( rule__PlusMinus__Group_1_1__0 ) ) );
    public final void rule__PlusMinus__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:342:1: ( ( ( rule__PlusMinus__Group_1_0__0 ) ) | ( ( rule__PlusMinus__Group_1_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            else if ( (LA6_0==21) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMath.g:343:2: ( ( rule__PlusMinus__Group_1_0__0 ) )
                    {
                    // InternalMath.g:343:2: ( ( rule__PlusMinus__Group_1_0__0 ) )
                    // InternalMath.g:344:3: ( rule__PlusMinus__Group_1_0__0 )
                    {
                     before(grammarAccess.getPlusMinusAccess().getGroup_1_0()); 
                    // InternalMath.g:345:3: ( rule__PlusMinus__Group_1_0__0 )
                    // InternalMath.g:345:4: rule__PlusMinus__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusMinus__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusMinusAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:349:2: ( ( rule__PlusMinus__Group_1_1__0 ) )
                    {
                    // InternalMath.g:349:2: ( ( rule__PlusMinus__Group_1_1__0 ) )
                    // InternalMath.g:350:3: ( rule__PlusMinus__Group_1_1__0 )
                    {
                     before(grammarAccess.getPlusMinusAccess().getGroup_1_1()); 
                    // InternalMath.g:351:3: ( rule__PlusMinus__Group_1_1__0 )
                    // InternalMath.g:351:4: rule__PlusMinus__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusMinus__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusMinusAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Alternatives_1"


    // $ANTLR start "rule__Term__Alternatives_1"
    // InternalMath.g:359:1: rule__Term__Alternatives_1 : ( ( ( rule__Term__Group_1_0__0 ) ) | ( ( rule__Term__Group_1_1__0 ) ) );
    public final void rule__Term__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:363:1: ( ( ( rule__Term__Group_1_0__0 ) ) | ( ( rule__Term__Group_1_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            else if ( (LA7_0==23) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMath.g:364:2: ( ( rule__Term__Group_1_0__0 ) )
                    {
                    // InternalMath.g:364:2: ( ( rule__Term__Group_1_0__0 ) )
                    // InternalMath.g:365:3: ( rule__Term__Group_1_0__0 )
                    {
                     before(grammarAccess.getTermAccess().getGroup_1_0()); 
                    // InternalMath.g:366:3: ( rule__Term__Group_1_0__0 )
                    // InternalMath.g:366:4: rule__Term__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Term__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:370:2: ( ( rule__Term__Group_1_1__0 ) )
                    {
                    // InternalMath.g:370:2: ( ( rule__Term__Group_1_1__0 ) )
                    // InternalMath.g:371:3: ( rule__Term__Group_1_1__0 )
                    {
                     before(grammarAccess.getTermAccess().getGroup_1_1()); 
                    // InternalMath.g:372:3: ( rule__Term__Group_1_1__0 )
                    // InternalMath.g:372:4: rule__Term__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Term__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Alternatives_1"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalMath.g:380:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ( rule__Primary__Group_2__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:384:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ( rule__Primary__Group_2__0 ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt8=1;
                }
                break;
            case RULE_ID:
                {
                alt8=2;
                }
                break;
            case 24:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMath.g:385:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalMath.g:385:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalMath.g:386:3: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // InternalMath.g:387:3: ( rule__Primary__Group_0__0 )
                    // InternalMath.g:387:4: rule__Primary__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:391:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalMath.g:391:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalMath.g:392:3: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // InternalMath.g:393:3: ( rule__Primary__Group_1__0 )
                    // InternalMath.g:393:4: rule__Primary__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMath.g:397:2: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // InternalMath.g:397:2: ( ( rule__Primary__Group_2__0 ) )
                    // InternalMath.g:398:3: ( rule__Primary__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    // InternalMath.g:399:3: ( rule__Primary__Group_2__0 )
                    // InternalMath.g:399:4: rule__Primary__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__Var__Group__0"
    // InternalMath.g:407:1: rule__Var__Group__0 : rule__Var__Group__0__Impl rule__Var__Group__1 ;
    public final void rule__Var__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:411:1: ( rule__Var__Group__0__Impl rule__Var__Group__1 )
            // InternalMath.g:412:2: rule__Var__Group__0__Impl rule__Var__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Var__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Var__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group__0"


    // $ANTLR start "rule__Var__Group__0__Impl"
    // InternalMath.g:419:1: rule__Var__Group__0__Impl : ( ruleLet ) ;
    public final void rule__Var__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:423:1: ( ( ruleLet ) )
            // InternalMath.g:424:1: ( ruleLet )
            {
            // InternalMath.g:424:1: ( ruleLet )
            // InternalMath.g:425:2: ruleLet
            {
             before(grammarAccess.getVarAccess().getLetParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleLet();

            state._fsp--;

             after(grammarAccess.getVarAccess().getLetParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group__0__Impl"


    // $ANTLR start "rule__Var__Group__1"
    // InternalMath.g:434:1: rule__Var__Group__1 : rule__Var__Group__1__Impl ;
    public final void rule__Var__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:438:1: ( rule__Var__Group__1__Impl )
            // InternalMath.g:439:2: rule__Var__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Var__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group__1"


    // $ANTLR start "rule__Var__Group__1__Impl"
    // InternalMath.g:445:1: rule__Var__Group__1__Impl : ( ( rule__Var__Group_1__0 )* ) ;
    public final void rule__Var__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:449:1: ( ( ( rule__Var__Group_1__0 )* ) )
            // InternalMath.g:450:1: ( ( rule__Var__Group_1__0 )* )
            {
            // InternalMath.g:450:1: ( ( rule__Var__Group_1__0 )* )
            // InternalMath.g:451:2: ( rule__Var__Group_1__0 )*
            {
             before(grammarAccess.getVarAccess().getGroup_1()); 
            // InternalMath.g:452:2: ( rule__Var__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMath.g:452:3: rule__Var__Group_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Var__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getVarAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group__1__Impl"


    // $ANTLR start "rule__Var__Group_1__0"
    // InternalMath.g:461:1: rule__Var__Group_1__0 : rule__Var__Group_1__0__Impl rule__Var__Group_1__1 ;
    public final void rule__Var__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:465:1: ( rule__Var__Group_1__0__Impl rule__Var__Group_1__1 )
            // InternalMath.g:466:2: rule__Var__Group_1__0__Impl rule__Var__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Var__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Var__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group_1__0"


    // $ANTLR start "rule__Var__Group_1__0__Impl"
    // InternalMath.g:473:1: rule__Var__Group_1__0__Impl : ( () ) ;
    public final void rule__Var__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:477:1: ( ( () ) )
            // InternalMath.g:478:1: ( () )
            {
            // InternalMath.g:478:1: ( () )
            // InternalMath.g:479:2: ()
            {
             before(grammarAccess.getVarAccess().getVarLeftAction_1_0()); 
            // InternalMath.g:480:2: ()
            // InternalMath.g:480:3: 
            {
            }

             after(grammarAccess.getVarAccess().getVarLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group_1__0__Impl"


    // $ANTLR start "rule__Var__Group_1__1"
    // InternalMath.g:488:1: rule__Var__Group_1__1 : rule__Var__Group_1__1__Impl rule__Var__Group_1__2 ;
    public final void rule__Var__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:492:1: ( rule__Var__Group_1__1__Impl rule__Var__Group_1__2 )
            // InternalMath.g:493:2: rule__Var__Group_1__1__Impl rule__Var__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__Var__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Var__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group_1__1"


    // $ANTLR start "rule__Var__Group_1__1__Impl"
    // InternalMath.g:500:1: rule__Var__Group_1__1__Impl : ( 'var ' ) ;
    public final void rule__Var__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:504:1: ( ( 'var ' ) )
            // InternalMath.g:505:1: ( 'var ' )
            {
            // InternalMath.g:505:1: ( 'var ' )
            // InternalMath.g:506:2: 'var '
            {
             before(grammarAccess.getVarAccess().getVarKeyword_1_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getVarAccess().getVarKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group_1__1__Impl"


    // $ANTLR start "rule__Var__Group_1__2"
    // InternalMath.g:515:1: rule__Var__Group_1__2 : rule__Var__Group_1__2__Impl rule__Var__Group_1__3 ;
    public final void rule__Var__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:519:1: ( rule__Var__Group_1__2__Impl rule__Var__Group_1__3 )
            // InternalMath.g:520:2: rule__Var__Group_1__2__Impl rule__Var__Group_1__3
            {
            pushFollow(FOLLOW_6);
            rule__Var__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Var__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group_1__2"


    // $ANTLR start "rule__Var__Group_1__2__Impl"
    // InternalMath.g:527:1: rule__Var__Group_1__2__Impl : ( ( rule__Var__NameAssignment_1_2 ) ) ;
    public final void rule__Var__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:531:1: ( ( ( rule__Var__NameAssignment_1_2 ) ) )
            // InternalMath.g:532:1: ( ( rule__Var__NameAssignment_1_2 ) )
            {
            // InternalMath.g:532:1: ( ( rule__Var__NameAssignment_1_2 ) )
            // InternalMath.g:533:2: ( rule__Var__NameAssignment_1_2 )
            {
             before(grammarAccess.getVarAccess().getNameAssignment_1_2()); 
            // InternalMath.g:534:2: ( rule__Var__NameAssignment_1_2 )
            // InternalMath.g:534:3: rule__Var__NameAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Var__NameAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getVarAccess().getNameAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group_1__2__Impl"


    // $ANTLR start "rule__Var__Group_1__3"
    // InternalMath.g:542:1: rule__Var__Group_1__3 : rule__Var__Group_1__3__Impl rule__Var__Group_1__4 ;
    public final void rule__Var__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:546:1: ( rule__Var__Group_1__3__Impl rule__Var__Group_1__4 )
            // InternalMath.g:547:2: rule__Var__Group_1__3__Impl rule__Var__Group_1__4
            {
            pushFollow(FOLLOW_7);
            rule__Var__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Var__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group_1__3"


    // $ANTLR start "rule__Var__Group_1__3__Impl"
    // InternalMath.g:554:1: rule__Var__Group_1__3__Impl : ( ' = ' ) ;
    public final void rule__Var__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:558:1: ( ( ' = ' ) )
            // InternalMath.g:559:1: ( ' = ' )
            {
            // InternalMath.g:559:1: ( ' = ' )
            // InternalMath.g:560:2: ' = '
            {
             before(grammarAccess.getVarAccess().getSpaceEqualsSignSpaceKeyword_1_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getVarAccess().getSpaceEqualsSignSpaceKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group_1__3__Impl"


    // $ANTLR start "rule__Var__Group_1__4"
    // InternalMath.g:569:1: rule__Var__Group_1__4 : rule__Var__Group_1__4__Impl ;
    public final void rule__Var__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:573:1: ( rule__Var__Group_1__4__Impl )
            // InternalMath.g:574:2: rule__Var__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Var__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group_1__4"


    // $ANTLR start "rule__Var__Group_1__4__Impl"
    // InternalMath.g:580:1: rule__Var__Group_1__4__Impl : ( ( rule__Var__RightAssignment_1_4 ) ) ;
    public final void rule__Var__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:584:1: ( ( ( rule__Var__RightAssignment_1_4 ) ) )
            // InternalMath.g:585:1: ( ( rule__Var__RightAssignment_1_4 ) )
            {
            // InternalMath.g:585:1: ( ( rule__Var__RightAssignment_1_4 ) )
            // InternalMath.g:586:2: ( rule__Var__RightAssignment_1_4 )
            {
             before(grammarAccess.getVarAccess().getRightAssignment_1_4()); 
            // InternalMath.g:587:2: ( rule__Var__RightAssignment_1_4 )
            // InternalMath.g:587:3: rule__Var__RightAssignment_1_4
            {
            pushFollow(FOLLOW_2);
            rule__Var__RightAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getVarAccess().getRightAssignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__Group_1__4__Impl"


    // $ANTLR start "rule__Let__Group__0"
    // InternalMath.g:596:1: rule__Let__Group__0 : rule__Let__Group__0__Impl rule__Let__Group__1 ;
    public final void rule__Let__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:600:1: ( rule__Let__Group__0__Impl rule__Let__Group__1 )
            // InternalMath.g:601:2: rule__Let__Group__0__Impl rule__Let__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Let__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Let__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__Group__0"


    // $ANTLR start "rule__Let__Group__0__Impl"
    // InternalMath.g:608:1: rule__Let__Group__0__Impl : ( rulePlusMinus ) ;
    public final void rule__Let__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:612:1: ( ( rulePlusMinus ) )
            // InternalMath.g:613:1: ( rulePlusMinus )
            {
            // InternalMath.g:613:1: ( rulePlusMinus )
            // InternalMath.g:614:2: rulePlusMinus
            {
             before(grammarAccess.getLetAccess().getPlusMinusParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePlusMinus();

            state._fsp--;

             after(grammarAccess.getLetAccess().getPlusMinusParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__Group__0__Impl"


    // $ANTLR start "rule__Let__Group__1"
    // InternalMath.g:623:1: rule__Let__Group__1 : rule__Let__Group__1__Impl ;
    public final void rule__Let__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:627:1: ( rule__Let__Group__1__Impl )
            // InternalMath.g:628:2: rule__Let__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Let__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__Group__1"


    // $ANTLR start "rule__Let__Group__1__Impl"
    // InternalMath.g:634:1: rule__Let__Group__1__Impl : ( ( rule__Let__Alternatives_1 )* ) ;
    public final void rule__Let__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:638:1: ( ( ( rule__Let__Alternatives_1 )* ) )
            // InternalMath.g:639:1: ( ( rule__Let__Alternatives_1 )* )
            {
            // InternalMath.g:639:1: ( ( rule__Let__Alternatives_1 )* )
            // InternalMath.g:640:2: ( rule__Let__Alternatives_1 )*
            {
             before(grammarAccess.getLetAccess().getAlternatives_1()); 
            // InternalMath.g:641:2: ( rule__Let__Alternatives_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=11 && LA10_0<=12)||(LA10_0>=15 && LA10_0<=18)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMath.g:641:3: rule__Let__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Let__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getLetAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__Group__1__Impl"


    // $ANTLR start "rule__Let__Group_1_0__0"
    // InternalMath.g:650:1: rule__Let__Group_1_0__0 : rule__Let__Group_1_0__0__Impl rule__Let__Group_1_0__1 ;
    public final void rule__Let__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:654:1: ( rule__Let__Group_1_0__0__Impl rule__Let__Group_1_0__1 )
            // InternalMath.g:655:2: rule__Let__Group_1_0__0__Impl rule__Let__Group_1_0__1
            {
            pushFollow(FOLLOW_10);
            rule__Let__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Let__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__Group_1_0__0"


    // $ANTLR start "rule__Let__Group_1_0__0__Impl"
    // InternalMath.g:662:1: rule__Let__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Let__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:666:1: ( ( () ) )
            // InternalMath.g:667:1: ( () )
            {
            // InternalMath.g:667:1: ( () )
            // InternalMath.g:668:2: ()
            {
             before(grammarAccess.getLetAccess().getLetLeftAction_1_0_0()); 
            // InternalMath.g:669:2: ()
            // InternalMath.g:669:3: 
            {
            }

             after(grammarAccess.getLetAccess().getLetLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__Group_1_0__0__Impl"


    // $ANTLR start "rule__Let__Group_1_0__1"
    // InternalMath.g:677:1: rule__Let__Group_1_0__1 : rule__Let__Group_1_0__1__Impl rule__Let__Group_1_0__2 ;
    public final void rule__Let__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:681:1: ( rule__Let__Group_1_0__1__Impl rule__Let__Group_1_0__2 )
            // InternalMath.g:682:2: rule__Let__Group_1_0__1__Impl rule__Let__Group_1_0__2
            {
            pushFollow(FOLLOW_5);
            rule__Let__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Let__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__Group_1_0__1"


    // $ANTLR start "rule__Let__Group_1_0__1__Impl"
    // InternalMath.g:689:1: rule__Let__Group_1_0__1__Impl : ( ( rule__Let__Alternatives_1_0_1 ) ) ;
    public final void rule__Let__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:693:1: ( ( ( rule__Let__Alternatives_1_0_1 ) ) )
            // InternalMath.g:694:1: ( ( rule__Let__Alternatives_1_0_1 ) )
            {
            // InternalMath.g:694:1: ( ( rule__Let__Alternatives_1_0_1 ) )
            // InternalMath.g:695:2: ( rule__Let__Alternatives_1_0_1 )
            {
             before(grammarAccess.getLetAccess().getAlternatives_1_0_1()); 
            // InternalMath.g:696:2: ( rule__Let__Alternatives_1_0_1 )
            // InternalMath.g:696:3: rule__Let__Alternatives_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Let__Alternatives_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getLetAccess().getAlternatives_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__Group_1_0__1__Impl"


    // $ANTLR start "rule__Let__Group_1_0__2"
    // InternalMath.g:704:1: rule__Let__Group_1_0__2 : rule__Let__Group_1_0__2__Impl rule__Let__Group_1_0__3 ;
    public final void rule__Let__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:708:1: ( rule__Let__Group_1_0__2__Impl rule__Let__Group_1_0__3 )
            // InternalMath.g:709:2: rule__Let__Group_1_0__2__Impl rule__Let__Group_1_0__3
            {
            pushFollow(FOLLOW_11);
            rule__Let__Group_1_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Let__Group_1_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__Group_1_0__2"


    // $ANTLR start "rule__Let__Group_1_0__2__Impl"
    // InternalMath.g:716:1: rule__Let__Group_1_0__2__Impl : ( ( rule__Let__NameAssignment_1_0_2 ) ) ;
    public final void rule__Let__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:720:1: ( ( ( rule__Let__NameAssignment_1_0_2 ) ) )
            // InternalMath.g:721:1: ( ( rule__Let__NameAssignment_1_0_2 ) )
            {
            // InternalMath.g:721:1: ( ( rule__Let__NameAssignment_1_0_2 ) )
            // InternalMath.g:722:2: ( rule__Let__NameAssignment_1_0_2 )
            {
             before(grammarAccess.getLetAccess().getNameAssignment_1_0_2()); 
            // InternalMath.g:723:2: ( rule__Let__NameAssignment_1_0_2 )
            // InternalMath.g:723:3: rule__Let__NameAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Let__NameAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getLetAccess().getNameAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__Group_1_0__2__Impl"


    // $ANTLR start "rule__Let__Group_1_0__3"
    // InternalMath.g:731:1: rule__Let__Group_1_0__3 : rule__Let__Group_1_0__3__Impl rule__Let__Group_1_0__4 ;
    public final void rule__Let__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:735:1: ( rule__Let__Group_1_0__3__Impl rule__Let__Group_1_0__4 )
            // InternalMath.g:736:2: rule__Let__Group_1_0__3__Impl rule__Let__Group_1_0__4
            {
            pushFollow(FOLLOW_7);
            rule__Let__Group_1_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Let__Group_1_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__Group_1_0__3"


    // $ANTLR start "rule__Let__Group_1_0__3__Impl"
    // InternalMath.g:743:1: rule__Let__Group_1_0__3__Impl : ( ( rule__Let__Alternatives_1_0_3 ) ) ;
    public final void rule__Let__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:747:1: ( ( ( rule__Let__Alternatives_1_0_3 ) ) )
            // InternalMath.g:748:1: ( ( rule__Let__Alternatives_1_0_3 ) )
            {
            // InternalMath.g:748:1: ( ( rule__Let__Alternatives_1_0_3 ) )
            // InternalMath.g:749:2: ( rule__Let__Alternatives_1_0_3 )
            {
             before(grammarAccess.getLetAccess().getAlternatives_1_0_3()); 
            // InternalMath.g:750:2: ( rule__Let__Alternatives_1_0_3 )
            // InternalMath.g:750:3: rule__Let__Alternatives_1_0_3
            {
            pushFollow(FOLLOW_2);
            rule__Let__Alternatives_1_0_3();

            state._fsp--;


            }

             after(grammarAccess.getLetAccess().getAlternatives_1_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__Group_1_0__3__Impl"


    // $ANTLR start "rule__Let__Group_1_0__4"
    // InternalMath.g:758:1: rule__Let__Group_1_0__4 : rule__Let__Group_1_0__4__Impl ;
    public final void rule__Let__Group_1_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:762:1: ( rule__Let__Group_1_0__4__Impl )
            // InternalMath.g:763:2: rule__Let__Group_1_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Let__Group_1_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__Group_1_0__4"


    // $ANTLR start "rule__Let__Group_1_0__4__Impl"
    // InternalMath.g:769:1: rule__Let__Group_1_0__4__Impl : ( ( rule__Let__RightAssignment_1_0_4 ) ) ;
    public final void rule__Let__Group_1_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:773:1: ( ( ( rule__Let__RightAssignment_1_0_4 ) ) )
            // InternalMath.g:774:1: ( ( rule__Let__RightAssignment_1_0_4 ) )
            {
            // InternalMath.g:774:1: ( ( rule__Let__RightAssignment_1_0_4 ) )
            // InternalMath.g:775:2: ( rule__Let__RightAssignment_1_0_4 )
            {
             before(grammarAccess.getLetAccess().getRightAssignment_1_0_4()); 
            // InternalMath.g:776:2: ( rule__Let__RightAssignment_1_0_4 )
            // InternalMath.g:776:3: rule__Let__RightAssignment_1_0_4
            {
            pushFollow(FOLLOW_2);
            rule__Let__RightAssignment_1_0_4();

            state._fsp--;


            }

             after(grammarAccess.getLetAccess().getRightAssignment_1_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__Group_1_0__4__Impl"


    // $ANTLR start "rule__Let__Group_1_1__0"
    // InternalMath.g:785:1: rule__Let__Group_1_1__0 : rule__Let__Group_1_1__0__Impl rule__Let__Group_1_1__1 ;
    public final void rule__Let__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:789:1: ( rule__Let__Group_1_1__0__Impl rule__Let__Group_1_1__1 )
            // InternalMath.g:790:2: rule__Let__Group_1_1__0__Impl rule__Let__Group_1_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Let__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Let__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__Group_1_1__0"


    // $ANTLR start "rule__Let__Group_1_1__0__Impl"
    // InternalMath.g:797:1: rule__Let__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Let__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:801:1: ( ( () ) )
            // InternalMath.g:802:1: ( () )
            {
            // InternalMath.g:802:1: ( () )
            // InternalMath.g:803:2: ()
            {
             before(grammarAccess.getLetAccess().getInLeftAction_1_1_0()); 
            // InternalMath.g:804:2: ()
            // InternalMath.g:804:3: 
            {
            }

             after(grammarAccess.getLetAccess().getInLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__Group_1_1__0__Impl"


    // $ANTLR start "rule__Let__Group_1_1__1"
    // InternalMath.g:812:1: rule__Let__Group_1_1__1 : rule__Let__Group_1_1__1__Impl rule__Let__Group_1_1__2 ;
    public final void rule__Let__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:816:1: ( rule__Let__Group_1_1__1__Impl rule__Let__Group_1_1__2 )
            // InternalMath.g:817:2: rule__Let__Group_1_1__1__Impl rule__Let__Group_1_1__2
            {
            pushFollow(FOLLOW_7);
            rule__Let__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Let__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__Group_1_1__1"


    // $ANTLR start "rule__Let__Group_1_1__1__Impl"
    // InternalMath.g:824:1: rule__Let__Group_1_1__1__Impl : ( ( rule__Let__Alternatives_1_1_1 ) ) ;
    public final void rule__Let__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:828:1: ( ( ( rule__Let__Alternatives_1_1_1 ) ) )
            // InternalMath.g:829:1: ( ( rule__Let__Alternatives_1_1_1 ) )
            {
            // InternalMath.g:829:1: ( ( rule__Let__Alternatives_1_1_1 ) )
            // InternalMath.g:830:2: ( rule__Let__Alternatives_1_1_1 )
            {
             before(grammarAccess.getLetAccess().getAlternatives_1_1_1()); 
            // InternalMath.g:831:2: ( rule__Let__Alternatives_1_1_1 )
            // InternalMath.g:831:3: rule__Let__Alternatives_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Let__Alternatives_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLetAccess().getAlternatives_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__Group_1_1__1__Impl"


    // $ANTLR start "rule__Let__Group_1_1__2"
    // InternalMath.g:839:1: rule__Let__Group_1_1__2 : rule__Let__Group_1_1__2__Impl ;
    public final void rule__Let__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:843:1: ( rule__Let__Group_1_1__2__Impl )
            // InternalMath.g:844:2: rule__Let__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Let__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__Group_1_1__2"


    // $ANTLR start "rule__Let__Group_1_1__2__Impl"
    // InternalMath.g:850:1: rule__Let__Group_1_1__2__Impl : ( ( rule__Let__RightAssignment_1_1_2 ) ) ;
    public final void rule__Let__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:854:1: ( ( ( rule__Let__RightAssignment_1_1_2 ) ) )
            // InternalMath.g:855:1: ( ( rule__Let__RightAssignment_1_1_2 ) )
            {
            // InternalMath.g:855:1: ( ( rule__Let__RightAssignment_1_1_2 ) )
            // InternalMath.g:856:2: ( rule__Let__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getLetAccess().getRightAssignment_1_1_2()); 
            // InternalMath.g:857:2: ( rule__Let__RightAssignment_1_1_2 )
            // InternalMath.g:857:3: rule__Let__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Let__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getLetAccess().getRightAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__Group_1_1__2__Impl"


    // $ANTLR start "rule__Let__Group_1_2__0"
    // InternalMath.g:866:1: rule__Let__Group_1_2__0 : rule__Let__Group_1_2__0__Impl rule__Let__Group_1_2__1 ;
    public final void rule__Let__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:870:1: ( rule__Let__Group_1_2__0__Impl rule__Let__Group_1_2__1 )
            // InternalMath.g:871:2: rule__Let__Group_1_2__0__Impl rule__Let__Group_1_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Let__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Let__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__Group_1_2__0"


    // $ANTLR start "rule__Let__Group_1_2__0__Impl"
    // InternalMath.g:878:1: rule__Let__Group_1_2__0__Impl : ( () ) ;
    public final void rule__Let__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:882:1: ( ( () ) )
            // InternalMath.g:883:1: ( () )
            {
            // InternalMath.g:883:1: ( () )
            // InternalMath.g:884:2: ()
            {
             before(grammarAccess.getLetAccess().getEndLeftAction_1_2_0()); 
            // InternalMath.g:885:2: ()
            // InternalMath.g:885:3: 
            {
            }

             after(grammarAccess.getLetAccess().getEndLeftAction_1_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__Group_1_2__0__Impl"


    // $ANTLR start "rule__Let__Group_1_2__1"
    // InternalMath.g:893:1: rule__Let__Group_1_2__1 : rule__Let__Group_1_2__1__Impl rule__Let__Group_1_2__2 ;
    public final void rule__Let__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:897:1: ( rule__Let__Group_1_2__1__Impl rule__Let__Group_1_2__2 )
            // InternalMath.g:898:2: rule__Let__Group_1_2__1__Impl rule__Let__Group_1_2__2
            {
            pushFollow(FOLLOW_7);
            rule__Let__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Let__Group_1_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__Group_1_2__1"


    // $ANTLR start "rule__Let__Group_1_2__1__Impl"
    // InternalMath.g:905:1: rule__Let__Group_1_2__1__Impl : ( ( rule__Let__Alternatives_1_2_1 ) ) ;
    public final void rule__Let__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:909:1: ( ( ( rule__Let__Alternatives_1_2_1 ) ) )
            // InternalMath.g:910:1: ( ( rule__Let__Alternatives_1_2_1 ) )
            {
            // InternalMath.g:910:1: ( ( rule__Let__Alternatives_1_2_1 ) )
            // InternalMath.g:911:2: ( rule__Let__Alternatives_1_2_1 )
            {
             before(grammarAccess.getLetAccess().getAlternatives_1_2_1()); 
            // InternalMath.g:912:2: ( rule__Let__Alternatives_1_2_1 )
            // InternalMath.g:912:3: rule__Let__Alternatives_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Let__Alternatives_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLetAccess().getAlternatives_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__Group_1_2__1__Impl"


    // $ANTLR start "rule__Let__Group_1_2__2"
    // InternalMath.g:920:1: rule__Let__Group_1_2__2 : rule__Let__Group_1_2__2__Impl ;
    public final void rule__Let__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:924:1: ( rule__Let__Group_1_2__2__Impl )
            // InternalMath.g:925:2: rule__Let__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Let__Group_1_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__Group_1_2__2"


    // $ANTLR start "rule__Let__Group_1_2__2__Impl"
    // InternalMath.g:931:1: rule__Let__Group_1_2__2__Impl : ( ( rule__Let__RightAssignment_1_2_2 ) ) ;
    public final void rule__Let__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:935:1: ( ( ( rule__Let__RightAssignment_1_2_2 ) ) )
            // InternalMath.g:936:1: ( ( rule__Let__RightAssignment_1_2_2 ) )
            {
            // InternalMath.g:936:1: ( ( rule__Let__RightAssignment_1_2_2 ) )
            // InternalMath.g:937:2: ( rule__Let__RightAssignment_1_2_2 )
            {
             before(grammarAccess.getLetAccess().getRightAssignment_1_2_2()); 
            // InternalMath.g:938:2: ( rule__Let__RightAssignment_1_2_2 )
            // InternalMath.g:938:3: rule__Let__RightAssignment_1_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Let__RightAssignment_1_2_2();

            state._fsp--;


            }

             after(grammarAccess.getLetAccess().getRightAssignment_1_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__Group_1_2__2__Impl"


    // $ANTLR start "rule__PlusMinus__Group__0"
    // InternalMath.g:947:1: rule__PlusMinus__Group__0 : rule__PlusMinus__Group__0__Impl rule__PlusMinus__Group__1 ;
    public final void rule__PlusMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:951:1: ( rule__PlusMinus__Group__0__Impl rule__PlusMinus__Group__1 )
            // InternalMath.g:952:2: rule__PlusMinus__Group__0__Impl rule__PlusMinus__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__PlusMinus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group__0"


    // $ANTLR start "rule__PlusMinus__Group__0__Impl"
    // InternalMath.g:959:1: rule__PlusMinus__Group__0__Impl : ( ruleTerm ) ;
    public final void rule__PlusMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:963:1: ( ( ruleTerm ) )
            // InternalMath.g:964:1: ( ruleTerm )
            {
            // InternalMath.g:964:1: ( ruleTerm )
            // InternalMath.g:965:2: ruleTerm
            {
             before(grammarAccess.getPlusMinusAccess().getTermParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getPlusMinusAccess().getTermParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group__0__Impl"


    // $ANTLR start "rule__PlusMinus__Group__1"
    // InternalMath.g:974:1: rule__PlusMinus__Group__1 : rule__PlusMinus__Group__1__Impl ;
    public final void rule__PlusMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:978:1: ( rule__PlusMinus__Group__1__Impl )
            // InternalMath.g:979:2: rule__PlusMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group__1"


    // $ANTLR start "rule__PlusMinus__Group__1__Impl"
    // InternalMath.g:985:1: rule__PlusMinus__Group__1__Impl : ( ( rule__PlusMinus__Alternatives_1 )* ) ;
    public final void rule__PlusMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:989:1: ( ( ( rule__PlusMinus__Alternatives_1 )* ) )
            // InternalMath.g:990:1: ( ( rule__PlusMinus__Alternatives_1 )* )
            {
            // InternalMath.g:990:1: ( ( rule__PlusMinus__Alternatives_1 )* )
            // InternalMath.g:991:2: ( rule__PlusMinus__Alternatives_1 )*
            {
             before(grammarAccess.getPlusMinusAccess().getAlternatives_1()); 
            // InternalMath.g:992:2: ( rule__PlusMinus__Alternatives_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=20 && LA11_0<=21)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMath.g:992:3: rule__PlusMinus__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__PlusMinus__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getPlusMinusAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group__1__Impl"


    // $ANTLR start "rule__PlusMinus__Group_1_0__0"
    // InternalMath.g:1001:1: rule__PlusMinus__Group_1_0__0 : rule__PlusMinus__Group_1_0__0__Impl rule__PlusMinus__Group_1_0__1 ;
    public final void rule__PlusMinus__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1005:1: ( rule__PlusMinus__Group_1_0__0__Impl rule__PlusMinus__Group_1_0__1 )
            // InternalMath.g:1006:2: rule__PlusMinus__Group_1_0__0__Impl rule__PlusMinus__Group_1_0__1
            {
            pushFollow(FOLLOW_15);
            rule__PlusMinus__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1_0__0"


    // $ANTLR start "rule__PlusMinus__Group_1_0__0__Impl"
    // InternalMath.g:1013:1: rule__PlusMinus__Group_1_0__0__Impl : ( () ) ;
    public final void rule__PlusMinus__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1017:1: ( ( () ) )
            // InternalMath.g:1018:1: ( () )
            {
            // InternalMath.g:1018:1: ( () )
            // InternalMath.g:1019:2: ()
            {
             before(grammarAccess.getPlusMinusAccess().getPlusLeftAction_1_0_0()); 
            // InternalMath.g:1020:2: ()
            // InternalMath.g:1020:3: 
            {
            }

             after(grammarAccess.getPlusMinusAccess().getPlusLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1_0__0__Impl"


    // $ANTLR start "rule__PlusMinus__Group_1_0__1"
    // InternalMath.g:1028:1: rule__PlusMinus__Group_1_0__1 : rule__PlusMinus__Group_1_0__1__Impl rule__PlusMinus__Group_1_0__2 ;
    public final void rule__PlusMinus__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1032:1: ( rule__PlusMinus__Group_1_0__1__Impl rule__PlusMinus__Group_1_0__2 )
            // InternalMath.g:1033:2: rule__PlusMinus__Group_1_0__1__Impl rule__PlusMinus__Group_1_0__2
            {
            pushFollow(FOLLOW_7);
            rule__PlusMinus__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1_0__1"


    // $ANTLR start "rule__PlusMinus__Group_1_0__1__Impl"
    // InternalMath.g:1040:1: rule__PlusMinus__Group_1_0__1__Impl : ( '+' ) ;
    public final void rule__PlusMinus__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1044:1: ( ( '+' ) )
            // InternalMath.g:1045:1: ( '+' )
            {
            // InternalMath.g:1045:1: ( '+' )
            // InternalMath.g:1046:2: '+'
            {
             before(grammarAccess.getPlusMinusAccess().getPlusSignKeyword_1_0_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPlusMinusAccess().getPlusSignKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1_0__1__Impl"


    // $ANTLR start "rule__PlusMinus__Group_1_0__2"
    // InternalMath.g:1055:1: rule__PlusMinus__Group_1_0__2 : rule__PlusMinus__Group_1_0__2__Impl ;
    public final void rule__PlusMinus__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1059:1: ( rule__PlusMinus__Group_1_0__2__Impl )
            // InternalMath.g:1060:2: rule__PlusMinus__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1_0__2"


    // $ANTLR start "rule__PlusMinus__Group_1_0__2__Impl"
    // InternalMath.g:1066:1: rule__PlusMinus__Group_1_0__2__Impl : ( ( rule__PlusMinus__RightAssignment_1_0_2 ) ) ;
    public final void rule__PlusMinus__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1070:1: ( ( ( rule__PlusMinus__RightAssignment_1_0_2 ) ) )
            // InternalMath.g:1071:1: ( ( rule__PlusMinus__RightAssignment_1_0_2 ) )
            {
            // InternalMath.g:1071:1: ( ( rule__PlusMinus__RightAssignment_1_0_2 ) )
            // InternalMath.g:1072:2: ( rule__PlusMinus__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getPlusMinusAccess().getRightAssignment_1_0_2()); 
            // InternalMath.g:1073:2: ( rule__PlusMinus__RightAssignment_1_0_2 )
            // InternalMath.g:1073:3: rule__PlusMinus__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__RightAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getPlusMinusAccess().getRightAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1_0__2__Impl"


    // $ANTLR start "rule__PlusMinus__Group_1_1__0"
    // InternalMath.g:1082:1: rule__PlusMinus__Group_1_1__0 : rule__PlusMinus__Group_1_1__0__Impl rule__PlusMinus__Group_1_1__1 ;
    public final void rule__PlusMinus__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1086:1: ( rule__PlusMinus__Group_1_1__0__Impl rule__PlusMinus__Group_1_1__1 )
            // InternalMath.g:1087:2: rule__PlusMinus__Group_1_1__0__Impl rule__PlusMinus__Group_1_1__1
            {
            pushFollow(FOLLOW_13);
            rule__PlusMinus__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1_1__0"


    // $ANTLR start "rule__PlusMinus__Group_1_1__0__Impl"
    // InternalMath.g:1094:1: rule__PlusMinus__Group_1_1__0__Impl : ( () ) ;
    public final void rule__PlusMinus__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1098:1: ( ( () ) )
            // InternalMath.g:1099:1: ( () )
            {
            // InternalMath.g:1099:1: ( () )
            // InternalMath.g:1100:2: ()
            {
             before(grammarAccess.getPlusMinusAccess().getMinusLeftAction_1_1_0()); 
            // InternalMath.g:1101:2: ()
            // InternalMath.g:1101:3: 
            {
            }

             after(grammarAccess.getPlusMinusAccess().getMinusLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1_1__0__Impl"


    // $ANTLR start "rule__PlusMinus__Group_1_1__1"
    // InternalMath.g:1109:1: rule__PlusMinus__Group_1_1__1 : rule__PlusMinus__Group_1_1__1__Impl rule__PlusMinus__Group_1_1__2 ;
    public final void rule__PlusMinus__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1113:1: ( rule__PlusMinus__Group_1_1__1__Impl rule__PlusMinus__Group_1_1__2 )
            // InternalMath.g:1114:2: rule__PlusMinus__Group_1_1__1__Impl rule__PlusMinus__Group_1_1__2
            {
            pushFollow(FOLLOW_7);
            rule__PlusMinus__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1_1__1"


    // $ANTLR start "rule__PlusMinus__Group_1_1__1__Impl"
    // InternalMath.g:1121:1: rule__PlusMinus__Group_1_1__1__Impl : ( '-' ) ;
    public final void rule__PlusMinus__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1125:1: ( ( '-' ) )
            // InternalMath.g:1126:1: ( '-' )
            {
            // InternalMath.g:1126:1: ( '-' )
            // InternalMath.g:1127:2: '-'
            {
             before(grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1_1_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1_1__1__Impl"


    // $ANTLR start "rule__PlusMinus__Group_1_1__2"
    // InternalMath.g:1136:1: rule__PlusMinus__Group_1_1__2 : rule__PlusMinus__Group_1_1__2__Impl ;
    public final void rule__PlusMinus__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1140:1: ( rule__PlusMinus__Group_1_1__2__Impl )
            // InternalMath.g:1141:2: rule__PlusMinus__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1_1__2"


    // $ANTLR start "rule__PlusMinus__Group_1_1__2__Impl"
    // InternalMath.g:1147:1: rule__PlusMinus__Group_1_1__2__Impl : ( ( rule__PlusMinus__RightAssignment_1_1_2 ) ) ;
    public final void rule__PlusMinus__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1151:1: ( ( ( rule__PlusMinus__RightAssignment_1_1_2 ) ) )
            // InternalMath.g:1152:1: ( ( rule__PlusMinus__RightAssignment_1_1_2 ) )
            {
            // InternalMath.g:1152:1: ( ( rule__PlusMinus__RightAssignment_1_1_2 ) )
            // InternalMath.g:1153:2: ( rule__PlusMinus__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getPlusMinusAccess().getRightAssignment_1_1_2()); 
            // InternalMath.g:1154:2: ( rule__PlusMinus__RightAssignment_1_1_2 )
            // InternalMath.g:1154:3: rule__PlusMinus__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPlusMinusAccess().getRightAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1_1__2__Impl"


    // $ANTLR start "rule__Term__Group__0"
    // InternalMath.g:1163:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1167:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // InternalMath.g:1168:2: rule__Term__Group__0__Impl rule__Term__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Term__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__0"


    // $ANTLR start "rule__Term__Group__0__Impl"
    // InternalMath.g:1175:1: rule__Term__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1179:1: ( ( rulePrimary ) )
            // InternalMath.g:1180:1: ( rulePrimary )
            {
            // InternalMath.g:1180:1: ( rulePrimary )
            // InternalMath.g:1181:2: rulePrimary
            {
             before(grammarAccess.getTermAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getTermAccess().getPrimaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__0__Impl"


    // $ANTLR start "rule__Term__Group__1"
    // InternalMath.g:1190:1: rule__Term__Group__1 : rule__Term__Group__1__Impl ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1194:1: ( rule__Term__Group__1__Impl )
            // InternalMath.g:1195:2: rule__Term__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__1"


    // $ANTLR start "rule__Term__Group__1__Impl"
    // InternalMath.g:1201:1: rule__Term__Group__1__Impl : ( ( rule__Term__Alternatives_1 )* ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1205:1: ( ( ( rule__Term__Alternatives_1 )* ) )
            // InternalMath.g:1206:1: ( ( rule__Term__Alternatives_1 )* )
            {
            // InternalMath.g:1206:1: ( ( rule__Term__Alternatives_1 )* )
            // InternalMath.g:1207:2: ( rule__Term__Alternatives_1 )*
            {
             before(grammarAccess.getTermAccess().getAlternatives_1()); 
            // InternalMath.g:1208:2: ( rule__Term__Alternatives_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=22 && LA12_0<=23)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMath.g:1208:3: rule__Term__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Term__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getTermAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__1__Impl"


    // $ANTLR start "rule__Term__Group_1_0__0"
    // InternalMath.g:1217:1: rule__Term__Group_1_0__0 : rule__Term__Group_1_0__0__Impl rule__Term__Group_1_0__1 ;
    public final void rule__Term__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1221:1: ( rule__Term__Group_1_0__0__Impl rule__Term__Group_1_0__1 )
            // InternalMath.g:1222:2: rule__Term__Group_1_0__0__Impl rule__Term__Group_1_0__1
            {
            pushFollow(FOLLOW_18);
            rule__Term__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_0__0"


    // $ANTLR start "rule__Term__Group_1_0__0__Impl"
    // InternalMath.g:1229:1: rule__Term__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Term__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1233:1: ( ( () ) )
            // InternalMath.g:1234:1: ( () )
            {
            // InternalMath.g:1234:1: ( () )
            // InternalMath.g:1235:2: ()
            {
             before(grammarAccess.getTermAccess().getMultLeftAction_1_0_0()); 
            // InternalMath.g:1236:2: ()
            // InternalMath.g:1236:3: 
            {
            }

             after(grammarAccess.getTermAccess().getMultLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_0__0__Impl"


    // $ANTLR start "rule__Term__Group_1_0__1"
    // InternalMath.g:1244:1: rule__Term__Group_1_0__1 : rule__Term__Group_1_0__1__Impl rule__Term__Group_1_0__2 ;
    public final void rule__Term__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1248:1: ( rule__Term__Group_1_0__1__Impl rule__Term__Group_1_0__2 )
            // InternalMath.g:1249:2: rule__Term__Group_1_0__1__Impl rule__Term__Group_1_0__2
            {
            pushFollow(FOLLOW_7);
            rule__Term__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_0__1"


    // $ANTLR start "rule__Term__Group_1_0__1__Impl"
    // InternalMath.g:1256:1: rule__Term__Group_1_0__1__Impl : ( '*' ) ;
    public final void rule__Term__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1260:1: ( ( '*' ) )
            // InternalMath.g:1261:1: ( '*' )
            {
            // InternalMath.g:1261:1: ( '*' )
            // InternalMath.g:1262:2: '*'
            {
             before(grammarAccess.getTermAccess().getAsteriskKeyword_1_0_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTermAccess().getAsteriskKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_0__1__Impl"


    // $ANTLR start "rule__Term__Group_1_0__2"
    // InternalMath.g:1271:1: rule__Term__Group_1_0__2 : rule__Term__Group_1_0__2__Impl ;
    public final void rule__Term__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1275:1: ( rule__Term__Group_1_0__2__Impl )
            // InternalMath.g:1276:2: rule__Term__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_0__2"


    // $ANTLR start "rule__Term__Group_1_0__2__Impl"
    // InternalMath.g:1282:1: rule__Term__Group_1_0__2__Impl : ( ( rule__Term__RightAssignment_1_0_2 ) ) ;
    public final void rule__Term__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1286:1: ( ( ( rule__Term__RightAssignment_1_0_2 ) ) )
            // InternalMath.g:1287:1: ( ( rule__Term__RightAssignment_1_0_2 ) )
            {
            // InternalMath.g:1287:1: ( ( rule__Term__RightAssignment_1_0_2 ) )
            // InternalMath.g:1288:2: ( rule__Term__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getTermAccess().getRightAssignment_1_0_2()); 
            // InternalMath.g:1289:2: ( rule__Term__RightAssignment_1_0_2 )
            // InternalMath.g:1289:3: rule__Term__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Term__RightAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getRightAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_0__2__Impl"


    // $ANTLR start "rule__Term__Group_1_1__0"
    // InternalMath.g:1298:1: rule__Term__Group_1_1__0 : rule__Term__Group_1_1__0__Impl rule__Term__Group_1_1__1 ;
    public final void rule__Term__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1302:1: ( rule__Term__Group_1_1__0__Impl rule__Term__Group_1_1__1 )
            // InternalMath.g:1303:2: rule__Term__Group_1_1__0__Impl rule__Term__Group_1_1__1
            {
            pushFollow(FOLLOW_16);
            rule__Term__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_1__0"


    // $ANTLR start "rule__Term__Group_1_1__0__Impl"
    // InternalMath.g:1310:1: rule__Term__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Term__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1314:1: ( ( () ) )
            // InternalMath.g:1315:1: ( () )
            {
            // InternalMath.g:1315:1: ( () )
            // InternalMath.g:1316:2: ()
            {
             before(grammarAccess.getTermAccess().getDivLeftAction_1_1_0()); 
            // InternalMath.g:1317:2: ()
            // InternalMath.g:1317:3: 
            {
            }

             after(grammarAccess.getTermAccess().getDivLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_1__0__Impl"


    // $ANTLR start "rule__Term__Group_1_1__1"
    // InternalMath.g:1325:1: rule__Term__Group_1_1__1 : rule__Term__Group_1_1__1__Impl rule__Term__Group_1_1__2 ;
    public final void rule__Term__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1329:1: ( rule__Term__Group_1_1__1__Impl rule__Term__Group_1_1__2 )
            // InternalMath.g:1330:2: rule__Term__Group_1_1__1__Impl rule__Term__Group_1_1__2
            {
            pushFollow(FOLLOW_7);
            rule__Term__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_1__1"


    // $ANTLR start "rule__Term__Group_1_1__1__Impl"
    // InternalMath.g:1337:1: rule__Term__Group_1_1__1__Impl : ( '/' ) ;
    public final void rule__Term__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1341:1: ( ( '/' ) )
            // InternalMath.g:1342:1: ( '/' )
            {
            // InternalMath.g:1342:1: ( '/' )
            // InternalMath.g:1343:2: '/'
            {
             before(grammarAccess.getTermAccess().getSolidusKeyword_1_1_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTermAccess().getSolidusKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_1__1__Impl"


    // $ANTLR start "rule__Term__Group_1_1__2"
    // InternalMath.g:1352:1: rule__Term__Group_1_1__2 : rule__Term__Group_1_1__2__Impl ;
    public final void rule__Term__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1356:1: ( rule__Term__Group_1_1__2__Impl )
            // InternalMath.g:1357:2: rule__Term__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_1__2"


    // $ANTLR start "rule__Term__Group_1_1__2__Impl"
    // InternalMath.g:1363:1: rule__Term__Group_1_1__2__Impl : ( ( rule__Term__RightAssignment_1_1_2 ) ) ;
    public final void rule__Term__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1367:1: ( ( ( rule__Term__RightAssignment_1_1_2 ) ) )
            // InternalMath.g:1368:1: ( ( rule__Term__RightAssignment_1_1_2 ) )
            {
            // InternalMath.g:1368:1: ( ( rule__Term__RightAssignment_1_1_2 ) )
            // InternalMath.g:1369:2: ( rule__Term__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getTermAccess().getRightAssignment_1_1_2()); 
            // InternalMath.g:1370:2: ( rule__Term__RightAssignment_1_1_2 )
            // InternalMath.g:1370:3: rule__Term__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Term__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getRightAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_0__0"
    // InternalMath.g:1379:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1383:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalMath.g:1384:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_19);
            rule__Primary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0"


    // $ANTLR start "rule__Primary__Group_0__0__Impl"
    // InternalMath.g:1391:1: rule__Primary__Group_0__0__Impl : ( () ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1395:1: ( ( () ) )
            // InternalMath.g:1396:1: ( () )
            {
            // InternalMath.g:1396:1: ( () )
            // InternalMath.g:1397:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getMyNumberAction_0_0()); 
            // InternalMath.g:1398:2: ()
            // InternalMath.g:1398:3: 
            {
            }

             after(grammarAccess.getPrimaryAccess().getMyNumberAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0__Impl"


    // $ANTLR start "rule__Primary__Group_0__1"
    // InternalMath.g:1406:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1410:1: ( rule__Primary__Group_0__1__Impl )
            // InternalMath.g:1411:2: rule__Primary__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__1"


    // $ANTLR start "rule__Primary__Group_0__1__Impl"
    // InternalMath.g:1417:1: rule__Primary__Group_0__1__Impl : ( ( rule__Primary__ValueAssignment_0_1 ) ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1421:1: ( ( ( rule__Primary__ValueAssignment_0_1 ) ) )
            // InternalMath.g:1422:1: ( ( rule__Primary__ValueAssignment_0_1 ) )
            {
            // InternalMath.g:1422:1: ( ( rule__Primary__ValueAssignment_0_1 ) )
            // InternalMath.g:1423:2: ( rule__Primary__ValueAssignment_0_1 )
            {
             before(grammarAccess.getPrimaryAccess().getValueAssignment_0_1()); 
            // InternalMath.g:1424:2: ( rule__Primary__ValueAssignment_0_1 )
            // InternalMath.g:1424:3: rule__Primary__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getValueAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__1__Impl"


    // $ANTLR start "rule__Primary__Group_1__0"
    // InternalMath.g:1433:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1437:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalMath.g:1438:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Primary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0"


    // $ANTLR start "rule__Primary__Group_1__0__Impl"
    // InternalMath.g:1445:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1449:1: ( ( () ) )
            // InternalMath.g:1450:1: ( () )
            {
            // InternalMath.g:1450:1: ( () )
            // InternalMath.g:1451:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getVariableUseAction_1_0()); 
            // InternalMath.g:1452:2: ()
            // InternalMath.g:1452:3: 
            {
            }

             after(grammarAccess.getPrimaryAccess().getVariableUseAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0__Impl"


    // $ANTLR start "rule__Primary__Group_1__1"
    // InternalMath.g:1460:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1464:1: ( rule__Primary__Group_1__1__Impl )
            // InternalMath.g:1465:2: rule__Primary__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__1"


    // $ANTLR start "rule__Primary__Group_1__1__Impl"
    // InternalMath.g:1471:1: rule__Primary__Group_1__1__Impl : ( ( rule__Primary__ValueAssignment_1_1 ) ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1475:1: ( ( ( rule__Primary__ValueAssignment_1_1 ) ) )
            // InternalMath.g:1476:1: ( ( rule__Primary__ValueAssignment_1_1 ) )
            {
            // InternalMath.g:1476:1: ( ( rule__Primary__ValueAssignment_1_1 ) )
            // InternalMath.g:1477:2: ( rule__Primary__ValueAssignment_1_1 )
            {
             before(grammarAccess.getPrimaryAccess().getValueAssignment_1_1()); 
            // InternalMath.g:1478:2: ( rule__Primary__ValueAssignment_1_1 )
            // InternalMath.g:1478:3: rule__Primary__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_2__0"
    // InternalMath.g:1487:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1491:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // InternalMath.g:1492:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__Primary__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__0"


    // $ANTLR start "rule__Primary__Group_2__0__Impl"
    // InternalMath.g:1499:1: rule__Primary__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1503:1: ( ( '(' ) )
            // InternalMath.g:1504:1: ( '(' )
            {
            // InternalMath.g:1504:1: ( '(' )
            // InternalMath.g:1505:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__0__Impl"


    // $ANTLR start "rule__Primary__Group_2__1"
    // InternalMath.g:1514:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1518:1: ( rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 )
            // InternalMath.g:1519:2: rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2
            {
            pushFollow(FOLLOW_20);
            rule__Primary__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__1"


    // $ANTLR start "rule__Primary__Group_2__1__Impl"
    // InternalMath.g:1526:1: rule__Primary__Group_2__1__Impl : ( ruleExp ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1530:1: ( ( ruleExp ) )
            // InternalMath.g:1531:1: ( ruleExp )
            {
            // InternalMath.g:1531:1: ( ruleExp )
            // InternalMath.g:1532:2: ruleExp
            {
             before(grammarAccess.getPrimaryAccess().getExpParserRuleCall_2_1()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExpParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__1__Impl"


    // $ANTLR start "rule__Primary__Group_2__2"
    // InternalMath.g:1541:1: rule__Primary__Group_2__2 : rule__Primary__Group_2__2__Impl ;
    public final void rule__Primary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1545:1: ( rule__Primary__Group_2__2__Impl )
            // InternalMath.g:1546:2: rule__Primary__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__2"


    // $ANTLR start "rule__Primary__Group_2__2__Impl"
    // InternalMath.g:1552:1: rule__Primary__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1556:1: ( ( ')' ) )
            // InternalMath.g:1557:1: ( ')' )
            {
            // InternalMath.g:1557:1: ( ')' )
            // InternalMath.g:1558:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_2__2__Impl"


    // $ANTLR start "rule__MathExp__ExpAssignment"
    // InternalMath.g:1568:1: rule__MathExp__ExpAssignment : ( ruleExp ) ;
    public final void rule__MathExp__ExpAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1572:1: ( ( ruleExp ) )
            // InternalMath.g:1573:2: ( ruleExp )
            {
            // InternalMath.g:1573:2: ( ruleExp )
            // InternalMath.g:1574:3: ruleExp
            {
             before(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__ExpAssignment"


    // $ANTLR start "rule__Var__NameAssignment_1_2"
    // InternalMath.g:1583:1: rule__Var__NameAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__Var__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1587:1: ( ( RULE_ID ) )
            // InternalMath.g:1588:2: ( RULE_ID )
            {
            // InternalMath.g:1588:2: ( RULE_ID )
            // InternalMath.g:1589:3: RULE_ID
            {
             before(grammarAccess.getVarAccess().getNameIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVarAccess().getNameIDTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__NameAssignment_1_2"


    // $ANTLR start "rule__Var__RightAssignment_1_4"
    // InternalMath.g:1598:1: rule__Var__RightAssignment_1_4 : ( ruleLet ) ;
    public final void rule__Var__RightAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1602:1: ( ( ruleLet ) )
            // InternalMath.g:1603:2: ( ruleLet )
            {
            // InternalMath.g:1603:2: ( ruleLet )
            // InternalMath.g:1604:3: ruleLet
            {
             before(grammarAccess.getVarAccess().getRightLetParserRuleCall_1_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLet();

            state._fsp--;

             after(grammarAccess.getVarAccess().getRightLetParserRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Var__RightAssignment_1_4"


    // $ANTLR start "rule__Let__NameAssignment_1_0_2"
    // InternalMath.g:1613:1: rule__Let__NameAssignment_1_0_2 : ( RULE_ID ) ;
    public final void rule__Let__NameAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1617:1: ( ( RULE_ID ) )
            // InternalMath.g:1618:2: ( RULE_ID )
            {
            // InternalMath.g:1618:2: ( RULE_ID )
            // InternalMath.g:1619:3: RULE_ID
            {
             before(grammarAccess.getLetAccess().getNameIDTerminalRuleCall_1_0_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLetAccess().getNameIDTerminalRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__NameAssignment_1_0_2"


    // $ANTLR start "rule__Let__RightAssignment_1_0_4"
    // InternalMath.g:1628:1: rule__Let__RightAssignment_1_0_4 : ( rulePlusMinus ) ;
    public final void rule__Let__RightAssignment_1_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1632:1: ( ( rulePlusMinus ) )
            // InternalMath.g:1633:2: ( rulePlusMinus )
            {
            // InternalMath.g:1633:2: ( rulePlusMinus )
            // InternalMath.g:1634:3: rulePlusMinus
            {
             before(grammarAccess.getLetAccess().getRightPlusMinusParserRuleCall_1_0_4_0()); 
            pushFollow(FOLLOW_2);
            rulePlusMinus();

            state._fsp--;

             after(grammarAccess.getLetAccess().getRightPlusMinusParserRuleCall_1_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__RightAssignment_1_0_4"


    // $ANTLR start "rule__Let__RightAssignment_1_1_2"
    // InternalMath.g:1643:1: rule__Let__RightAssignment_1_1_2 : ( rulePlusMinus ) ;
    public final void rule__Let__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1647:1: ( ( rulePlusMinus ) )
            // InternalMath.g:1648:2: ( rulePlusMinus )
            {
            // InternalMath.g:1648:2: ( rulePlusMinus )
            // InternalMath.g:1649:3: rulePlusMinus
            {
             before(grammarAccess.getLetAccess().getRightPlusMinusParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePlusMinus();

            state._fsp--;

             after(grammarAccess.getLetAccess().getRightPlusMinusParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__RightAssignment_1_1_2"


    // $ANTLR start "rule__Let__RightAssignment_1_2_2"
    // InternalMath.g:1658:1: rule__Let__RightAssignment_1_2_2 : ( rulePlusMinus ) ;
    public final void rule__Let__RightAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1662:1: ( ( rulePlusMinus ) )
            // InternalMath.g:1663:2: ( rulePlusMinus )
            {
            // InternalMath.g:1663:2: ( rulePlusMinus )
            // InternalMath.g:1664:3: rulePlusMinus
            {
             before(grammarAccess.getLetAccess().getRightPlusMinusParserRuleCall_1_2_2_0()); 
            pushFollow(FOLLOW_2);
            rulePlusMinus();

            state._fsp--;

             after(grammarAccess.getLetAccess().getRightPlusMinusParserRuleCall_1_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Let__RightAssignment_1_2_2"


    // $ANTLR start "rule__PlusMinus__RightAssignment_1_0_2"
    // InternalMath.g:1673:1: rule__PlusMinus__RightAssignment_1_0_2 : ( ruleTerm ) ;
    public final void rule__PlusMinus__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1677:1: ( ( ruleTerm ) )
            // InternalMath.g:1678:2: ( ruleTerm )
            {
            // InternalMath.g:1678:2: ( ruleTerm )
            // InternalMath.g:1679:3: ruleTerm
            {
             before(grammarAccess.getPlusMinusAccess().getRightTermParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getPlusMinusAccess().getRightTermParserRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__RightAssignment_1_0_2"


    // $ANTLR start "rule__PlusMinus__RightAssignment_1_1_2"
    // InternalMath.g:1688:1: rule__PlusMinus__RightAssignment_1_1_2 : ( ruleTerm ) ;
    public final void rule__PlusMinus__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1692:1: ( ( ruleTerm ) )
            // InternalMath.g:1693:2: ( ruleTerm )
            {
            // InternalMath.g:1693:2: ( ruleTerm )
            // InternalMath.g:1694:3: ruleTerm
            {
             before(grammarAccess.getPlusMinusAccess().getRightTermParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getPlusMinusAccess().getRightTermParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__RightAssignment_1_1_2"


    // $ANTLR start "rule__Term__RightAssignment_1_0_2"
    // InternalMath.g:1703:1: rule__Term__RightAssignment_1_0_2 : ( rulePrimary ) ;
    public final void rule__Term__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1707:1: ( ( rulePrimary ) )
            // InternalMath.g:1708:2: ( rulePrimary )
            {
            // InternalMath.g:1708:2: ( rulePrimary )
            // InternalMath.g:1709:3: rulePrimary
            {
             before(grammarAccess.getTermAccess().getRightPrimaryParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getTermAccess().getRightPrimaryParserRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__RightAssignment_1_0_2"


    // $ANTLR start "rule__Term__RightAssignment_1_1_2"
    // InternalMath.g:1718:1: rule__Term__RightAssignment_1_1_2 : ( rulePrimary ) ;
    public final void rule__Term__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1722:1: ( ( rulePrimary ) )
            // InternalMath.g:1723:2: ( rulePrimary )
            {
            // InternalMath.g:1723:2: ( rulePrimary )
            // InternalMath.g:1724:3: rulePrimary
            {
             before(grammarAccess.getTermAccess().getRightPrimaryParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getTermAccess().getRightPrimaryParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__RightAssignment_1_1_2"


    // $ANTLR start "rule__Primary__ValueAssignment_0_1"
    // InternalMath.g:1733:1: rule__Primary__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Primary__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1737:1: ( ( RULE_INT ) )
            // InternalMath.g:1738:2: ( RULE_INT )
            {
            // InternalMath.g:1738:2: ( RULE_INT )
            // InternalMath.g:1739:3: RULE_INT
            {
             before(grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ValueAssignment_0_1"


    // $ANTLR start "rule__Primary__ValueAssignment_1_1"
    // InternalMath.g:1748:1: rule__Primary__ValueAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Primary__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1752:1: ( ( RULE_ID ) )
            // InternalMath.g:1753:2: ( RULE_ID )
            {
            // InternalMath.g:1753:2: ( RULE_ID )
            // InternalMath.g:1754:3: RULE_ID
            {
             before(grammarAccess.getPrimaryAccess().getValueIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getValueIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ValueAssignment_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000079800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000079802L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});

}