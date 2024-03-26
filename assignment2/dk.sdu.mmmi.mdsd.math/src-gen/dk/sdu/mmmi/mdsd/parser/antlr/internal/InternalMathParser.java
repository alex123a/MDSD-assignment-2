package dk.sdu.mmmi.mdsd.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.sdu.mmmi.mdsd.services.MathGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var '", "' = '", "'let '", "' let '", "'='", "'in'", "' in '", "'end'", "' end '", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
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

        public InternalMathParser(TokenStream input, MathGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MathExp";
       	}

       	@Override
       	protected MathGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMathExp"
    // InternalMath.g:64:1: entryRuleMathExp returns [EObject current=null] : iv_ruleMathExp= ruleMathExp EOF ;
    public final EObject entryRuleMathExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExp = null;


        try {
            // InternalMath.g:64:48: (iv_ruleMathExp= ruleMathExp EOF )
            // InternalMath.g:65:2: iv_ruleMathExp= ruleMathExp EOF
            {
             newCompositeNode(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathExp=ruleMathExp();

            state._fsp--;

             current =iv_ruleMathExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalMath.g:71:1: ruleMathExp returns [EObject current=null] : ( (lv_exp_0_0= ruleExp ) ) ;
    public final EObject ruleMathExp() throws RecognitionException {
        EObject current = null;

        EObject lv_exp_0_0 = null;



        	enterRule();

        try {
            // InternalMath.g:77:2: ( ( (lv_exp_0_0= ruleExp ) ) )
            // InternalMath.g:78:2: ( (lv_exp_0_0= ruleExp ) )
            {
            // InternalMath.g:78:2: ( (lv_exp_0_0= ruleExp ) )
            // InternalMath.g:79:3: (lv_exp_0_0= ruleExp )
            {
            // InternalMath.g:79:3: (lv_exp_0_0= ruleExp )
            // InternalMath.g:80:4: lv_exp_0_0= ruleExp
            {

            				newCompositeNode(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_exp_0_0=ruleExp();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getMathExpRule());
            				}
            				set(
            					current,
            					"exp",
            					lv_exp_0_0,
            					"dk.sdu.mmmi.mdsd.Math.Exp");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleExp"
    // InternalMath.g:100:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalMath.g:100:44: (iv_ruleExp= ruleExp EOF )
            // InternalMath.g:101:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalMath.g:107:1: ruleExp returns [EObject current=null] : this_Var_0= ruleVar ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        EObject this_Var_0 = null;



        	enterRule();

        try {
            // InternalMath.g:113:2: (this_Var_0= ruleVar )
            // InternalMath.g:114:2: this_Var_0= ruleVar
            {

            		newCompositeNode(grammarAccess.getExpAccess().getVarParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Var_0=ruleVar();

            state._fsp--;


            		current = this_Var_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleVar"
    // InternalMath.g:125:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // InternalMath.g:125:44: (iv_ruleVar= ruleVar EOF )
            // InternalMath.g:126:2: iv_ruleVar= ruleVar EOF
            {
             newCompositeNode(grammarAccess.getVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVar=ruleVar();

            state._fsp--;

             current =iv_ruleVar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // InternalMath.g:132:1: ruleVar returns [EObject current=null] : (this_Let_0= ruleLet ( () otherlv_2= 'var ' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ' = ' ( (lv_right_5_0= ruleLet ) ) )* ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        EObject this_Let_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:138:2: ( (this_Let_0= ruleLet ( () otherlv_2= 'var ' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ' = ' ( (lv_right_5_0= ruleLet ) ) )* ) )
            // InternalMath.g:139:2: (this_Let_0= ruleLet ( () otherlv_2= 'var ' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ' = ' ( (lv_right_5_0= ruleLet ) ) )* )
            {
            // InternalMath.g:139:2: (this_Let_0= ruleLet ( () otherlv_2= 'var ' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ' = ' ( (lv_right_5_0= ruleLet ) ) )* )
            // InternalMath.g:140:3: this_Let_0= ruleLet ( () otherlv_2= 'var ' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ' = ' ( (lv_right_5_0= ruleLet ) ) )*
            {

            			newCompositeNode(grammarAccess.getVarAccess().getLetParserRuleCall_0());
            		
            pushFollow(FOLLOW_3);
            this_Let_0=ruleLet();

            state._fsp--;


            			current = this_Let_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:148:3: ( () otherlv_2= 'var ' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ' = ' ( (lv_right_5_0= ruleLet ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMath.g:149:4: () otherlv_2= 'var ' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ' = ' ( (lv_right_5_0= ruleLet ) )
            	    {
            	    // InternalMath.g:149:4: ()
            	    // InternalMath.g:150:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getVarAccess().getVarLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,11,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getVarAccess().getVarKeyword_1_1());
            	    			
            	    // InternalMath.g:160:4: ( (lv_name_3_0= RULE_ID ) )
            	    // InternalMath.g:161:5: (lv_name_3_0= RULE_ID )
            	    {
            	    // InternalMath.g:161:5: (lv_name_3_0= RULE_ID )
            	    // InternalMath.g:162:6: lv_name_3_0= RULE_ID
            	    {
            	    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            	    						newLeafNode(lv_name_3_0, grammarAccess.getVarAccess().getNameIDTerminalRuleCall_1_2_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getVarRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"name",
            	    							lv_name_3_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }

            	    otherlv_4=(Token)match(input,12,FOLLOW_6); 

            	    				newLeafNode(otherlv_4, grammarAccess.getVarAccess().getSpaceEqualsSignSpaceKeyword_1_3());
            	    			
            	    // InternalMath.g:182:4: ( (lv_right_5_0= ruleLet ) )
            	    // InternalMath.g:183:5: (lv_right_5_0= ruleLet )
            	    {
            	    // InternalMath.g:183:5: (lv_right_5_0= ruleLet )
            	    // InternalMath.g:184:6: lv_right_5_0= ruleLet
            	    {

            	    						newCompositeNode(grammarAccess.getVarAccess().getRightLetParserRuleCall_1_4_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_right_5_0=ruleLet();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVarRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.mmmi.mdsd.Math.Let");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVar"


    // $ANTLR start "entryRuleLet"
    // InternalMath.g:206:1: entryRuleLet returns [EObject current=null] : iv_ruleLet= ruleLet EOF ;
    public final EObject entryRuleLet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLet = null;


        try {
            // InternalMath.g:206:44: (iv_ruleLet= ruleLet EOF )
            // InternalMath.g:207:2: iv_ruleLet= ruleLet EOF
            {
             newCompositeNode(grammarAccess.getLetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLet=ruleLet();

            state._fsp--;

             current =iv_ruleLet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLet"


    // $ANTLR start "ruleLet"
    // InternalMath.g:213:1: ruleLet returns [EObject current=null] : (this_PlusMinus_0= rulePlusMinus ( ( () (otherlv_2= 'let ' | otherlv_3= ' let ' ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ' = ' | otherlv_6= '=' ) ( (lv_right_7_0= rulePlusMinus ) ) ) | ( () (otherlv_9= 'in' | otherlv_10= ' in ' ) ( (lv_right_11_0= rulePlusMinus ) ) ) | ( () (otherlv_13= 'end' | otherlv_14= ' end ' ) ( (lv_right_15_0= rulePlusMinus ) ) ) )* ) ;
    public final EObject ruleLet() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject this_PlusMinus_0 = null;

        EObject lv_right_7_0 = null;

        EObject lv_right_11_0 = null;

        EObject lv_right_15_0 = null;



        	enterRule();

        try {
            // InternalMath.g:219:2: ( (this_PlusMinus_0= rulePlusMinus ( ( () (otherlv_2= 'let ' | otherlv_3= ' let ' ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ' = ' | otherlv_6= '=' ) ( (lv_right_7_0= rulePlusMinus ) ) ) | ( () (otherlv_9= 'in' | otherlv_10= ' in ' ) ( (lv_right_11_0= rulePlusMinus ) ) ) | ( () (otherlv_13= 'end' | otherlv_14= ' end ' ) ( (lv_right_15_0= rulePlusMinus ) ) ) )* ) )
            // InternalMath.g:220:2: (this_PlusMinus_0= rulePlusMinus ( ( () (otherlv_2= 'let ' | otherlv_3= ' let ' ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ' = ' | otherlv_6= '=' ) ( (lv_right_7_0= rulePlusMinus ) ) ) | ( () (otherlv_9= 'in' | otherlv_10= ' in ' ) ( (lv_right_11_0= rulePlusMinus ) ) ) | ( () (otherlv_13= 'end' | otherlv_14= ' end ' ) ( (lv_right_15_0= rulePlusMinus ) ) ) )* )
            {
            // InternalMath.g:220:2: (this_PlusMinus_0= rulePlusMinus ( ( () (otherlv_2= 'let ' | otherlv_3= ' let ' ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ' = ' | otherlv_6= '=' ) ( (lv_right_7_0= rulePlusMinus ) ) ) | ( () (otherlv_9= 'in' | otherlv_10= ' in ' ) ( (lv_right_11_0= rulePlusMinus ) ) ) | ( () (otherlv_13= 'end' | otherlv_14= ' end ' ) ( (lv_right_15_0= rulePlusMinus ) ) ) )* )
            // InternalMath.g:221:3: this_PlusMinus_0= rulePlusMinus ( ( () (otherlv_2= 'let ' | otherlv_3= ' let ' ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ' = ' | otherlv_6= '=' ) ( (lv_right_7_0= rulePlusMinus ) ) ) | ( () (otherlv_9= 'in' | otherlv_10= ' in ' ) ( (lv_right_11_0= rulePlusMinus ) ) ) | ( () (otherlv_13= 'end' | otherlv_14= ' end ' ) ( (lv_right_15_0= rulePlusMinus ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getLetAccess().getPlusMinusParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_PlusMinus_0=rulePlusMinus();

            state._fsp--;


            			current = this_PlusMinus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:229:3: ( ( () (otherlv_2= 'let ' | otherlv_3= ' let ' ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ' = ' | otherlv_6= '=' ) ( (lv_right_7_0= rulePlusMinus ) ) ) | ( () (otherlv_9= 'in' | otherlv_10= ' in ' ) ( (lv_right_11_0= rulePlusMinus ) ) ) | ( () (otherlv_13= 'end' | otherlv_14= ' end ' ) ( (lv_right_15_0= rulePlusMinus ) ) ) )*
            loop6:
            do {
                int alt6=4;
                switch ( input.LA(1) ) {
                case 13:
                case 14:
                    {
                    alt6=1;
                    }
                    break;
                case 16:
                case 17:
                    {
                    alt6=2;
                    }
                    break;
                case 18:
                case 19:
                    {
                    alt6=3;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // InternalMath.g:230:4: ( () (otherlv_2= 'let ' | otherlv_3= ' let ' ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ' = ' | otherlv_6= '=' ) ( (lv_right_7_0= rulePlusMinus ) ) )
            	    {
            	    // InternalMath.g:230:4: ( () (otherlv_2= 'let ' | otherlv_3= ' let ' ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ' = ' | otherlv_6= '=' ) ( (lv_right_7_0= rulePlusMinus ) ) )
            	    // InternalMath.g:231:5: () (otherlv_2= 'let ' | otherlv_3= ' let ' ) ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ' = ' | otherlv_6= '=' ) ( (lv_right_7_0= rulePlusMinus ) )
            	    {
            	    // InternalMath.g:231:5: ()
            	    // InternalMath.g:232:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getLetAccess().getLetLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    // InternalMath.g:238:5: (otherlv_2= 'let ' | otherlv_3= ' let ' )
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==13) ) {
            	        alt2=1;
            	    }
            	    else if ( (LA2_0==14) ) {
            	        alt2=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 2, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // InternalMath.g:239:6: otherlv_2= 'let '
            	            {
            	            otherlv_2=(Token)match(input,13,FOLLOW_4); 

            	            						newLeafNode(otherlv_2, grammarAccess.getLetAccess().getLetKeyword_1_0_1_0());
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalMath.g:244:6: otherlv_3= ' let '
            	            {
            	            otherlv_3=(Token)match(input,14,FOLLOW_4); 

            	            						newLeafNode(otherlv_3, grammarAccess.getLetAccess().getLetKeyword_1_0_1_1());
            	            					

            	            }
            	            break;

            	    }

            	    // InternalMath.g:249:5: ( (lv_name_4_0= RULE_ID ) )
            	    // InternalMath.g:250:6: (lv_name_4_0= RULE_ID )
            	    {
            	    // InternalMath.g:250:6: (lv_name_4_0= RULE_ID )
            	    // InternalMath.g:251:7: lv_name_4_0= RULE_ID
            	    {
            	    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    							newLeafNode(lv_name_4_0, grammarAccess.getLetAccess().getNameIDTerminalRuleCall_1_0_2_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getLetRule());
            	    							}
            	    							setWithLastConsumed(
            	    								current,
            	    								"name",
            	    								lv_name_4_0,
            	    								"org.eclipse.xtext.common.Terminals.ID");
            	    						

            	    }


            	    }

            	    // InternalMath.g:267:5: (otherlv_5= ' = ' | otherlv_6= '=' )
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==12) ) {
            	        alt3=1;
            	    }
            	    else if ( (LA3_0==15) ) {
            	        alt3=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalMath.g:268:6: otherlv_5= ' = '
            	            {
            	            otherlv_5=(Token)match(input,12,FOLLOW_6); 

            	            						newLeafNode(otherlv_5, grammarAccess.getLetAccess().getSpaceEqualsSignSpaceKeyword_1_0_3_0());
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalMath.g:273:6: otherlv_6= '='
            	            {
            	            otherlv_6=(Token)match(input,15,FOLLOW_6); 

            	            						newLeafNode(otherlv_6, grammarAccess.getLetAccess().getEqualsSignKeyword_1_0_3_1());
            	            					

            	            }
            	            break;

            	    }

            	    // InternalMath.g:278:5: ( (lv_right_7_0= rulePlusMinus ) )
            	    // InternalMath.g:279:6: (lv_right_7_0= rulePlusMinus )
            	    {
            	    // InternalMath.g:279:6: (lv_right_7_0= rulePlusMinus )
            	    // InternalMath.g:280:7: lv_right_7_0= rulePlusMinus
            	    {

            	    							newCompositeNode(grammarAccess.getLetAccess().getRightPlusMinusParserRuleCall_1_0_4_0());
            	    						
            	    pushFollow(FOLLOW_7);
            	    lv_right_7_0=rulePlusMinus();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getLetRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_7_0,
            	    								"dk.sdu.mmmi.mdsd.Math.PlusMinus");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMath.g:299:4: ( () (otherlv_9= 'in' | otherlv_10= ' in ' ) ( (lv_right_11_0= rulePlusMinus ) ) )
            	    {
            	    // InternalMath.g:299:4: ( () (otherlv_9= 'in' | otherlv_10= ' in ' ) ( (lv_right_11_0= rulePlusMinus ) ) )
            	    // InternalMath.g:300:5: () (otherlv_9= 'in' | otherlv_10= ' in ' ) ( (lv_right_11_0= rulePlusMinus ) )
            	    {
            	    // InternalMath.g:300:5: ()
            	    // InternalMath.g:301:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getLetAccess().getInLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    // InternalMath.g:307:5: (otherlv_9= 'in' | otherlv_10= ' in ' )
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==16) ) {
            	        alt4=1;
            	    }
            	    else if ( (LA4_0==17) ) {
            	        alt4=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalMath.g:308:6: otherlv_9= 'in'
            	            {
            	            otherlv_9=(Token)match(input,16,FOLLOW_6); 

            	            						newLeafNode(otherlv_9, grammarAccess.getLetAccess().getInKeyword_1_1_1_0());
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalMath.g:313:6: otherlv_10= ' in '
            	            {
            	            otherlv_10=(Token)match(input,17,FOLLOW_6); 

            	            						newLeafNode(otherlv_10, grammarAccess.getLetAccess().getInKeyword_1_1_1_1());
            	            					

            	            }
            	            break;

            	    }

            	    // InternalMath.g:318:5: ( (lv_right_11_0= rulePlusMinus ) )
            	    // InternalMath.g:319:6: (lv_right_11_0= rulePlusMinus )
            	    {
            	    // InternalMath.g:319:6: (lv_right_11_0= rulePlusMinus )
            	    // InternalMath.g:320:7: lv_right_11_0= rulePlusMinus
            	    {

            	    							newCompositeNode(grammarAccess.getLetAccess().getRightPlusMinusParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_7);
            	    lv_right_11_0=rulePlusMinus();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getLetRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_11_0,
            	    								"dk.sdu.mmmi.mdsd.Math.PlusMinus");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMath.g:339:4: ( () (otherlv_13= 'end' | otherlv_14= ' end ' ) ( (lv_right_15_0= rulePlusMinus ) ) )
            	    {
            	    // InternalMath.g:339:4: ( () (otherlv_13= 'end' | otherlv_14= ' end ' ) ( (lv_right_15_0= rulePlusMinus ) ) )
            	    // InternalMath.g:340:5: () (otherlv_13= 'end' | otherlv_14= ' end ' ) ( (lv_right_15_0= rulePlusMinus ) )
            	    {
            	    // InternalMath.g:340:5: ()
            	    // InternalMath.g:341:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getLetAccess().getEndLeftAction_1_2_0(),
            	    							current);
            	    					

            	    }

            	    // InternalMath.g:347:5: (otherlv_13= 'end' | otherlv_14= ' end ' )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==18) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==19) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalMath.g:348:6: otherlv_13= 'end'
            	            {
            	            otherlv_13=(Token)match(input,18,FOLLOW_6); 

            	            						newLeafNode(otherlv_13, grammarAccess.getLetAccess().getEndKeyword_1_2_1_0());
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalMath.g:353:6: otherlv_14= ' end '
            	            {
            	            otherlv_14=(Token)match(input,19,FOLLOW_6); 

            	            						newLeafNode(otherlv_14, grammarAccess.getLetAccess().getEndKeyword_1_2_1_1());
            	            					

            	            }
            	            break;

            	    }

            	    // InternalMath.g:358:5: ( (lv_right_15_0= rulePlusMinus ) )
            	    // InternalMath.g:359:6: (lv_right_15_0= rulePlusMinus )
            	    {
            	    // InternalMath.g:359:6: (lv_right_15_0= rulePlusMinus )
            	    // InternalMath.g:360:7: lv_right_15_0= rulePlusMinus
            	    {

            	    							newCompositeNode(grammarAccess.getLetAccess().getRightPlusMinusParserRuleCall_1_2_2_0());
            	    						
            	    pushFollow(FOLLOW_7);
            	    lv_right_15_0=rulePlusMinus();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getLetRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_15_0,
            	    								"dk.sdu.mmmi.mdsd.Math.PlusMinus");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLet"


    // $ANTLR start "entryRulePlusMinus"
    // InternalMath.g:383:1: entryRulePlusMinus returns [EObject current=null] : iv_rulePlusMinus= rulePlusMinus EOF ;
    public final EObject entryRulePlusMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusMinus = null;


        try {
            // InternalMath.g:383:50: (iv_rulePlusMinus= rulePlusMinus EOF )
            // InternalMath.g:384:2: iv_rulePlusMinus= rulePlusMinus EOF
            {
             newCompositeNode(grammarAccess.getPlusMinusRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlusMinus=rulePlusMinus();

            state._fsp--;

             current =iv_rulePlusMinus; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlusMinus"


    // $ANTLR start "rulePlusMinus"
    // InternalMath.g:390:1: rulePlusMinus returns [EObject current=null] : (this_Term_0= ruleTerm ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleTerm ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleTerm ) ) ) )* ) ;
    public final EObject rulePlusMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Term_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalMath.g:396:2: ( (this_Term_0= ruleTerm ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleTerm ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleTerm ) ) ) )* ) )
            // InternalMath.g:397:2: (this_Term_0= ruleTerm ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleTerm ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleTerm ) ) ) )* )
            {
            // InternalMath.g:397:2: (this_Term_0= ruleTerm ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleTerm ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleTerm ) ) ) )* )
            // InternalMath.g:398:3: this_Term_0= ruleTerm ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleTerm ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleTerm ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusMinusAccess().getTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_Term_0=ruleTerm();

            state._fsp--;


            			current = this_Term_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:406:3: ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleTerm ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleTerm ) ) ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }
                else if ( (LA7_0==21) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMath.g:407:4: ( () otherlv_2= '+' ( (lv_right_3_0= ruleTerm ) ) )
            	    {
            	    // InternalMath.g:407:4: ( () otherlv_2= '+' ( (lv_right_3_0= ruleTerm ) ) )
            	    // InternalMath.g:408:5: () otherlv_2= '+' ( (lv_right_3_0= ruleTerm ) )
            	    {
            	    // InternalMath.g:408:5: ()
            	    // InternalMath.g:409:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getPlusMinusAccess().getPlusLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,20,FOLLOW_6); 

            	    					newLeafNode(otherlv_2, grammarAccess.getPlusMinusAccess().getPlusSignKeyword_1_0_1());
            	    				
            	    // InternalMath.g:419:5: ( (lv_right_3_0= ruleTerm ) )
            	    // InternalMath.g:420:6: (lv_right_3_0= ruleTerm )
            	    {
            	    // InternalMath.g:420:6: (lv_right_3_0= ruleTerm )
            	    // InternalMath.g:421:7: lv_right_3_0= ruleTerm
            	    {

            	    							newCompositeNode(grammarAccess.getPlusMinusAccess().getRightTermParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_9);
            	    lv_right_3_0=ruleTerm();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getPlusMinusRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_3_0,
            	    								"dk.sdu.mmmi.mdsd.Math.Term");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMath.g:440:4: ( () otherlv_5= '-' ( (lv_right_6_0= ruleTerm ) ) )
            	    {
            	    // InternalMath.g:440:4: ( () otherlv_5= '-' ( (lv_right_6_0= ruleTerm ) ) )
            	    // InternalMath.g:441:5: () otherlv_5= '-' ( (lv_right_6_0= ruleTerm ) )
            	    {
            	    // InternalMath.g:441:5: ()
            	    // InternalMath.g:442:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getPlusMinusAccess().getMinusLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,21,FOLLOW_6); 

            	    					newLeafNode(otherlv_5, grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1_1_1());
            	    				
            	    // InternalMath.g:452:5: ( (lv_right_6_0= ruleTerm ) )
            	    // InternalMath.g:453:6: (lv_right_6_0= ruleTerm )
            	    {
            	    // InternalMath.g:453:6: (lv_right_6_0= ruleTerm )
            	    // InternalMath.g:454:7: lv_right_6_0= ruleTerm
            	    {

            	    							newCompositeNode(grammarAccess.getPlusMinusAccess().getRightTermParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_9);
            	    lv_right_6_0=ruleTerm();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getPlusMinusRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_6_0,
            	    								"dk.sdu.mmmi.mdsd.Math.Term");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlusMinus"


    // $ANTLR start "entryRuleTerm"
    // InternalMath.g:477:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalMath.g:477:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalMath.g:478:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalMath.g:484:1: ruleTerm returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) ) )* ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalMath.g:490:2: ( (this_Primary_0= rulePrimary ( ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) ) )* ) )
            // InternalMath.g:491:2: (this_Primary_0= rulePrimary ( ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) ) )* )
            {
            // InternalMath.g:491:2: (this_Primary_0= rulePrimary ( ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) ) )* )
            // InternalMath.g:492:3: this_Primary_0= rulePrimary ( ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getTermAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_10);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:500:3: ( ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) ) )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }
                else if ( (LA8_0==23) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMath.g:501:4: ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) )
            	    {
            	    // InternalMath.g:501:4: ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) )
            	    // InternalMath.g:502:5: () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalMath.g:502:5: ()
            	    // InternalMath.g:503:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getTermAccess().getMultLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_6); 

            	    					newLeafNode(otherlv_2, grammarAccess.getTermAccess().getAsteriskKeyword_1_0_1());
            	    				
            	    // InternalMath.g:513:5: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalMath.g:514:6: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalMath.g:514:6: (lv_right_3_0= rulePrimary )
            	    // InternalMath.g:515:7: lv_right_3_0= rulePrimary
            	    {

            	    							newCompositeNode(grammarAccess.getTermAccess().getRightPrimaryParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_10);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getTermRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_3_0,
            	    								"dk.sdu.mmmi.mdsd.Math.Primary");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMath.g:534:4: ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) )
            	    {
            	    // InternalMath.g:534:4: ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) )
            	    // InternalMath.g:535:5: () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) )
            	    {
            	    // InternalMath.g:535:5: ()
            	    // InternalMath.g:536:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getTermAccess().getDivLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,23,FOLLOW_6); 

            	    					newLeafNode(otherlv_5, grammarAccess.getTermAccess().getSolidusKeyword_1_1_1());
            	    				
            	    // InternalMath.g:546:5: ( (lv_right_6_0= rulePrimary ) )
            	    // InternalMath.g:547:6: (lv_right_6_0= rulePrimary )
            	    {
            	    // InternalMath.g:547:6: (lv_right_6_0= rulePrimary )
            	    // InternalMath.g:548:7: lv_right_6_0= rulePrimary
            	    {

            	    							newCompositeNode(grammarAccess.getTermAccess().getRightPrimaryParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_10);
            	    lv_right_6_0=rulePrimary();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getTermRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_6_0,
            	    								"dk.sdu.mmmi.mdsd.Math.Primary");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRulePrimary"
    // InternalMath.g:571:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMath.g:571:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMath.g:572:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMath.g:578:1: rulePrimary returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_ID ) ) ) | (otherlv_4= '(' this_Exp_5= ruleExp otherlv_6= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_Exp_5 = null;



        	enterRule();

        try {
            // InternalMath.g:584:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_ID ) ) ) | (otherlv_4= '(' this_Exp_5= ruleExp otherlv_6= ')' ) ) )
            // InternalMath.g:585:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_ID ) ) ) | (otherlv_4= '(' this_Exp_5= ruleExp otherlv_6= ')' ) )
            {
            // InternalMath.g:585:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_ID ) ) ) | (otherlv_4= '(' this_Exp_5= ruleExp otherlv_6= ')' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt9=1;
                }
                break;
            case RULE_ID:
                {
                alt9=2;
                }
                break;
            case 24:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMath.g:586:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalMath.g:586:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalMath.g:587:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalMath.g:587:4: ()
                    // InternalMath.g:588:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getMyNumberAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMath.g:594:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalMath.g:595:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalMath.g:595:5: (lv_value_1_0= RULE_INT )
                    // InternalMath.g:596:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:614:3: ( () ( (lv_value_3_0= RULE_ID ) ) )
                    {
                    // InternalMath.g:614:3: ( () ( (lv_value_3_0= RULE_ID ) ) )
                    // InternalMath.g:615:4: () ( (lv_value_3_0= RULE_ID ) )
                    {
                    // InternalMath.g:615:4: ()
                    // InternalMath.g:616:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getVariableUseAction_1_0(),
                    						current);
                    				

                    }

                    // InternalMath.g:622:4: ( (lv_value_3_0= RULE_ID ) )
                    // InternalMath.g:623:5: (lv_value_3_0= RULE_ID )
                    {
                    // InternalMath.g:623:5: (lv_value_3_0= RULE_ID )
                    // InternalMath.g:624:6: lv_value_3_0= RULE_ID
                    {
                    lv_value_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getPrimaryAccess().getValueIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMath.g:642:3: (otherlv_4= '(' this_Exp_5= ruleExp otherlv_6= ')' )
                    {
                    // InternalMath.g:642:3: (otherlv_4= '(' this_Exp_5= ruleExp otherlv_6= ')' )
                    // InternalMath.g:643:4: otherlv_4= '(' this_Exp_5= ruleExp otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_11);
                    this_Exp_5=ruleExp();

                    state._fsp--;


                    				current = this_Exp_5;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_6=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000F6002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});

}