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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "')'", "'program'", "'external'", "'('", "'var'", "'='", "'let'", "'in'", "'end'", "'+'", "'-'", "'*'", "'/'"
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



    // $ANTLR start "entryRuleProgram"
    // InternalMath.g:53:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalMath.g:54:1: ( ruleProgram EOF )
            // InternalMath.g:55:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalMath.g:62:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:66:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalMath.g:67:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalMath.g:67:2: ( ( rule__Program__Group__0 ) )
            // InternalMath.g:68:3: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // InternalMath.g:69:3: ( rule__Program__Group__0 )
            // InternalMath.g:69:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleExternal"
    // InternalMath.g:78:1: entryRuleExternal : ruleExternal EOF ;
    public final void entryRuleExternal() throws RecognitionException {
        try {
            // InternalMath.g:79:1: ( ruleExternal EOF )
            // InternalMath.g:80:1: ruleExternal EOF
            {
             before(grammarAccess.getExternalRule()); 
            pushFollow(FOLLOW_1);
            ruleExternal();

            state._fsp--;

             after(grammarAccess.getExternalRule()); 
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
    // $ANTLR end "entryRuleExternal"


    // $ANTLR start "ruleExternal"
    // InternalMath.g:87:1: ruleExternal : ( ( rule__External__Group__0 ) ) ;
    public final void ruleExternal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:91:2: ( ( ( rule__External__Group__0 ) ) )
            // InternalMath.g:92:2: ( ( rule__External__Group__0 ) )
            {
            // InternalMath.g:92:2: ( ( rule__External__Group__0 ) )
            // InternalMath.g:93:3: ( rule__External__Group__0 )
            {
             before(grammarAccess.getExternalAccess().getGroup()); 
            // InternalMath.g:94:3: ( rule__External__Group__0 )
            // InternalMath.g:94:4: rule__External__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__External__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalAccess().getGroup()); 

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
    // $ANTLR end "ruleExternal"


    // $ANTLR start "entryRuleType"
    // InternalMath.g:103:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMath.g:104:1: ( ruleType EOF )
            // InternalMath.g:105:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMath.g:112:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:116:2: ( ( ( rule__Type__Group__0 ) ) )
            // InternalMath.g:117:2: ( ( rule__Type__Group__0 ) )
            {
            // InternalMath.g:117:2: ( ( rule__Type__Group__0 ) )
            // InternalMath.g:118:3: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // InternalMath.g:119:3: ( rule__Type__Group__0 )
            // InternalMath.g:119:4: rule__Type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleVar"
    // InternalMath.g:128:1: entryRuleVar : ruleVar EOF ;
    public final void entryRuleVar() throws RecognitionException {
        try {
            // InternalMath.g:129:1: ( ruleVar EOF )
            // InternalMath.g:130:1: ruleVar EOF
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
    // InternalMath.g:137:1: ruleVar : ( ( rule__Var__Group__0 ) ) ;
    public final void ruleVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:141:2: ( ( ( rule__Var__Group__0 ) ) )
            // InternalMath.g:142:2: ( ( rule__Var__Group__0 ) )
            {
            // InternalMath.g:142:2: ( ( rule__Var__Group__0 ) )
            // InternalMath.g:143:3: ( rule__Var__Group__0 )
            {
             before(grammarAccess.getVarAccess().getGroup()); 
            // InternalMath.g:144:3: ( rule__Var__Group__0 )
            // InternalMath.g:144:4: rule__Var__Group__0
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
    // InternalMath.g:153:1: entryRuleLet : ruleLet EOF ;
    public final void entryRuleLet() throws RecognitionException {
        try {
            // InternalMath.g:154:1: ( ruleLet EOF )
            // InternalMath.g:155:1: ruleLet EOF
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
    // InternalMath.g:162:1: ruleLet : ( ( rule__Let__Group__0 ) ) ;
    public final void ruleLet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:166:2: ( ( ( rule__Let__Group__0 ) ) )
            // InternalMath.g:167:2: ( ( rule__Let__Group__0 ) )
            {
            // InternalMath.g:167:2: ( ( rule__Let__Group__0 ) )
            // InternalMath.g:168:3: ( rule__Let__Group__0 )
            {
             before(grammarAccess.getLetAccess().getGroup()); 
            // InternalMath.g:169:3: ( rule__Let__Group__0 )
            // InternalMath.g:169:4: rule__Let__Group__0
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
    // InternalMath.g:178:1: entryRulePlusMinus : rulePlusMinus EOF ;
    public final void entryRulePlusMinus() throws RecognitionException {
        try {
            // InternalMath.g:179:1: ( rulePlusMinus EOF )
            // InternalMath.g:180:1: rulePlusMinus EOF
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
    // InternalMath.g:187:1: rulePlusMinus : ( ( rule__PlusMinus__Group__0 ) ) ;
    public final void rulePlusMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:191:2: ( ( ( rule__PlusMinus__Group__0 ) ) )
            // InternalMath.g:192:2: ( ( rule__PlusMinus__Group__0 ) )
            {
            // InternalMath.g:192:2: ( ( rule__PlusMinus__Group__0 ) )
            // InternalMath.g:193:3: ( rule__PlusMinus__Group__0 )
            {
             before(grammarAccess.getPlusMinusAccess().getGroup()); 
            // InternalMath.g:194:3: ( rule__PlusMinus__Group__0 )
            // InternalMath.g:194:4: rule__PlusMinus__Group__0
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
    // InternalMath.g:203:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // InternalMath.g:204:1: ( ruleTerm EOF )
            // InternalMath.g:205:1: ruleTerm EOF
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
    // InternalMath.g:212:1: ruleTerm : ( ( rule__Term__Group__0 ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:216:2: ( ( ( rule__Term__Group__0 ) ) )
            // InternalMath.g:217:2: ( ( rule__Term__Group__0 ) )
            {
            // InternalMath.g:217:2: ( ( rule__Term__Group__0 ) )
            // InternalMath.g:218:3: ( rule__Term__Group__0 )
            {
             before(grammarAccess.getTermAccess().getGroup()); 
            // InternalMath.g:219:3: ( rule__Term__Group__0 )
            // InternalMath.g:219:4: rule__Term__Group__0
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


    // $ANTLR start "entryRuleExternalContent"
    // InternalMath.g:228:1: entryRuleExternalContent : ruleExternalContent EOF ;
    public final void entryRuleExternalContent() throws RecognitionException {
        try {
            // InternalMath.g:229:1: ( ruleExternalContent EOF )
            // InternalMath.g:230:1: ruleExternalContent EOF
            {
             before(grammarAccess.getExternalContentRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalContent();

            state._fsp--;

             after(grammarAccess.getExternalContentRule()); 
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
    // $ANTLR end "entryRuleExternalContent"


    // $ANTLR start "ruleExternalContent"
    // InternalMath.g:237:1: ruleExternalContent : ( ( rule__ExternalContent__Group__0 ) ) ;
    public final void ruleExternalContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:241:2: ( ( ( rule__ExternalContent__Group__0 ) ) )
            // InternalMath.g:242:2: ( ( rule__ExternalContent__Group__0 ) )
            {
            // InternalMath.g:242:2: ( ( rule__ExternalContent__Group__0 ) )
            // InternalMath.g:243:3: ( rule__ExternalContent__Group__0 )
            {
             before(grammarAccess.getExternalContentAccess().getGroup()); 
            // InternalMath.g:244:3: ( rule__ExternalContent__Group__0 )
            // InternalMath.g:244:4: rule__ExternalContent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalContent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalContentAccess().getGroup()); 

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
    // $ANTLR end "ruleExternalContent"


    // $ANTLR start "entryRulePrimary"
    // InternalMath.g:253:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalMath.g:254:1: ( rulePrimary EOF )
            // InternalMath.g:255:1: rulePrimary EOF
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
    // InternalMath.g:262:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:266:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalMath.g:267:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalMath.g:267:2: ( ( rule__Primary__Alternatives ) )
            // InternalMath.g:268:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalMath.g:269:3: ( rule__Primary__Alternatives )
            // InternalMath.g:269:4: rule__Primary__Alternatives
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


    // $ANTLR start "entryRuleParenthesis"
    // InternalMath.g:278:1: entryRuleParenthesis : ruleParenthesis EOF ;
    public final void entryRuleParenthesis() throws RecognitionException {
        try {
            // InternalMath.g:279:1: ( ruleParenthesis EOF )
            // InternalMath.g:280:1: ruleParenthesis EOF
            {
             before(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            ruleParenthesis();

            state._fsp--;

             after(grammarAccess.getParenthesisRule()); 
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
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalMath.g:287:1: ruleParenthesis : ( ( rule__Parenthesis__Group__0 ) ) ;
    public final void ruleParenthesis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:291:2: ( ( ( rule__Parenthesis__Group__0 ) ) )
            // InternalMath.g:292:2: ( ( rule__Parenthesis__Group__0 ) )
            {
            // InternalMath.g:292:2: ( ( rule__Parenthesis__Group__0 ) )
            // InternalMath.g:293:3: ( rule__Parenthesis__Group__0 )
            {
             before(grammarAccess.getParenthesisAccess().getGroup()); 
            // InternalMath.g:294:3: ( rule__Parenthesis__Group__0 )
            // InternalMath.g:294:4: rule__Parenthesis__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParenthesisAccess().getGroup()); 

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
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleVariableUse"
    // InternalMath.g:303:1: entryRuleVariableUse : ruleVariableUse EOF ;
    public final void entryRuleVariableUse() throws RecognitionException {
        try {
            // InternalMath.g:304:1: ( ruleVariableUse EOF )
            // InternalMath.g:305:1: ruleVariableUse EOF
            {
             before(grammarAccess.getVariableUseRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableUse();

            state._fsp--;

             after(grammarAccess.getVariableUseRule()); 
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
    // $ANTLR end "entryRuleVariableUse"


    // $ANTLR start "ruleVariableUse"
    // InternalMath.g:312:1: ruleVariableUse : ( ( rule__VariableUse__RefAssignment ) ) ;
    public final void ruleVariableUse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:316:2: ( ( ( rule__VariableUse__RefAssignment ) ) )
            // InternalMath.g:317:2: ( ( rule__VariableUse__RefAssignment ) )
            {
            // InternalMath.g:317:2: ( ( rule__VariableUse__RefAssignment ) )
            // InternalMath.g:318:3: ( rule__VariableUse__RefAssignment )
            {
             before(grammarAccess.getVariableUseAccess().getRefAssignment()); 
            // InternalMath.g:319:3: ( rule__VariableUse__RefAssignment )
            // InternalMath.g:319:4: rule__VariableUse__RefAssignment
            {
            pushFollow(FOLLOW_2);
            rule__VariableUse__RefAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVariableUseAccess().getRefAssignment()); 

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
    // $ANTLR end "ruleVariableUse"


    // $ANTLR start "rule__Type__Alternatives_1"
    // InternalMath.g:327:1: rule__Type__Alternatives_1 : ( ( ',' ) | ( ')' ) );
    public final void rule__Type__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:331:1: ( ( ',' ) | ( ')' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMath.g:332:2: ( ',' )
                    {
                    // InternalMath.g:332:2: ( ',' )
                    // InternalMath.g:333:3: ','
                    {
                     before(grammarAccess.getTypeAccess().getCommaKeyword_1_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getCommaKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:338:2: ( ')' )
                    {
                    // InternalMath.g:338:2: ( ')' )
                    // InternalMath.g:339:3: ')'
                    {
                     before(grammarAccess.getTypeAccess().getRightParenthesisKeyword_1_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getRightParenthesisKeyword_1_1()); 

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
    // $ANTLR end "rule__Type__Alternatives_1"


    // $ANTLR start "rule__PlusMinus__Alternatives_1"
    // InternalMath.g:348:1: rule__PlusMinus__Alternatives_1 : ( ( ( rule__PlusMinus__Group_1_0__0 ) ) | ( ( rule__PlusMinus__Group_1_1__0 ) ) );
    public final void rule__PlusMinus__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:352:1: ( ( ( rule__PlusMinus__Group_1_0__0 ) ) | ( ( rule__PlusMinus__Group_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            else if ( (LA2_0==22) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMath.g:353:2: ( ( rule__PlusMinus__Group_1_0__0 ) )
                    {
                    // InternalMath.g:353:2: ( ( rule__PlusMinus__Group_1_0__0 ) )
                    // InternalMath.g:354:3: ( rule__PlusMinus__Group_1_0__0 )
                    {
                     before(grammarAccess.getPlusMinusAccess().getGroup_1_0()); 
                    // InternalMath.g:355:3: ( rule__PlusMinus__Group_1_0__0 )
                    // InternalMath.g:355:4: rule__PlusMinus__Group_1_0__0
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
                    // InternalMath.g:359:2: ( ( rule__PlusMinus__Group_1_1__0 ) )
                    {
                    // InternalMath.g:359:2: ( ( rule__PlusMinus__Group_1_1__0 ) )
                    // InternalMath.g:360:3: ( rule__PlusMinus__Group_1_1__0 )
                    {
                     before(grammarAccess.getPlusMinusAccess().getGroup_1_1()); 
                    // InternalMath.g:361:3: ( rule__PlusMinus__Group_1_1__0 )
                    // InternalMath.g:361:4: rule__PlusMinus__Group_1_1__0
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
    // InternalMath.g:369:1: rule__Term__Alternatives_1 : ( ( ( rule__Term__Group_1_0__0 ) ) | ( ( rule__Term__Group_1_1__0 ) ) );
    public final void rule__Term__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:373:1: ( ( ( rule__Term__Group_1_0__0 ) ) | ( ( rule__Term__Group_1_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
                alt3=1;
            }
            else if ( (LA3_0==24) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMath.g:374:2: ( ( rule__Term__Group_1_0__0 ) )
                    {
                    // InternalMath.g:374:2: ( ( rule__Term__Group_1_0__0 ) )
                    // InternalMath.g:375:3: ( rule__Term__Group_1_0__0 )
                    {
                     before(grammarAccess.getTermAccess().getGroup_1_0()); 
                    // InternalMath.g:376:3: ( rule__Term__Group_1_0__0 )
                    // InternalMath.g:376:4: rule__Term__Group_1_0__0
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
                    // InternalMath.g:380:2: ( ( rule__Term__Group_1_1__0 ) )
                    {
                    // InternalMath.g:380:2: ( ( rule__Term__Group_1_1__0 ) )
                    // InternalMath.g:381:3: ( rule__Term__Group_1_1__0 )
                    {
                     before(grammarAccess.getTermAccess().getGroup_1_1()); 
                    // InternalMath.g:382:3: ( rule__Term__Group_1_1__0 )
                    // InternalMath.g:382:4: rule__Term__Group_1_1__0
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
    // InternalMath.g:390:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ruleParenthesis ) | ( ruleVariableUse ) | ( ruleLet ) | ( ruleExternalContent ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:394:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ruleParenthesis ) | ( ruleVariableUse ) | ( ruleLet ) | ( ruleExternalContent ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case RULE_ID:
                {
                int LA4_3 = input.LA(2);

                if ( (LA4_3==EOF||(LA4_3>=11 && LA4_3<=12)||LA4_3==16||(LA4_3>=19 && LA4_3<=24)) ) {
                    alt4=3;
                }
                else if ( (LA4_3==15) ) {
                    alt4=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;
                }
                }
                break;
            case 18:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMath.g:395:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalMath.g:395:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalMath.g:396:3: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // InternalMath.g:397:3: ( rule__Primary__Group_0__0 )
                    // InternalMath.g:397:4: rule__Primary__Group_0__0
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
                    // InternalMath.g:401:2: ( ruleParenthesis )
                    {
                    // InternalMath.g:401:2: ( ruleParenthesis )
                    // InternalMath.g:402:3: ruleParenthesis
                    {
                     before(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleParenthesis();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMath.g:407:2: ( ruleVariableUse )
                    {
                    // InternalMath.g:407:2: ( ruleVariableUse )
                    // InternalMath.g:408:3: ruleVariableUse
                    {
                     before(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableUse();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMath.g:413:2: ( ruleLet )
                    {
                    // InternalMath.g:413:2: ( ruleLet )
                    // InternalMath.g:414:3: ruleLet
                    {
                     before(grammarAccess.getPrimaryAccess().getLetParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleLet();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getLetParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMath.g:419:2: ( ruleExternalContent )
                    {
                    // InternalMath.g:419:2: ( ruleExternalContent )
                    // InternalMath.g:420:3: ruleExternalContent
                    {
                     before(grammarAccess.getPrimaryAccess().getExternalContentParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleExternalContent();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getExternalContentParserRuleCall_4()); 

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


    // $ANTLR start "rule__Program__Group__0"
    // InternalMath.g:429:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:433:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalMath.g:434:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

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
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // InternalMath.g:441:1: rule__Program__Group__0__Impl : ( 'program' ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:445:1: ( ( 'program' ) )
            // InternalMath.g:446:1: ( 'program' )
            {
            // InternalMath.g:446:1: ( 'program' )
            // InternalMath.g:447:2: 'program'
            {
             before(grammarAccess.getProgramAccess().getProgramKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getProgramKeyword_0()); 

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
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalMath.g:456:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:460:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalMath.g:461:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Program__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__2();

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
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // InternalMath.g:468:1: rule__Program__Group__1__Impl : ( ( rule__Program__NameAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:472:1: ( ( ( rule__Program__NameAssignment_1 ) ) )
            // InternalMath.g:473:1: ( ( rule__Program__NameAssignment_1 ) )
            {
            // InternalMath.g:473:1: ( ( rule__Program__NameAssignment_1 ) )
            // InternalMath.g:474:2: ( rule__Program__NameAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getNameAssignment_1()); 
            // InternalMath.g:475:2: ( rule__Program__NameAssignment_1 )
            // InternalMath.g:475:3: rule__Program__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Program__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Program__Group__2"
    // InternalMath.g:483:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:487:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // InternalMath.g:488:2: rule__Program__Group__2__Impl rule__Program__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Program__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__3();

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
    // $ANTLR end "rule__Program__Group__2"


    // $ANTLR start "rule__Program__Group__2__Impl"
    // InternalMath.g:495:1: rule__Program__Group__2__Impl : ( ( rule__Program__ExternalsAssignment_2 )* ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:499:1: ( ( ( rule__Program__ExternalsAssignment_2 )* ) )
            // InternalMath.g:500:1: ( ( rule__Program__ExternalsAssignment_2 )* )
            {
            // InternalMath.g:500:1: ( ( rule__Program__ExternalsAssignment_2 )* )
            // InternalMath.g:501:2: ( rule__Program__ExternalsAssignment_2 )*
            {
             before(grammarAccess.getProgramAccess().getExternalsAssignment_2()); 
            // InternalMath.g:502:2: ( rule__Program__ExternalsAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMath.g:502:3: rule__Program__ExternalsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Program__ExternalsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getExternalsAssignment_2()); 

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
    // $ANTLR end "rule__Program__Group__2__Impl"


    // $ANTLR start "rule__Program__Group__3"
    // InternalMath.g:510:1: rule__Program__Group__3 : rule__Program__Group__3__Impl ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:514:1: ( rule__Program__Group__3__Impl )
            // InternalMath.g:515:2: rule__Program__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__3__Impl();

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
    // $ANTLR end "rule__Program__Group__3"


    // $ANTLR start "rule__Program__Group__3__Impl"
    // InternalMath.g:521:1: rule__Program__Group__3__Impl : ( ( rule__Program__ExpAssignment_3 )* ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:525:1: ( ( ( rule__Program__ExpAssignment_3 )* ) )
            // InternalMath.g:526:1: ( ( rule__Program__ExpAssignment_3 )* )
            {
            // InternalMath.g:526:1: ( ( rule__Program__ExpAssignment_3 )* )
            // InternalMath.g:527:2: ( rule__Program__ExpAssignment_3 )*
            {
             before(grammarAccess.getProgramAccess().getExpAssignment_3()); 
            // InternalMath.g:528:2: ( rule__Program__ExpAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMath.g:528:3: rule__Program__ExpAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Program__ExpAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getExpAssignment_3()); 

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
    // $ANTLR end "rule__Program__Group__3__Impl"


    // $ANTLR start "rule__External__Group__0"
    // InternalMath.g:537:1: rule__External__Group__0 : rule__External__Group__0__Impl rule__External__Group__1 ;
    public final void rule__External__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:541:1: ( rule__External__Group__0__Impl rule__External__Group__1 )
            // InternalMath.g:542:2: rule__External__Group__0__Impl rule__External__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__External__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__External__Group__1();

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
    // $ANTLR end "rule__External__Group__0"


    // $ANTLR start "rule__External__Group__0__Impl"
    // InternalMath.g:549:1: rule__External__Group__0__Impl : ( 'external' ) ;
    public final void rule__External__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:553:1: ( ( 'external' ) )
            // InternalMath.g:554:1: ( 'external' )
            {
            // InternalMath.g:554:1: ( 'external' )
            // InternalMath.g:555:2: 'external'
            {
             before(grammarAccess.getExternalAccess().getExternalKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getExternalAccess().getExternalKeyword_0()); 

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
    // $ANTLR end "rule__External__Group__0__Impl"


    // $ANTLR start "rule__External__Group__1"
    // InternalMath.g:564:1: rule__External__Group__1 : rule__External__Group__1__Impl rule__External__Group__2 ;
    public final void rule__External__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:568:1: ( rule__External__Group__1__Impl rule__External__Group__2 )
            // InternalMath.g:569:2: rule__External__Group__1__Impl rule__External__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__External__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__External__Group__2();

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
    // $ANTLR end "rule__External__Group__1"


    // $ANTLR start "rule__External__Group__1__Impl"
    // InternalMath.g:576:1: rule__External__Group__1__Impl : ( ( rule__External__NameAssignment_1 ) ) ;
    public final void rule__External__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:580:1: ( ( ( rule__External__NameAssignment_1 ) ) )
            // InternalMath.g:581:1: ( ( rule__External__NameAssignment_1 ) )
            {
            // InternalMath.g:581:1: ( ( rule__External__NameAssignment_1 ) )
            // InternalMath.g:582:2: ( rule__External__NameAssignment_1 )
            {
             before(grammarAccess.getExternalAccess().getNameAssignment_1()); 
            // InternalMath.g:583:2: ( rule__External__NameAssignment_1 )
            // InternalMath.g:583:3: rule__External__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__External__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__External__Group__1__Impl"


    // $ANTLR start "rule__External__Group__2"
    // InternalMath.g:591:1: rule__External__Group__2 : rule__External__Group__2__Impl rule__External__Group__3 ;
    public final void rule__External__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:595:1: ( rule__External__Group__2__Impl rule__External__Group__3 )
            // InternalMath.g:596:2: rule__External__Group__2__Impl rule__External__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__External__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__External__Group__3();

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
    // $ANTLR end "rule__External__Group__2"


    // $ANTLR start "rule__External__Group__2__Impl"
    // InternalMath.g:603:1: rule__External__Group__2__Impl : ( '(' ) ;
    public final void rule__External__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:607:1: ( ( '(' ) )
            // InternalMath.g:608:1: ( '(' )
            {
            // InternalMath.g:608:1: ( '(' )
            // InternalMath.g:609:2: '('
            {
             before(grammarAccess.getExternalAccess().getLeftParenthesisKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getExternalAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__External__Group__2__Impl"


    // $ANTLR start "rule__External__Group__3"
    // InternalMath.g:618:1: rule__External__Group__3 : rule__External__Group__3__Impl rule__External__Group__4 ;
    public final void rule__External__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:622:1: ( rule__External__Group__3__Impl rule__External__Group__4 )
            // InternalMath.g:623:2: rule__External__Group__3__Impl rule__External__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__External__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__External__Group__4();

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
    // $ANTLR end "rule__External__Group__3"


    // $ANTLR start "rule__External__Group__3__Impl"
    // InternalMath.g:630:1: rule__External__Group__3__Impl : ( ( rule__External__ParenAssignment_3 )* ) ;
    public final void rule__External__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:634:1: ( ( ( rule__External__ParenAssignment_3 )* ) )
            // InternalMath.g:635:1: ( ( rule__External__ParenAssignment_3 )* )
            {
            // InternalMath.g:635:1: ( ( rule__External__ParenAssignment_3 )* )
            // InternalMath.g:636:2: ( rule__External__ParenAssignment_3 )*
            {
             before(grammarAccess.getExternalAccess().getParenAssignment_3()); 
            // InternalMath.g:637:2: ( rule__External__ParenAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMath.g:637:3: rule__External__ParenAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__External__ParenAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getExternalAccess().getParenAssignment_3()); 

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
    // $ANTLR end "rule__External__Group__3__Impl"


    // $ANTLR start "rule__External__Group__4"
    // InternalMath.g:645:1: rule__External__Group__4 : rule__External__Group__4__Impl ;
    public final void rule__External__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:649:1: ( rule__External__Group__4__Impl )
            // InternalMath.g:650:2: rule__External__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__External__Group__4__Impl();

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
    // $ANTLR end "rule__External__Group__4"


    // $ANTLR start "rule__External__Group__4__Impl"
    // InternalMath.g:656:1: rule__External__Group__4__Impl : ( ( ')' )? ) ;
    public final void rule__External__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:660:1: ( ( ( ')' )? ) )
            // InternalMath.g:661:1: ( ( ')' )? )
            {
            // InternalMath.g:661:1: ( ( ')' )? )
            // InternalMath.g:662:2: ( ')' )?
            {
             before(grammarAccess.getExternalAccess().getRightParenthesisKeyword_4()); 
            // InternalMath.g:663:2: ( ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==12) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMath.g:663:3: ')'
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getExternalAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__External__Group__4__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // InternalMath.g:672:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:676:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalMath.g:677:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__1();

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
    // $ANTLR end "rule__Type__Group__0"


    // $ANTLR start "rule__Type__Group__0__Impl"
    // InternalMath.g:684:1: rule__Type__Group__0__Impl : ( ( rule__Type__NameAssignment_0 ) ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:688:1: ( ( ( rule__Type__NameAssignment_0 ) ) )
            // InternalMath.g:689:1: ( ( rule__Type__NameAssignment_0 ) )
            {
            // InternalMath.g:689:1: ( ( rule__Type__NameAssignment_0 ) )
            // InternalMath.g:690:2: ( rule__Type__NameAssignment_0 )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment_0()); 
            // InternalMath.g:691:2: ( rule__Type__NameAssignment_0 )
            // InternalMath.g:691:3: rule__Type__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Type__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Type__Group__0__Impl"


    // $ANTLR start "rule__Type__Group__1"
    // InternalMath.g:699:1: rule__Type__Group__1 : rule__Type__Group__1__Impl ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:703:1: ( rule__Type__Group__1__Impl )
            // InternalMath.g:704:2: rule__Type__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__1__Impl();

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
    // $ANTLR end "rule__Type__Group__1"


    // $ANTLR start "rule__Type__Group__1__Impl"
    // InternalMath.g:710:1: rule__Type__Group__1__Impl : ( ( rule__Type__Alternatives_1 ) ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:714:1: ( ( ( rule__Type__Alternatives_1 ) ) )
            // InternalMath.g:715:1: ( ( rule__Type__Alternatives_1 ) )
            {
            // InternalMath.g:715:1: ( ( rule__Type__Alternatives_1 ) )
            // InternalMath.g:716:2: ( rule__Type__Alternatives_1 )
            {
             before(grammarAccess.getTypeAccess().getAlternatives_1()); 
            // InternalMath.g:717:2: ( rule__Type__Alternatives_1 )
            // InternalMath.g:717:3: rule__Type__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Type__Group__1__Impl"


    // $ANTLR start "rule__Var__Group__0"
    // InternalMath.g:726:1: rule__Var__Group__0 : rule__Var__Group__0__Impl rule__Var__Group__1 ;
    public final void rule__Var__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:730:1: ( rule__Var__Group__0__Impl rule__Var__Group__1 )
            // InternalMath.g:731:2: rule__Var__Group__0__Impl rule__Var__Group__1
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
    // InternalMath.g:738:1: rule__Var__Group__0__Impl : ( 'var' ) ;
    public final void rule__Var__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:742:1: ( ( 'var' ) )
            // InternalMath.g:743:1: ( 'var' )
            {
            // InternalMath.g:743:1: ( 'var' )
            // InternalMath.g:744:2: 'var'
            {
             before(grammarAccess.getVarAccess().getVarKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVarAccess().getVarKeyword_0()); 

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
    // InternalMath.g:753:1: rule__Var__Group__1 : rule__Var__Group__1__Impl rule__Var__Group__2 ;
    public final void rule__Var__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:757:1: ( rule__Var__Group__1__Impl rule__Var__Group__2 )
            // InternalMath.g:758:2: rule__Var__Group__1__Impl rule__Var__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Var__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Var__Group__2();

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
    // InternalMath.g:765:1: rule__Var__Group__1__Impl : ( ( rule__Var__NameAssignment_1 ) ) ;
    public final void rule__Var__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:769:1: ( ( ( rule__Var__NameAssignment_1 ) ) )
            // InternalMath.g:770:1: ( ( rule__Var__NameAssignment_1 ) )
            {
            // InternalMath.g:770:1: ( ( rule__Var__NameAssignment_1 ) )
            // InternalMath.g:771:2: ( rule__Var__NameAssignment_1 )
            {
             before(grammarAccess.getVarAccess().getNameAssignment_1()); 
            // InternalMath.g:772:2: ( rule__Var__NameAssignment_1 )
            // InternalMath.g:772:3: rule__Var__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Var__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVarAccess().getNameAssignment_1()); 

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


    // $ANTLR start "rule__Var__Group__2"
    // InternalMath.g:780:1: rule__Var__Group__2 : rule__Var__Group__2__Impl rule__Var__Group__3 ;
    public final void rule__Var__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:784:1: ( rule__Var__Group__2__Impl rule__Var__Group__3 )
            // InternalMath.g:785:2: rule__Var__Group__2__Impl rule__Var__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Var__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Var__Group__3();

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
    // $ANTLR end "rule__Var__Group__2"


    // $ANTLR start "rule__Var__Group__2__Impl"
    // InternalMath.g:792:1: rule__Var__Group__2__Impl : ( '=' ) ;
    public final void rule__Var__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:796:1: ( ( '=' ) )
            // InternalMath.g:797:1: ( '=' )
            {
            // InternalMath.g:797:1: ( '=' )
            // InternalMath.g:798:2: '='
            {
             before(grammarAccess.getVarAccess().getEqualsSignKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getVarAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__Var__Group__2__Impl"


    // $ANTLR start "rule__Var__Group__3"
    // InternalMath.g:807:1: rule__Var__Group__3 : rule__Var__Group__3__Impl ;
    public final void rule__Var__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:811:1: ( rule__Var__Group__3__Impl )
            // InternalMath.g:812:2: rule__Var__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Var__Group__3__Impl();

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
    // $ANTLR end "rule__Var__Group__3"


    // $ANTLR start "rule__Var__Group__3__Impl"
    // InternalMath.g:818:1: rule__Var__Group__3__Impl : ( ( rule__Var__ExpressionAssignment_3 ) ) ;
    public final void rule__Var__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:822:1: ( ( ( rule__Var__ExpressionAssignment_3 ) ) )
            // InternalMath.g:823:1: ( ( rule__Var__ExpressionAssignment_3 ) )
            {
            // InternalMath.g:823:1: ( ( rule__Var__ExpressionAssignment_3 ) )
            // InternalMath.g:824:2: ( rule__Var__ExpressionAssignment_3 )
            {
             before(grammarAccess.getVarAccess().getExpressionAssignment_3()); 
            // InternalMath.g:825:2: ( rule__Var__ExpressionAssignment_3 )
            // InternalMath.g:825:3: rule__Var__ExpressionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Var__ExpressionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVarAccess().getExpressionAssignment_3()); 

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
    // $ANTLR end "rule__Var__Group__3__Impl"


    // $ANTLR start "rule__Let__Group__0"
    // InternalMath.g:834:1: rule__Let__Group__0 : rule__Let__Group__0__Impl rule__Let__Group__1 ;
    public final void rule__Let__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:838:1: ( rule__Let__Group__0__Impl rule__Let__Group__1 )
            // InternalMath.g:839:2: rule__Let__Group__0__Impl rule__Let__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMath.g:846:1: rule__Let__Group__0__Impl : ( 'let' ) ;
    public final void rule__Let__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:850:1: ( ( 'let' ) )
            // InternalMath.g:851:1: ( 'let' )
            {
            // InternalMath.g:851:1: ( 'let' )
            // InternalMath.g:852:2: 'let'
            {
             before(grammarAccess.getLetAccess().getLetKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLetAccess().getLetKeyword_0()); 

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
    // InternalMath.g:861:1: rule__Let__Group__1 : rule__Let__Group__1__Impl rule__Let__Group__2 ;
    public final void rule__Let__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:865:1: ( rule__Let__Group__1__Impl rule__Let__Group__2 )
            // InternalMath.g:866:2: rule__Let__Group__1__Impl rule__Let__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Let__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Let__Group__2();

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
    // InternalMath.g:873:1: rule__Let__Group__1__Impl : ( ( rule__Let__NameAssignment_1 ) ) ;
    public final void rule__Let__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:877:1: ( ( ( rule__Let__NameAssignment_1 ) ) )
            // InternalMath.g:878:1: ( ( rule__Let__NameAssignment_1 ) )
            {
            // InternalMath.g:878:1: ( ( rule__Let__NameAssignment_1 ) )
            // InternalMath.g:879:2: ( rule__Let__NameAssignment_1 )
            {
             before(grammarAccess.getLetAccess().getNameAssignment_1()); 
            // InternalMath.g:880:2: ( rule__Let__NameAssignment_1 )
            // InternalMath.g:880:3: rule__Let__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Let__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLetAccess().getNameAssignment_1()); 

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


    // $ANTLR start "rule__Let__Group__2"
    // InternalMath.g:888:1: rule__Let__Group__2 : rule__Let__Group__2__Impl rule__Let__Group__3 ;
    public final void rule__Let__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:892:1: ( rule__Let__Group__2__Impl rule__Let__Group__3 )
            // InternalMath.g:893:2: rule__Let__Group__2__Impl rule__Let__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Let__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Let__Group__3();

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
    // $ANTLR end "rule__Let__Group__2"


    // $ANTLR start "rule__Let__Group__2__Impl"
    // InternalMath.g:900:1: rule__Let__Group__2__Impl : ( '=' ) ;
    public final void rule__Let__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:904:1: ( ( '=' ) )
            // InternalMath.g:905:1: ( '=' )
            {
            // InternalMath.g:905:1: ( '=' )
            // InternalMath.g:906:2: '='
            {
             before(grammarAccess.getLetAccess().getEqualsSignKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLetAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__Let__Group__2__Impl"


    // $ANTLR start "rule__Let__Group__3"
    // InternalMath.g:915:1: rule__Let__Group__3 : rule__Let__Group__3__Impl rule__Let__Group__4 ;
    public final void rule__Let__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:919:1: ( rule__Let__Group__3__Impl rule__Let__Group__4 )
            // InternalMath.g:920:2: rule__Let__Group__3__Impl rule__Let__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Let__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Let__Group__4();

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
    // $ANTLR end "rule__Let__Group__3"


    // $ANTLR start "rule__Let__Group__3__Impl"
    // InternalMath.g:927:1: rule__Let__Group__3__Impl : ( ( rule__Let__BindingAssignment_3 ) ) ;
    public final void rule__Let__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:931:1: ( ( ( rule__Let__BindingAssignment_3 ) ) )
            // InternalMath.g:932:1: ( ( rule__Let__BindingAssignment_3 ) )
            {
            // InternalMath.g:932:1: ( ( rule__Let__BindingAssignment_3 ) )
            // InternalMath.g:933:2: ( rule__Let__BindingAssignment_3 )
            {
             before(grammarAccess.getLetAccess().getBindingAssignment_3()); 
            // InternalMath.g:934:2: ( rule__Let__BindingAssignment_3 )
            // InternalMath.g:934:3: rule__Let__BindingAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Let__BindingAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLetAccess().getBindingAssignment_3()); 

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
    // $ANTLR end "rule__Let__Group__3__Impl"


    // $ANTLR start "rule__Let__Group__4"
    // InternalMath.g:942:1: rule__Let__Group__4 : rule__Let__Group__4__Impl rule__Let__Group__5 ;
    public final void rule__Let__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:946:1: ( rule__Let__Group__4__Impl rule__Let__Group__5 )
            // InternalMath.g:947:2: rule__Let__Group__4__Impl rule__Let__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Let__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Let__Group__5();

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
    // $ANTLR end "rule__Let__Group__4"


    // $ANTLR start "rule__Let__Group__4__Impl"
    // InternalMath.g:954:1: rule__Let__Group__4__Impl : ( 'in' ) ;
    public final void rule__Let__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:958:1: ( ( 'in' ) )
            // InternalMath.g:959:1: ( 'in' )
            {
            // InternalMath.g:959:1: ( 'in' )
            // InternalMath.g:960:2: 'in'
            {
             before(grammarAccess.getLetAccess().getInKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLetAccess().getInKeyword_4()); 

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
    // $ANTLR end "rule__Let__Group__4__Impl"


    // $ANTLR start "rule__Let__Group__5"
    // InternalMath.g:969:1: rule__Let__Group__5 : rule__Let__Group__5__Impl rule__Let__Group__6 ;
    public final void rule__Let__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:973:1: ( rule__Let__Group__5__Impl rule__Let__Group__6 )
            // InternalMath.g:974:2: rule__Let__Group__5__Impl rule__Let__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Let__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Let__Group__6();

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
    // $ANTLR end "rule__Let__Group__5"


    // $ANTLR start "rule__Let__Group__5__Impl"
    // InternalMath.g:981:1: rule__Let__Group__5__Impl : ( ( rule__Let__BodyAssignment_5 ) ) ;
    public final void rule__Let__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:985:1: ( ( ( rule__Let__BodyAssignment_5 ) ) )
            // InternalMath.g:986:1: ( ( rule__Let__BodyAssignment_5 ) )
            {
            // InternalMath.g:986:1: ( ( rule__Let__BodyAssignment_5 ) )
            // InternalMath.g:987:2: ( rule__Let__BodyAssignment_5 )
            {
             before(grammarAccess.getLetAccess().getBodyAssignment_5()); 
            // InternalMath.g:988:2: ( rule__Let__BodyAssignment_5 )
            // InternalMath.g:988:3: rule__Let__BodyAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Let__BodyAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLetAccess().getBodyAssignment_5()); 

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
    // $ANTLR end "rule__Let__Group__5__Impl"


    // $ANTLR start "rule__Let__Group__6"
    // InternalMath.g:996:1: rule__Let__Group__6 : rule__Let__Group__6__Impl ;
    public final void rule__Let__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1000:1: ( rule__Let__Group__6__Impl )
            // InternalMath.g:1001:2: rule__Let__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Let__Group__6__Impl();

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
    // $ANTLR end "rule__Let__Group__6"


    // $ANTLR start "rule__Let__Group__6__Impl"
    // InternalMath.g:1007:1: rule__Let__Group__6__Impl : ( 'end' ) ;
    public final void rule__Let__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1011:1: ( ( 'end' ) )
            // InternalMath.g:1012:1: ( 'end' )
            {
            // InternalMath.g:1012:1: ( 'end' )
            // InternalMath.g:1013:2: 'end'
            {
             before(grammarAccess.getLetAccess().getEndKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLetAccess().getEndKeyword_6()); 

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
    // $ANTLR end "rule__Let__Group__6__Impl"


    // $ANTLR start "rule__PlusMinus__Group__0"
    // InternalMath.g:1023:1: rule__PlusMinus__Group__0 : rule__PlusMinus__Group__0__Impl rule__PlusMinus__Group__1 ;
    public final void rule__PlusMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1027:1: ( rule__PlusMinus__Group__0__Impl rule__PlusMinus__Group__1 )
            // InternalMath.g:1028:2: rule__PlusMinus__Group__0__Impl rule__PlusMinus__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMath.g:1035:1: rule__PlusMinus__Group__0__Impl : ( ruleTerm ) ;
    public final void rule__PlusMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1039:1: ( ( ruleTerm ) )
            // InternalMath.g:1040:1: ( ruleTerm )
            {
            // InternalMath.g:1040:1: ( ruleTerm )
            // InternalMath.g:1041:2: ruleTerm
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
    // InternalMath.g:1050:1: rule__PlusMinus__Group__1 : rule__PlusMinus__Group__1__Impl ;
    public final void rule__PlusMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1054:1: ( rule__PlusMinus__Group__1__Impl )
            // InternalMath.g:1055:2: rule__PlusMinus__Group__1__Impl
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
    // InternalMath.g:1061:1: rule__PlusMinus__Group__1__Impl : ( ( rule__PlusMinus__Alternatives_1 )* ) ;
    public final void rule__PlusMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1065:1: ( ( ( rule__PlusMinus__Alternatives_1 )* ) )
            // InternalMath.g:1066:1: ( ( rule__PlusMinus__Alternatives_1 )* )
            {
            // InternalMath.g:1066:1: ( ( rule__PlusMinus__Alternatives_1 )* )
            // InternalMath.g:1067:2: ( rule__PlusMinus__Alternatives_1 )*
            {
             before(grammarAccess.getPlusMinusAccess().getAlternatives_1()); 
            // InternalMath.g:1068:2: ( rule__PlusMinus__Alternatives_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=21 && LA9_0<=22)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMath.g:1068:3: rule__PlusMinus__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__PlusMinus__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalMath.g:1077:1: rule__PlusMinus__Group_1_0__0 : rule__PlusMinus__Group_1_0__0__Impl rule__PlusMinus__Group_1_0__1 ;
    public final void rule__PlusMinus__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1081:1: ( rule__PlusMinus__Group_1_0__0__Impl rule__PlusMinus__Group_1_0__1 )
            // InternalMath.g:1082:2: rule__PlusMinus__Group_1_0__0__Impl rule__PlusMinus__Group_1_0__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalMath.g:1089:1: rule__PlusMinus__Group_1_0__0__Impl : ( () ) ;
    public final void rule__PlusMinus__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1093:1: ( ( () ) )
            // InternalMath.g:1094:1: ( () )
            {
            // InternalMath.g:1094:1: ( () )
            // InternalMath.g:1095:2: ()
            {
             before(grammarAccess.getPlusMinusAccess().getPlusLeftAction_1_0_0()); 
            // InternalMath.g:1096:2: ()
            // InternalMath.g:1096:3: 
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
    // InternalMath.g:1104:1: rule__PlusMinus__Group_1_0__1 : rule__PlusMinus__Group_1_0__1__Impl rule__PlusMinus__Group_1_0__2 ;
    public final void rule__PlusMinus__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1108:1: ( rule__PlusMinus__Group_1_0__1__Impl rule__PlusMinus__Group_1_0__2 )
            // InternalMath.g:1109:2: rule__PlusMinus__Group_1_0__1__Impl rule__PlusMinus__Group_1_0__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalMath.g:1116:1: rule__PlusMinus__Group_1_0__1__Impl : ( '+' ) ;
    public final void rule__PlusMinus__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1120:1: ( ( '+' ) )
            // InternalMath.g:1121:1: ( '+' )
            {
            // InternalMath.g:1121:1: ( '+' )
            // InternalMath.g:1122:2: '+'
            {
             before(grammarAccess.getPlusMinusAccess().getPlusSignKeyword_1_0_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMath.g:1131:1: rule__PlusMinus__Group_1_0__2 : rule__PlusMinus__Group_1_0__2__Impl ;
    public final void rule__PlusMinus__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1135:1: ( rule__PlusMinus__Group_1_0__2__Impl )
            // InternalMath.g:1136:2: rule__PlusMinus__Group_1_0__2__Impl
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
    // InternalMath.g:1142:1: rule__PlusMinus__Group_1_0__2__Impl : ( ( rule__PlusMinus__RightAssignment_1_0_2 ) ) ;
    public final void rule__PlusMinus__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1146:1: ( ( ( rule__PlusMinus__RightAssignment_1_0_2 ) ) )
            // InternalMath.g:1147:1: ( ( rule__PlusMinus__RightAssignment_1_0_2 ) )
            {
            // InternalMath.g:1147:1: ( ( rule__PlusMinus__RightAssignment_1_0_2 ) )
            // InternalMath.g:1148:2: ( rule__PlusMinus__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getPlusMinusAccess().getRightAssignment_1_0_2()); 
            // InternalMath.g:1149:2: ( rule__PlusMinus__RightAssignment_1_0_2 )
            // InternalMath.g:1149:3: rule__PlusMinus__RightAssignment_1_0_2
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
    // InternalMath.g:1158:1: rule__PlusMinus__Group_1_1__0 : rule__PlusMinus__Group_1_1__0__Impl rule__PlusMinus__Group_1_1__1 ;
    public final void rule__PlusMinus__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1162:1: ( rule__PlusMinus__Group_1_1__0__Impl rule__PlusMinus__Group_1_1__1 )
            // InternalMath.g:1163:2: rule__PlusMinus__Group_1_1__0__Impl rule__PlusMinus__Group_1_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMath.g:1170:1: rule__PlusMinus__Group_1_1__0__Impl : ( () ) ;
    public final void rule__PlusMinus__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1174:1: ( ( () ) )
            // InternalMath.g:1175:1: ( () )
            {
            // InternalMath.g:1175:1: ( () )
            // InternalMath.g:1176:2: ()
            {
             before(grammarAccess.getPlusMinusAccess().getMinusLeftAction_1_1_0()); 
            // InternalMath.g:1177:2: ()
            // InternalMath.g:1177:3: 
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
    // InternalMath.g:1185:1: rule__PlusMinus__Group_1_1__1 : rule__PlusMinus__Group_1_1__1__Impl rule__PlusMinus__Group_1_1__2 ;
    public final void rule__PlusMinus__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1189:1: ( rule__PlusMinus__Group_1_1__1__Impl rule__PlusMinus__Group_1_1__2 )
            // InternalMath.g:1190:2: rule__PlusMinus__Group_1_1__1__Impl rule__PlusMinus__Group_1_1__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalMath.g:1197:1: rule__PlusMinus__Group_1_1__1__Impl : ( '-' ) ;
    public final void rule__PlusMinus__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1201:1: ( ( '-' ) )
            // InternalMath.g:1202:1: ( '-' )
            {
            // InternalMath.g:1202:1: ( '-' )
            // InternalMath.g:1203:2: '-'
            {
             before(grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1_1_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMath.g:1212:1: rule__PlusMinus__Group_1_1__2 : rule__PlusMinus__Group_1_1__2__Impl ;
    public final void rule__PlusMinus__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1216:1: ( rule__PlusMinus__Group_1_1__2__Impl )
            // InternalMath.g:1217:2: rule__PlusMinus__Group_1_1__2__Impl
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
    // InternalMath.g:1223:1: rule__PlusMinus__Group_1_1__2__Impl : ( ( rule__PlusMinus__RightAssignment_1_1_2 ) ) ;
    public final void rule__PlusMinus__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1227:1: ( ( ( rule__PlusMinus__RightAssignment_1_1_2 ) ) )
            // InternalMath.g:1228:1: ( ( rule__PlusMinus__RightAssignment_1_1_2 ) )
            {
            // InternalMath.g:1228:1: ( ( rule__PlusMinus__RightAssignment_1_1_2 ) )
            // InternalMath.g:1229:2: ( rule__PlusMinus__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getPlusMinusAccess().getRightAssignment_1_1_2()); 
            // InternalMath.g:1230:2: ( rule__PlusMinus__RightAssignment_1_1_2 )
            // InternalMath.g:1230:3: rule__PlusMinus__RightAssignment_1_1_2
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
    // InternalMath.g:1239:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1243:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // InternalMath.g:1244:2: rule__Term__Group__0__Impl rule__Term__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMath.g:1251:1: rule__Term__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1255:1: ( ( rulePrimary ) )
            // InternalMath.g:1256:1: ( rulePrimary )
            {
            // InternalMath.g:1256:1: ( rulePrimary )
            // InternalMath.g:1257:2: rulePrimary
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
    // InternalMath.g:1266:1: rule__Term__Group__1 : rule__Term__Group__1__Impl ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1270:1: ( rule__Term__Group__1__Impl )
            // InternalMath.g:1271:2: rule__Term__Group__1__Impl
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
    // InternalMath.g:1277:1: rule__Term__Group__1__Impl : ( ( rule__Term__Alternatives_1 )* ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1281:1: ( ( ( rule__Term__Alternatives_1 )* ) )
            // InternalMath.g:1282:1: ( ( rule__Term__Alternatives_1 )* )
            {
            // InternalMath.g:1282:1: ( ( rule__Term__Alternatives_1 )* )
            // InternalMath.g:1283:2: ( rule__Term__Alternatives_1 )*
            {
             before(grammarAccess.getTermAccess().getAlternatives_1()); 
            // InternalMath.g:1284:2: ( rule__Term__Alternatives_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=23 && LA10_0<=24)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMath.g:1284:3: rule__Term__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Term__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalMath.g:1293:1: rule__Term__Group_1_0__0 : rule__Term__Group_1_0__0__Impl rule__Term__Group_1_0__1 ;
    public final void rule__Term__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1297:1: ( rule__Term__Group_1_0__0__Impl rule__Term__Group_1_0__1 )
            // InternalMath.g:1298:2: rule__Term__Group_1_0__0__Impl rule__Term__Group_1_0__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMath.g:1305:1: rule__Term__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Term__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1309:1: ( ( () ) )
            // InternalMath.g:1310:1: ( () )
            {
            // InternalMath.g:1310:1: ( () )
            // InternalMath.g:1311:2: ()
            {
             before(grammarAccess.getTermAccess().getMultLeftAction_1_0_0()); 
            // InternalMath.g:1312:2: ()
            // InternalMath.g:1312:3: 
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
    // InternalMath.g:1320:1: rule__Term__Group_1_0__1 : rule__Term__Group_1_0__1__Impl rule__Term__Group_1_0__2 ;
    public final void rule__Term__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1324:1: ( rule__Term__Group_1_0__1__Impl rule__Term__Group_1_0__2 )
            // InternalMath.g:1325:2: rule__Term__Group_1_0__1__Impl rule__Term__Group_1_0__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalMath.g:1332:1: rule__Term__Group_1_0__1__Impl : ( '*' ) ;
    public final void rule__Term__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1336:1: ( ( '*' ) )
            // InternalMath.g:1337:1: ( '*' )
            {
            // InternalMath.g:1337:1: ( '*' )
            // InternalMath.g:1338:2: '*'
            {
             before(grammarAccess.getTermAccess().getAsteriskKeyword_1_0_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMath.g:1347:1: rule__Term__Group_1_0__2 : rule__Term__Group_1_0__2__Impl ;
    public final void rule__Term__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1351:1: ( rule__Term__Group_1_0__2__Impl )
            // InternalMath.g:1352:2: rule__Term__Group_1_0__2__Impl
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
    // InternalMath.g:1358:1: rule__Term__Group_1_0__2__Impl : ( ( rule__Term__RightAssignment_1_0_2 ) ) ;
    public final void rule__Term__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1362:1: ( ( ( rule__Term__RightAssignment_1_0_2 ) ) )
            // InternalMath.g:1363:1: ( ( rule__Term__RightAssignment_1_0_2 ) )
            {
            // InternalMath.g:1363:1: ( ( rule__Term__RightAssignment_1_0_2 ) )
            // InternalMath.g:1364:2: ( rule__Term__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getTermAccess().getRightAssignment_1_0_2()); 
            // InternalMath.g:1365:2: ( rule__Term__RightAssignment_1_0_2 )
            // InternalMath.g:1365:3: rule__Term__RightAssignment_1_0_2
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
    // InternalMath.g:1374:1: rule__Term__Group_1_1__0 : rule__Term__Group_1_1__0__Impl rule__Term__Group_1_1__1 ;
    public final void rule__Term__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1378:1: ( rule__Term__Group_1_1__0__Impl rule__Term__Group_1_1__1 )
            // InternalMath.g:1379:2: rule__Term__Group_1_1__0__Impl rule__Term__Group_1_1__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMath.g:1386:1: rule__Term__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Term__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1390:1: ( ( () ) )
            // InternalMath.g:1391:1: ( () )
            {
            // InternalMath.g:1391:1: ( () )
            // InternalMath.g:1392:2: ()
            {
             before(grammarAccess.getTermAccess().getDivLeftAction_1_1_0()); 
            // InternalMath.g:1393:2: ()
            // InternalMath.g:1393:3: 
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
    // InternalMath.g:1401:1: rule__Term__Group_1_1__1 : rule__Term__Group_1_1__1__Impl rule__Term__Group_1_1__2 ;
    public final void rule__Term__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1405:1: ( rule__Term__Group_1_1__1__Impl rule__Term__Group_1_1__2 )
            // InternalMath.g:1406:2: rule__Term__Group_1_1__1__Impl rule__Term__Group_1_1__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalMath.g:1413:1: rule__Term__Group_1_1__1__Impl : ( '/' ) ;
    public final void rule__Term__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1417:1: ( ( '/' ) )
            // InternalMath.g:1418:1: ( '/' )
            {
            // InternalMath.g:1418:1: ( '/' )
            // InternalMath.g:1419:2: '/'
            {
             before(grammarAccess.getTermAccess().getSolidusKeyword_1_1_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMath.g:1428:1: rule__Term__Group_1_1__2 : rule__Term__Group_1_1__2__Impl ;
    public final void rule__Term__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1432:1: ( rule__Term__Group_1_1__2__Impl )
            // InternalMath.g:1433:2: rule__Term__Group_1_1__2__Impl
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
    // InternalMath.g:1439:1: rule__Term__Group_1_1__2__Impl : ( ( rule__Term__RightAssignment_1_1_2 ) ) ;
    public final void rule__Term__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1443:1: ( ( ( rule__Term__RightAssignment_1_1_2 ) ) )
            // InternalMath.g:1444:1: ( ( rule__Term__RightAssignment_1_1_2 ) )
            {
            // InternalMath.g:1444:1: ( ( rule__Term__RightAssignment_1_1_2 ) )
            // InternalMath.g:1445:2: ( rule__Term__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getTermAccess().getRightAssignment_1_1_2()); 
            // InternalMath.g:1446:2: ( rule__Term__RightAssignment_1_1_2 )
            // InternalMath.g:1446:3: rule__Term__RightAssignment_1_1_2
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


    // $ANTLR start "rule__ExternalContent__Group__0"
    // InternalMath.g:1455:1: rule__ExternalContent__Group__0 : rule__ExternalContent__Group__0__Impl rule__ExternalContent__Group__1 ;
    public final void rule__ExternalContent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1459:1: ( rule__ExternalContent__Group__0__Impl rule__ExternalContent__Group__1 )
            // InternalMath.g:1460:2: rule__ExternalContent__Group__0__Impl rule__ExternalContent__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ExternalContent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalContent__Group__1();

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
    // $ANTLR end "rule__ExternalContent__Group__0"


    // $ANTLR start "rule__ExternalContent__Group__0__Impl"
    // InternalMath.g:1467:1: rule__ExternalContent__Group__0__Impl : ( ( rule__ExternalContent__NameAssignment_0 ) ) ;
    public final void rule__ExternalContent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1471:1: ( ( ( rule__ExternalContent__NameAssignment_0 ) ) )
            // InternalMath.g:1472:1: ( ( rule__ExternalContent__NameAssignment_0 ) )
            {
            // InternalMath.g:1472:1: ( ( rule__ExternalContent__NameAssignment_0 ) )
            // InternalMath.g:1473:2: ( rule__ExternalContent__NameAssignment_0 )
            {
             before(grammarAccess.getExternalContentAccess().getNameAssignment_0()); 
            // InternalMath.g:1474:2: ( rule__ExternalContent__NameAssignment_0 )
            // InternalMath.g:1474:3: rule__ExternalContent__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalContent__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExternalContentAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__ExternalContent__Group__0__Impl"


    // $ANTLR start "rule__ExternalContent__Group__1"
    // InternalMath.g:1482:1: rule__ExternalContent__Group__1 : rule__ExternalContent__Group__1__Impl rule__ExternalContent__Group__2 ;
    public final void rule__ExternalContent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1486:1: ( rule__ExternalContent__Group__1__Impl rule__ExternalContent__Group__2 )
            // InternalMath.g:1487:2: rule__ExternalContent__Group__1__Impl rule__ExternalContent__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__ExternalContent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalContent__Group__2();

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
    // $ANTLR end "rule__ExternalContent__Group__1"


    // $ANTLR start "rule__ExternalContent__Group__1__Impl"
    // InternalMath.g:1494:1: rule__ExternalContent__Group__1__Impl : ( '(' ) ;
    public final void rule__ExternalContent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1498:1: ( ( '(' ) )
            // InternalMath.g:1499:1: ( '(' )
            {
            // InternalMath.g:1499:1: ( '(' )
            // InternalMath.g:1500:2: '('
            {
             before(grammarAccess.getExternalContentAccess().getLeftParenthesisKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getExternalContentAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__ExternalContent__Group__1__Impl"


    // $ANTLR start "rule__ExternalContent__Group__2"
    // InternalMath.g:1509:1: rule__ExternalContent__Group__2 : rule__ExternalContent__Group__2__Impl rule__ExternalContent__Group__3 ;
    public final void rule__ExternalContent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1513:1: ( rule__ExternalContent__Group__2__Impl rule__ExternalContent__Group__3 )
            // InternalMath.g:1514:2: rule__ExternalContent__Group__2__Impl rule__ExternalContent__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__ExternalContent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalContent__Group__3();

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
    // $ANTLR end "rule__ExternalContent__Group__2"


    // $ANTLR start "rule__ExternalContent__Group__2__Impl"
    // InternalMath.g:1521:1: rule__ExternalContent__Group__2__Impl : ( ( rule__ExternalContent__Group_2__0 )? ) ;
    public final void rule__ExternalContent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1525:1: ( ( ( rule__ExternalContent__Group_2__0 )? ) )
            // InternalMath.g:1526:1: ( ( rule__ExternalContent__Group_2__0 )? )
            {
            // InternalMath.g:1526:1: ( ( rule__ExternalContent__Group_2__0 )? )
            // InternalMath.g:1527:2: ( rule__ExternalContent__Group_2__0 )?
            {
             before(grammarAccess.getExternalContentAccess().getGroup_2()); 
            // InternalMath.g:1528:2: ( rule__ExternalContent__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_INT)||LA11_0==15||LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMath.g:1528:3: rule__ExternalContent__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExternalContent__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExternalContentAccess().getGroup_2()); 

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
    // $ANTLR end "rule__ExternalContent__Group__2__Impl"


    // $ANTLR start "rule__ExternalContent__Group__3"
    // InternalMath.g:1536:1: rule__ExternalContent__Group__3 : rule__ExternalContent__Group__3__Impl ;
    public final void rule__ExternalContent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1540:1: ( rule__ExternalContent__Group__3__Impl )
            // InternalMath.g:1541:2: rule__ExternalContent__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalContent__Group__3__Impl();

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
    // $ANTLR end "rule__ExternalContent__Group__3"


    // $ANTLR start "rule__ExternalContent__Group__3__Impl"
    // InternalMath.g:1547:1: rule__ExternalContent__Group__3__Impl : ( ')' ) ;
    public final void rule__ExternalContent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1551:1: ( ( ')' ) )
            // InternalMath.g:1552:1: ( ')' )
            {
            // InternalMath.g:1552:1: ( ')' )
            // InternalMath.g:1553:2: ')'
            {
             before(grammarAccess.getExternalContentAccess().getRightParenthesisKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getExternalContentAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__ExternalContent__Group__3__Impl"


    // $ANTLR start "rule__ExternalContent__Group_2__0"
    // InternalMath.g:1563:1: rule__ExternalContent__Group_2__0 : rule__ExternalContent__Group_2__0__Impl rule__ExternalContent__Group_2__1 ;
    public final void rule__ExternalContent__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1567:1: ( rule__ExternalContent__Group_2__0__Impl rule__ExternalContent__Group_2__1 )
            // InternalMath.g:1568:2: rule__ExternalContent__Group_2__0__Impl rule__ExternalContent__Group_2__1
            {
            pushFollow(FOLLOW_22);
            rule__ExternalContent__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalContent__Group_2__1();

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
    // $ANTLR end "rule__ExternalContent__Group_2__0"


    // $ANTLR start "rule__ExternalContent__Group_2__0__Impl"
    // InternalMath.g:1575:1: rule__ExternalContent__Group_2__0__Impl : ( ( rule__ExternalContent__ParenAssignment_2_0 ) ) ;
    public final void rule__ExternalContent__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1579:1: ( ( ( rule__ExternalContent__ParenAssignment_2_0 ) ) )
            // InternalMath.g:1580:1: ( ( rule__ExternalContent__ParenAssignment_2_0 ) )
            {
            // InternalMath.g:1580:1: ( ( rule__ExternalContent__ParenAssignment_2_0 ) )
            // InternalMath.g:1581:2: ( rule__ExternalContent__ParenAssignment_2_0 )
            {
             before(grammarAccess.getExternalContentAccess().getParenAssignment_2_0()); 
            // InternalMath.g:1582:2: ( rule__ExternalContent__ParenAssignment_2_0 )
            // InternalMath.g:1582:3: rule__ExternalContent__ParenAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalContent__ParenAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getExternalContentAccess().getParenAssignment_2_0()); 

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
    // $ANTLR end "rule__ExternalContent__Group_2__0__Impl"


    // $ANTLR start "rule__ExternalContent__Group_2__1"
    // InternalMath.g:1590:1: rule__ExternalContent__Group_2__1 : rule__ExternalContent__Group_2__1__Impl ;
    public final void rule__ExternalContent__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1594:1: ( rule__ExternalContent__Group_2__1__Impl )
            // InternalMath.g:1595:2: rule__ExternalContent__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalContent__Group_2__1__Impl();

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
    // $ANTLR end "rule__ExternalContent__Group_2__1"


    // $ANTLR start "rule__ExternalContent__Group_2__1__Impl"
    // InternalMath.g:1601:1: rule__ExternalContent__Group_2__1__Impl : ( ( rule__ExternalContent__Group_2_1__0 )* ) ;
    public final void rule__ExternalContent__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1605:1: ( ( ( rule__ExternalContent__Group_2_1__0 )* ) )
            // InternalMath.g:1606:1: ( ( rule__ExternalContent__Group_2_1__0 )* )
            {
            // InternalMath.g:1606:1: ( ( rule__ExternalContent__Group_2_1__0 )* )
            // InternalMath.g:1607:2: ( rule__ExternalContent__Group_2_1__0 )*
            {
             before(grammarAccess.getExternalContentAccess().getGroup_2_1()); 
            // InternalMath.g:1608:2: ( rule__ExternalContent__Group_2_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==11) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMath.g:1608:3: rule__ExternalContent__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__ExternalContent__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getExternalContentAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__ExternalContent__Group_2__1__Impl"


    // $ANTLR start "rule__ExternalContent__Group_2_1__0"
    // InternalMath.g:1617:1: rule__ExternalContent__Group_2_1__0 : rule__ExternalContent__Group_2_1__0__Impl rule__ExternalContent__Group_2_1__1 ;
    public final void rule__ExternalContent__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1621:1: ( rule__ExternalContent__Group_2_1__0__Impl rule__ExternalContent__Group_2_1__1 )
            // InternalMath.g:1622:2: rule__ExternalContent__Group_2_1__0__Impl rule__ExternalContent__Group_2_1__1
            {
            pushFollow(FOLLOW_12);
            rule__ExternalContent__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalContent__Group_2_1__1();

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
    // $ANTLR end "rule__ExternalContent__Group_2_1__0"


    // $ANTLR start "rule__ExternalContent__Group_2_1__0__Impl"
    // InternalMath.g:1629:1: rule__ExternalContent__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__ExternalContent__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1633:1: ( ( ',' ) )
            // InternalMath.g:1634:1: ( ',' )
            {
            // InternalMath.g:1634:1: ( ',' )
            // InternalMath.g:1635:2: ','
            {
             before(grammarAccess.getExternalContentAccess().getCommaKeyword_2_1_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getExternalContentAccess().getCommaKeyword_2_1_0()); 

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
    // $ANTLR end "rule__ExternalContent__Group_2_1__0__Impl"


    // $ANTLR start "rule__ExternalContent__Group_2_1__1"
    // InternalMath.g:1644:1: rule__ExternalContent__Group_2_1__1 : rule__ExternalContent__Group_2_1__1__Impl ;
    public final void rule__ExternalContent__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1648:1: ( rule__ExternalContent__Group_2_1__1__Impl )
            // InternalMath.g:1649:2: rule__ExternalContent__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalContent__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__ExternalContent__Group_2_1__1"


    // $ANTLR start "rule__ExternalContent__Group_2_1__1__Impl"
    // InternalMath.g:1655:1: rule__ExternalContent__Group_2_1__1__Impl : ( ( rule__ExternalContent__ParenAssignment_2_1_1 ) ) ;
    public final void rule__ExternalContent__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1659:1: ( ( ( rule__ExternalContent__ParenAssignment_2_1_1 ) ) )
            // InternalMath.g:1660:1: ( ( rule__ExternalContent__ParenAssignment_2_1_1 ) )
            {
            // InternalMath.g:1660:1: ( ( rule__ExternalContent__ParenAssignment_2_1_1 ) )
            // InternalMath.g:1661:2: ( rule__ExternalContent__ParenAssignment_2_1_1 )
            {
             before(grammarAccess.getExternalContentAccess().getParenAssignment_2_1_1()); 
            // InternalMath.g:1662:2: ( rule__ExternalContent__ParenAssignment_2_1_1 )
            // InternalMath.g:1662:3: rule__ExternalContent__ParenAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ExternalContent__ParenAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalContentAccess().getParenAssignment_2_1_1()); 

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
    // $ANTLR end "rule__ExternalContent__Group_2_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_0__0"
    // InternalMath.g:1671:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1675:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalMath.g:1676:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMath.g:1683:1: rule__Primary__Group_0__0__Impl : ( () ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1687:1: ( ( () ) )
            // InternalMath.g:1688:1: ( () )
            {
            // InternalMath.g:1688:1: ( () )
            // InternalMath.g:1689:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getMyNumberAction_0_0()); 
            // InternalMath.g:1690:2: ()
            // InternalMath.g:1690:3: 
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
    // InternalMath.g:1698:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1702:1: ( rule__Primary__Group_0__1__Impl )
            // InternalMath.g:1703:2: rule__Primary__Group_0__1__Impl
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
    // InternalMath.g:1709:1: rule__Primary__Group_0__1__Impl : ( ( rule__Primary__ValueAssignment_0_1 ) ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1713:1: ( ( ( rule__Primary__ValueAssignment_0_1 ) ) )
            // InternalMath.g:1714:1: ( ( rule__Primary__ValueAssignment_0_1 ) )
            {
            // InternalMath.g:1714:1: ( ( rule__Primary__ValueAssignment_0_1 ) )
            // InternalMath.g:1715:2: ( rule__Primary__ValueAssignment_0_1 )
            {
             before(grammarAccess.getPrimaryAccess().getValueAssignment_0_1()); 
            // InternalMath.g:1716:2: ( rule__Primary__ValueAssignment_0_1 )
            // InternalMath.g:1716:3: rule__Primary__ValueAssignment_0_1
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


    // $ANTLR start "rule__Parenthesis__Group__0"
    // InternalMath.g:1725:1: rule__Parenthesis__Group__0 : rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1 ;
    public final void rule__Parenthesis__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1729:1: ( rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1 )
            // InternalMath.g:1730:2: rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Parenthesis__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__1();

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
    // $ANTLR end "rule__Parenthesis__Group__0"


    // $ANTLR start "rule__Parenthesis__Group__0__Impl"
    // InternalMath.g:1737:1: rule__Parenthesis__Group__0__Impl : ( () ) ;
    public final void rule__Parenthesis__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1741:1: ( ( () ) )
            // InternalMath.g:1742:1: ( () )
            {
            // InternalMath.g:1742:1: ( () )
            // InternalMath.g:1743:2: ()
            {
             before(grammarAccess.getParenthesisAccess().getParAction_0()); 
            // InternalMath.g:1744:2: ()
            // InternalMath.g:1744:3: 
            {
            }

             after(grammarAccess.getParenthesisAccess().getParAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__0__Impl"


    // $ANTLR start "rule__Parenthesis__Group__1"
    // InternalMath.g:1752:1: rule__Parenthesis__Group__1 : rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2 ;
    public final void rule__Parenthesis__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1756:1: ( rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2 )
            // InternalMath.g:1757:2: rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Parenthesis__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__2();

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
    // $ANTLR end "rule__Parenthesis__Group__1"


    // $ANTLR start "rule__Parenthesis__Group__1__Impl"
    // InternalMath.g:1764:1: rule__Parenthesis__Group__1__Impl : ( '(' ) ;
    public final void rule__Parenthesis__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1768:1: ( ( '(' ) )
            // InternalMath.g:1769:1: ( '(' )
            {
            // InternalMath.g:1769:1: ( '(' )
            // InternalMath.g:1770:2: '('
            {
             before(grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Parenthesis__Group__1__Impl"


    // $ANTLR start "rule__Parenthesis__Group__2"
    // InternalMath.g:1779:1: rule__Parenthesis__Group__2 : rule__Parenthesis__Group__2__Impl rule__Parenthesis__Group__3 ;
    public final void rule__Parenthesis__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1783:1: ( rule__Parenthesis__Group__2__Impl rule__Parenthesis__Group__3 )
            // InternalMath.g:1784:2: rule__Parenthesis__Group__2__Impl rule__Parenthesis__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Parenthesis__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__3();

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
    // $ANTLR end "rule__Parenthesis__Group__2"


    // $ANTLR start "rule__Parenthesis__Group__2__Impl"
    // InternalMath.g:1791:1: rule__Parenthesis__Group__2__Impl : ( ( rule__Parenthesis__ParenAssignment_2 ) ) ;
    public final void rule__Parenthesis__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1795:1: ( ( ( rule__Parenthesis__ParenAssignment_2 ) ) )
            // InternalMath.g:1796:1: ( ( rule__Parenthesis__ParenAssignment_2 ) )
            {
            // InternalMath.g:1796:1: ( ( rule__Parenthesis__ParenAssignment_2 ) )
            // InternalMath.g:1797:2: ( rule__Parenthesis__ParenAssignment_2 )
            {
             before(grammarAccess.getParenthesisAccess().getParenAssignment_2()); 
            // InternalMath.g:1798:2: ( rule__Parenthesis__ParenAssignment_2 )
            // InternalMath.g:1798:3: rule__Parenthesis__ParenAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Parenthesis__ParenAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParenthesisAccess().getParenAssignment_2()); 

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
    // $ANTLR end "rule__Parenthesis__Group__2__Impl"


    // $ANTLR start "rule__Parenthesis__Group__3"
    // InternalMath.g:1806:1: rule__Parenthesis__Group__3 : rule__Parenthesis__Group__3__Impl ;
    public final void rule__Parenthesis__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1810:1: ( rule__Parenthesis__Group__3__Impl )
            // InternalMath.g:1811:2: rule__Parenthesis__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__3__Impl();

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
    // $ANTLR end "rule__Parenthesis__Group__3"


    // $ANTLR start "rule__Parenthesis__Group__3__Impl"
    // InternalMath.g:1817:1: rule__Parenthesis__Group__3__Impl : ( ')' ) ;
    public final void rule__Parenthesis__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1821:1: ( ( ')' ) )
            // InternalMath.g:1822:1: ( ')' )
            {
            // InternalMath.g:1822:1: ( ')' )
            // InternalMath.g:1823:2: ')'
            {
             before(grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Parenthesis__Group__3__Impl"


    // $ANTLR start "rule__Program__NameAssignment_1"
    // InternalMath.g:1833:1: rule__Program__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Program__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1837:1: ( ( RULE_ID ) )
            // InternalMath.g:1838:2: ( RULE_ID )
            {
            // InternalMath.g:1838:2: ( RULE_ID )
            // InternalMath.g:1839:3: RULE_ID
            {
             before(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Program__NameAssignment_1"


    // $ANTLR start "rule__Program__ExternalsAssignment_2"
    // InternalMath.g:1848:1: rule__Program__ExternalsAssignment_2 : ( ruleExternal ) ;
    public final void rule__Program__ExternalsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1852:1: ( ( ruleExternal ) )
            // InternalMath.g:1853:2: ( ruleExternal )
            {
            // InternalMath.g:1853:2: ( ruleExternal )
            // InternalMath.g:1854:3: ruleExternal
            {
             before(grammarAccess.getProgramAccess().getExternalsExternalParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExternal();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getExternalsExternalParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Program__ExternalsAssignment_2"


    // $ANTLR start "rule__Program__ExpAssignment_3"
    // InternalMath.g:1863:1: rule__Program__ExpAssignment_3 : ( ruleVar ) ;
    public final void rule__Program__ExpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1867:1: ( ( ruleVar ) )
            // InternalMath.g:1868:2: ( ruleVar )
            {
            // InternalMath.g:1868:2: ( ruleVar )
            // InternalMath.g:1869:3: ruleVar
            {
             before(grammarAccess.getProgramAccess().getExpVarParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVar();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getExpVarParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Program__ExpAssignment_3"


    // $ANTLR start "rule__External__NameAssignment_1"
    // InternalMath.g:1878:1: rule__External__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__External__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1882:1: ( ( RULE_ID ) )
            // InternalMath.g:1883:2: ( RULE_ID )
            {
            // InternalMath.g:1883:2: ( RULE_ID )
            // InternalMath.g:1884:3: RULE_ID
            {
             before(grammarAccess.getExternalAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExternalAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__External__NameAssignment_1"


    // $ANTLR start "rule__External__ParenAssignment_3"
    // InternalMath.g:1893:1: rule__External__ParenAssignment_3 : ( ruleType ) ;
    public final void rule__External__ParenAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1897:1: ( ( ruleType ) )
            // InternalMath.g:1898:2: ( ruleType )
            {
            // InternalMath.g:1898:2: ( ruleType )
            // InternalMath.g:1899:3: ruleType
            {
             before(grammarAccess.getExternalAccess().getParenTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getExternalAccess().getParenTypeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__External__ParenAssignment_3"


    // $ANTLR start "rule__Type__NameAssignment_0"
    // InternalMath.g:1908:1: rule__Type__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1912:1: ( ( RULE_ID ) )
            // InternalMath.g:1913:2: ( RULE_ID )
            {
            // InternalMath.g:1913:2: ( RULE_ID )
            // InternalMath.g:1914:3: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Type__NameAssignment_0"


    // $ANTLR start "rule__Var__NameAssignment_1"
    // InternalMath.g:1923:1: rule__Var__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Var__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1927:1: ( ( RULE_ID ) )
            // InternalMath.g:1928:2: ( RULE_ID )
            {
            // InternalMath.g:1928:2: ( RULE_ID )
            // InternalMath.g:1929:3: RULE_ID
            {
             before(grammarAccess.getVarAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVarAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Var__NameAssignment_1"


    // $ANTLR start "rule__Var__ExpressionAssignment_3"
    // InternalMath.g:1938:1: rule__Var__ExpressionAssignment_3 : ( rulePlusMinus ) ;
    public final void rule__Var__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1942:1: ( ( rulePlusMinus ) )
            // InternalMath.g:1943:2: ( rulePlusMinus )
            {
            // InternalMath.g:1943:2: ( rulePlusMinus )
            // InternalMath.g:1944:3: rulePlusMinus
            {
             before(grammarAccess.getVarAccess().getExpressionPlusMinusParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePlusMinus();

            state._fsp--;

             after(grammarAccess.getVarAccess().getExpressionPlusMinusParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Var__ExpressionAssignment_3"


    // $ANTLR start "rule__Let__NameAssignment_1"
    // InternalMath.g:1953:1: rule__Let__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Let__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1957:1: ( ( RULE_ID ) )
            // InternalMath.g:1958:2: ( RULE_ID )
            {
            // InternalMath.g:1958:2: ( RULE_ID )
            // InternalMath.g:1959:3: RULE_ID
            {
             before(grammarAccess.getLetAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLetAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Let__NameAssignment_1"


    // $ANTLR start "rule__Let__BindingAssignment_3"
    // InternalMath.g:1968:1: rule__Let__BindingAssignment_3 : ( rulePlusMinus ) ;
    public final void rule__Let__BindingAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1972:1: ( ( rulePlusMinus ) )
            // InternalMath.g:1973:2: ( rulePlusMinus )
            {
            // InternalMath.g:1973:2: ( rulePlusMinus )
            // InternalMath.g:1974:3: rulePlusMinus
            {
             before(grammarAccess.getLetAccess().getBindingPlusMinusParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePlusMinus();

            state._fsp--;

             after(grammarAccess.getLetAccess().getBindingPlusMinusParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Let__BindingAssignment_3"


    // $ANTLR start "rule__Let__BodyAssignment_5"
    // InternalMath.g:1983:1: rule__Let__BodyAssignment_5 : ( rulePlusMinus ) ;
    public final void rule__Let__BodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1987:1: ( ( rulePlusMinus ) )
            // InternalMath.g:1988:2: ( rulePlusMinus )
            {
            // InternalMath.g:1988:2: ( rulePlusMinus )
            // InternalMath.g:1989:3: rulePlusMinus
            {
             before(grammarAccess.getLetAccess().getBodyPlusMinusParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            rulePlusMinus();

            state._fsp--;

             after(grammarAccess.getLetAccess().getBodyPlusMinusParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Let__BodyAssignment_5"


    // $ANTLR start "rule__PlusMinus__RightAssignment_1_0_2"
    // InternalMath.g:1998:1: rule__PlusMinus__RightAssignment_1_0_2 : ( ruleTerm ) ;
    public final void rule__PlusMinus__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:2002:1: ( ( ruleTerm ) )
            // InternalMath.g:2003:2: ( ruleTerm )
            {
            // InternalMath.g:2003:2: ( ruleTerm )
            // InternalMath.g:2004:3: ruleTerm
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
    // InternalMath.g:2013:1: rule__PlusMinus__RightAssignment_1_1_2 : ( ruleTerm ) ;
    public final void rule__PlusMinus__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:2017:1: ( ( ruleTerm ) )
            // InternalMath.g:2018:2: ( ruleTerm )
            {
            // InternalMath.g:2018:2: ( ruleTerm )
            // InternalMath.g:2019:3: ruleTerm
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
    // InternalMath.g:2028:1: rule__Term__RightAssignment_1_0_2 : ( rulePrimary ) ;
    public final void rule__Term__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:2032:1: ( ( rulePrimary ) )
            // InternalMath.g:2033:2: ( rulePrimary )
            {
            // InternalMath.g:2033:2: ( rulePrimary )
            // InternalMath.g:2034:3: rulePrimary
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
    // InternalMath.g:2043:1: rule__Term__RightAssignment_1_1_2 : ( rulePrimary ) ;
    public final void rule__Term__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:2047:1: ( ( rulePrimary ) )
            // InternalMath.g:2048:2: ( rulePrimary )
            {
            // InternalMath.g:2048:2: ( rulePrimary )
            // InternalMath.g:2049:3: rulePrimary
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


    // $ANTLR start "rule__ExternalContent__NameAssignment_0"
    // InternalMath.g:2058:1: rule__ExternalContent__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ExternalContent__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:2062:1: ( ( RULE_ID ) )
            // InternalMath.g:2063:2: ( RULE_ID )
            {
            // InternalMath.g:2063:2: ( RULE_ID )
            // InternalMath.g:2064:3: RULE_ID
            {
             before(grammarAccess.getExternalContentAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExternalContentAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__ExternalContent__NameAssignment_0"


    // $ANTLR start "rule__ExternalContent__ParenAssignment_2_0"
    // InternalMath.g:2073:1: rule__ExternalContent__ParenAssignment_2_0 : ( rulePlusMinus ) ;
    public final void rule__ExternalContent__ParenAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:2077:1: ( ( rulePlusMinus ) )
            // InternalMath.g:2078:2: ( rulePlusMinus )
            {
            // InternalMath.g:2078:2: ( rulePlusMinus )
            // InternalMath.g:2079:3: rulePlusMinus
            {
             before(grammarAccess.getExternalContentAccess().getParenPlusMinusParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            rulePlusMinus();

            state._fsp--;

             after(grammarAccess.getExternalContentAccess().getParenPlusMinusParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__ExternalContent__ParenAssignment_2_0"


    // $ANTLR start "rule__ExternalContent__ParenAssignment_2_1_1"
    // InternalMath.g:2088:1: rule__ExternalContent__ParenAssignment_2_1_1 : ( rulePlusMinus ) ;
    public final void rule__ExternalContent__ParenAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:2092:1: ( ( rulePlusMinus ) )
            // InternalMath.g:2093:2: ( rulePlusMinus )
            {
            // InternalMath.g:2093:2: ( rulePlusMinus )
            // InternalMath.g:2094:3: rulePlusMinus
            {
             before(grammarAccess.getExternalContentAccess().getParenPlusMinusParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePlusMinus();

            state._fsp--;

             after(grammarAccess.getExternalContentAccess().getParenPlusMinusParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__ExternalContent__ParenAssignment_2_1_1"


    // $ANTLR start "rule__Primary__ValueAssignment_0_1"
    // InternalMath.g:2103:1: rule__Primary__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Primary__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:2107:1: ( ( RULE_INT ) )
            // InternalMath.g:2108:2: ( RULE_INT )
            {
            // InternalMath.g:2108:2: ( RULE_INT )
            // InternalMath.g:2109:3: RULE_INT
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


    // $ANTLR start "rule__Parenthesis__ParenAssignment_2"
    // InternalMath.g:2118:1: rule__Parenthesis__ParenAssignment_2 : ( rulePlusMinus ) ;
    public final void rule__Parenthesis__ParenAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:2122:1: ( ( rulePlusMinus ) )
            // InternalMath.g:2123:2: ( rulePlusMinus )
            {
            // InternalMath.g:2123:2: ( rulePlusMinus )
            // InternalMath.g:2124:3: rulePlusMinus
            {
             before(grammarAccess.getParenthesisAccess().getParenPlusMinusParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePlusMinus();

            state._fsp--;

             after(grammarAccess.getParenthesisAccess().getParenPlusMinusParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Parenthesis__ParenAssignment_2"


    // $ANTLR start "rule__VariableUse__RefAssignment"
    // InternalMath.g:2133:1: rule__VariableUse__RefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__VariableUse__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:2137:1: ( ( ( RULE_ID ) ) )
            // InternalMath.g:2138:2: ( ( RULE_ID ) )
            {
            // InternalMath.g:2138:2: ( ( RULE_ID ) )
            // InternalMath.g:2139:3: ( RULE_ID )
            {
             before(grammarAccess.getVariableUseAccess().getRefBindingCrossReference_0()); 
            // InternalMath.g:2140:3: ( RULE_ID )
            // InternalMath.g:2141:4: RULE_ID
            {
             before(grammarAccess.getVariableUseAccess().getRefBindingIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableUseAccess().getRefBindingIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getVariableUseAccess().getRefBindingCrossReference_0()); 

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
    // $ANTLR end "rule__VariableUse__RefAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000048030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000049030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000001000L});

}