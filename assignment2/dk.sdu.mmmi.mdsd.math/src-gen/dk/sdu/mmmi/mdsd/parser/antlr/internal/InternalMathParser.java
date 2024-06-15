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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "'external'", "'('", "')'", "','", "'var'", "'='", "'let'", "'in'", "'end'", "'+'", "'-'", "'*'", "'/'"
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

        public InternalMathParser(TokenStream input, MathGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected MathGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalMath.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalMath.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalMath.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalMath.g:71:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externals_2_0= ruleExternal ) )* ( (lv_exp_3_0= ruleVar ) )* ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_externals_2_0 = null;

        EObject lv_exp_3_0 = null;



        	enterRule();

        try {
            // InternalMath.g:77:2: ( (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externals_2_0= ruleExternal ) )* ( (lv_exp_3_0= ruleVar ) )* ) )
            // InternalMath.g:78:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externals_2_0= ruleExternal ) )* ( (lv_exp_3_0= ruleVar ) )* )
            {
            // InternalMath.g:78:2: (otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externals_2_0= ruleExternal ) )* ( (lv_exp_3_0= ruleVar ) )* )
            // InternalMath.g:79:3: otherlv_0= 'program' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externals_2_0= ruleExternal ) )* ( (lv_exp_3_0= ruleVar ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getProgramKeyword_0());
            		
            // InternalMath.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProgramRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMath.g:101:3: ( (lv_externals_2_0= ruleExternal ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMath.g:102:4: (lv_externals_2_0= ruleExternal )
            	    {
            	    // InternalMath.g:102:4: (lv_externals_2_0= ruleExternal )
            	    // InternalMath.g:103:5: lv_externals_2_0= ruleExternal
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getExternalsExternalParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_externals_2_0=ruleExternal();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"externals",
            	    						lv_externals_2_0,
            	    						"dk.sdu.mmmi.mdsd.Math.External");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMath.g:120:3: ( (lv_exp_3_0= ruleVar ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMath.g:121:4: (lv_exp_3_0= ruleVar )
            	    {
            	    // InternalMath.g:121:4: (lv_exp_3_0= ruleVar )
            	    // InternalMath.g:122:5: lv_exp_3_0= ruleVar
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getExpVarParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_exp_3_0=ruleVar();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"exp",
            	    						lv_exp_3_0,
            	    						"dk.sdu.mmmi.mdsd.Math.Var");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleExternal"
    // InternalMath.g:143:1: entryRuleExternal returns [EObject current=null] : iv_ruleExternal= ruleExternal EOF ;
    public final EObject entryRuleExternal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternal = null;


        try {
            // InternalMath.g:143:49: (iv_ruleExternal= ruleExternal EOF )
            // InternalMath.g:144:2: iv_ruleExternal= ruleExternal EOF
            {
             newCompositeNode(grammarAccess.getExternalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternal=ruleExternal();

            state._fsp--;

             current =iv_ruleExternal; 
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
    // $ANTLR end "entryRuleExternal"


    // $ANTLR start "ruleExternal"
    // InternalMath.g:150:1: ruleExternal returns [EObject current=null] : (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_paren_3_0= ruleType ) )* (otherlv_4= ')' )? ) ;
    public final EObject ruleExternal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_paren_3_0 = null;



        	enterRule();

        try {
            // InternalMath.g:156:2: ( (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_paren_3_0= ruleType ) )* (otherlv_4= ')' )? ) )
            // InternalMath.g:157:2: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_paren_3_0= ruleType ) )* (otherlv_4= ')' )? )
            {
            // InternalMath.g:157:2: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_paren_3_0= ruleType ) )* (otherlv_4= ')' )? )
            // InternalMath.g:158:3: otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_paren_3_0= ruleType ) )* (otherlv_4= ')' )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalAccess().getExternalKeyword_0());
            		
            // InternalMath.g:162:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:163:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:163:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:164:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExternalAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMath.g:184:3: ( (lv_paren_3_0= ruleType ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMath.g:185:4: (lv_paren_3_0= ruleType )
            	    {
            	    // InternalMath.g:185:4: (lv_paren_3_0= ruleType )
            	    // InternalMath.g:186:5: lv_paren_3_0= ruleType
            	    {

            	    					newCompositeNode(grammarAccess.getExternalAccess().getParenTypeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_paren_3_0=ruleType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExternalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"paren",
            	    						lv_paren_3_0,
            	    						"dk.sdu.mmmi.mdsd.Math.Type");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalMath.g:203:3: (otherlv_4= ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMath.g:204:4: otherlv_4= ')'
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getExternalAccess().getRightParenthesisKeyword_4());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleExternal"


    // $ANTLR start "entryRuleType"
    // InternalMath.g:213:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalMath.g:213:45: (iv_ruleType= ruleType EOF )
            // InternalMath.g:214:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMath.g:220:1: ruleType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ',' | otherlv_2= ')' ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMath.g:226:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ',' | otherlv_2= ')' ) ) )
            // InternalMath.g:227:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ',' | otherlv_2= ')' ) )
            {
            // InternalMath.g:227:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ',' | otherlv_2= ')' ) )
            // InternalMath.g:228:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ',' | otherlv_2= ')' )
            {
            // InternalMath.g:228:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMath.g:229:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMath.g:229:4: (lv_name_0_0= RULE_ID )
            // InternalMath.g:230:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMath.g:246:3: (otherlv_1= ',' | otherlv_2= ')' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMath.g:247:4: otherlv_1= ','
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getCommaKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMath.g:252:4: otherlv_2= ')'
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getRightParenthesisKeyword_1_1());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleVar"
    // InternalMath.g:261:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // InternalMath.g:261:44: (iv_ruleVar= ruleVar EOF )
            // InternalMath.g:262:2: iv_ruleVar= ruleVar EOF
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
    // InternalMath.g:268:1: ruleVar returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= rulePlusMinus ) ) ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalMath.g:274:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= rulePlusMinus ) ) ) )
            // InternalMath.g:275:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= rulePlusMinus ) ) )
            {
            // InternalMath.g:275:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= rulePlusMinus ) ) )
            // InternalMath.g:276:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= rulePlusMinus ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVarAccess().getVarKeyword_0());
            		
            // InternalMath.g:280:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:281:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:281:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:282:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVarAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getVarAccess().getEqualsSignKeyword_2());
            		
            // InternalMath.g:302:3: ( (lv_expression_3_0= rulePlusMinus ) )
            // InternalMath.g:303:4: (lv_expression_3_0= rulePlusMinus )
            {
            // InternalMath.g:303:4: (lv_expression_3_0= rulePlusMinus )
            // InternalMath.g:304:5: lv_expression_3_0= rulePlusMinus
            {

            					newCompositeNode(grammarAccess.getVarAccess().getExpressionPlusMinusParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_3_0=rulePlusMinus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_3_0,
            						"dk.sdu.mmmi.mdsd.Math.PlusMinus");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleVar"


    // $ANTLR start "entryRuleLet"
    // InternalMath.g:325:1: entryRuleLet returns [EObject current=null] : iv_ruleLet= ruleLet EOF ;
    public final EObject entryRuleLet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLet = null;


        try {
            // InternalMath.g:325:44: (iv_ruleLet= ruleLet EOF )
            // InternalMath.g:326:2: iv_ruleLet= ruleLet EOF
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
    // InternalMath.g:332:1: ruleLet returns [EObject current=null] : (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= rulePlusMinus ) ) otherlv_4= 'in' ( (lv_body_5_0= rulePlusMinus ) ) otherlv_6= 'end' ) ;
    public final EObject ruleLet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_binding_3_0 = null;

        EObject lv_body_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:338:2: ( (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= rulePlusMinus ) ) otherlv_4= 'in' ( (lv_body_5_0= rulePlusMinus ) ) otherlv_6= 'end' ) )
            // InternalMath.g:339:2: (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= rulePlusMinus ) ) otherlv_4= 'in' ( (lv_body_5_0= rulePlusMinus ) ) otherlv_6= 'end' )
            {
            // InternalMath.g:339:2: (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= rulePlusMinus ) ) otherlv_4= 'in' ( (lv_body_5_0= rulePlusMinus ) ) otherlv_6= 'end' )
            // InternalMath.g:340:3: otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= rulePlusMinus ) ) otherlv_4= 'in' ( (lv_body_5_0= rulePlusMinus ) ) otherlv_6= 'end'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLetAccess().getLetKeyword_0());
            		
            // InternalMath.g:344:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:345:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:345:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:346:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLetAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getLetAccess().getEqualsSignKeyword_2());
            		
            // InternalMath.g:366:3: ( (lv_binding_3_0= rulePlusMinus ) )
            // InternalMath.g:367:4: (lv_binding_3_0= rulePlusMinus )
            {
            // InternalMath.g:367:4: (lv_binding_3_0= rulePlusMinus )
            // InternalMath.g:368:5: lv_binding_3_0= rulePlusMinus
            {

            					newCompositeNode(grammarAccess.getLetAccess().getBindingPlusMinusParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_binding_3_0=rulePlusMinus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetRule());
            					}
            					set(
            						current,
            						"binding",
            						lv_binding_3_0,
            						"dk.sdu.mmmi.mdsd.Math.PlusMinus");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getLetAccess().getInKeyword_4());
            		
            // InternalMath.g:389:3: ( (lv_body_5_0= rulePlusMinus ) )
            // InternalMath.g:390:4: (lv_body_5_0= rulePlusMinus )
            {
            // InternalMath.g:390:4: (lv_body_5_0= rulePlusMinus )
            // InternalMath.g:391:5: lv_body_5_0= rulePlusMinus
            {

            					newCompositeNode(grammarAccess.getLetAccess().getBodyPlusMinusParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_12);
            lv_body_5_0=rulePlusMinus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_5_0,
            						"dk.sdu.mmmi.mdsd.Math.PlusMinus");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLetAccess().getEndKeyword_6());
            		

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
    // InternalMath.g:416:1: entryRulePlusMinus returns [EObject current=null] : iv_rulePlusMinus= rulePlusMinus EOF ;
    public final EObject entryRulePlusMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusMinus = null;


        try {
            // InternalMath.g:416:50: (iv_rulePlusMinus= rulePlusMinus EOF )
            // InternalMath.g:417:2: iv_rulePlusMinus= rulePlusMinus EOF
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
    // InternalMath.g:423:1: rulePlusMinus returns [EObject current=null] : (this_Term_0= ruleTerm ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleTerm ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleTerm ) ) ) )* ) ;
    public final EObject rulePlusMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Term_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalMath.g:429:2: ( (this_Term_0= ruleTerm ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleTerm ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleTerm ) ) ) )* ) )
            // InternalMath.g:430:2: (this_Term_0= ruleTerm ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleTerm ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleTerm ) ) ) )* )
            {
            // InternalMath.g:430:2: (this_Term_0= ruleTerm ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleTerm ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleTerm ) ) ) )* )
            // InternalMath.g:431:3: this_Term_0= ruleTerm ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleTerm ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleTerm ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusMinusAccess().getTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_Term_0=ruleTerm();

            state._fsp--;


            			current = this_Term_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:439:3: ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleTerm ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleTerm ) ) ) )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }
                else if ( (LA6_0==22) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMath.g:440:4: ( () otherlv_2= '+' ( (lv_right_3_0= ruleTerm ) ) )
            	    {
            	    // InternalMath.g:440:4: ( () otherlv_2= '+' ( (lv_right_3_0= ruleTerm ) ) )
            	    // InternalMath.g:441:5: () otherlv_2= '+' ( (lv_right_3_0= ruleTerm ) )
            	    {
            	    // InternalMath.g:441:5: ()
            	    // InternalMath.g:442:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getPlusMinusAccess().getPlusLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,21,FOLLOW_10); 

            	    					newLeafNode(otherlv_2, grammarAccess.getPlusMinusAccess().getPlusSignKeyword_1_0_1());
            	    				
            	    // InternalMath.g:452:5: ( (lv_right_3_0= ruleTerm ) )
            	    // InternalMath.g:453:6: (lv_right_3_0= ruleTerm )
            	    {
            	    // InternalMath.g:453:6: (lv_right_3_0= ruleTerm )
            	    // InternalMath.g:454:7: lv_right_3_0= ruleTerm
            	    {

            	    							newCompositeNode(grammarAccess.getPlusMinusAccess().getRightTermParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_13);
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
            	    // InternalMath.g:473:4: ( () otherlv_5= '-' ( (lv_right_6_0= ruleTerm ) ) )
            	    {
            	    // InternalMath.g:473:4: ( () otherlv_5= '-' ( (lv_right_6_0= ruleTerm ) ) )
            	    // InternalMath.g:474:5: () otherlv_5= '-' ( (lv_right_6_0= ruleTerm ) )
            	    {
            	    // InternalMath.g:474:5: ()
            	    // InternalMath.g:475:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getPlusMinusAccess().getMinusLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,22,FOLLOW_10); 

            	    					newLeafNode(otherlv_5, grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1_1_1());
            	    				
            	    // InternalMath.g:485:5: ( (lv_right_6_0= ruleTerm ) )
            	    // InternalMath.g:486:6: (lv_right_6_0= ruleTerm )
            	    {
            	    // InternalMath.g:486:6: (lv_right_6_0= ruleTerm )
            	    // InternalMath.g:487:7: lv_right_6_0= ruleTerm
            	    {

            	    							newCompositeNode(grammarAccess.getPlusMinusAccess().getRightTermParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_13);
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
    // $ANTLR end "rulePlusMinus"


    // $ANTLR start "entryRuleTerm"
    // InternalMath.g:510:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalMath.g:510:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalMath.g:511:2: iv_ruleTerm= ruleTerm EOF
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
    // InternalMath.g:517:1: ruleTerm returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) ) )* ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalMath.g:523:2: ( (this_Primary_0= rulePrimary ( ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) ) )* ) )
            // InternalMath.g:524:2: (this_Primary_0= rulePrimary ( ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) ) )* )
            {
            // InternalMath.g:524:2: (this_Primary_0= rulePrimary ( ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) ) )* )
            // InternalMath.g:525:3: this_Primary_0= rulePrimary ( ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getTermAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:533:3: ( ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }
                else if ( (LA7_0==24) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMath.g:534:4: ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) )
            	    {
            	    // InternalMath.g:534:4: ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) )
            	    // InternalMath.g:535:5: () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalMath.g:535:5: ()
            	    // InternalMath.g:536:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getTermAccess().getMultLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,23,FOLLOW_10); 

            	    					newLeafNode(otherlv_2, grammarAccess.getTermAccess().getAsteriskKeyword_1_0_1());
            	    				
            	    // InternalMath.g:546:5: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalMath.g:547:6: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalMath.g:547:6: (lv_right_3_0= rulePrimary )
            	    // InternalMath.g:548:7: lv_right_3_0= rulePrimary
            	    {

            	    							newCompositeNode(grammarAccess.getTermAccess().getRightPrimaryParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
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
            	    // InternalMath.g:567:4: ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) )
            	    {
            	    // InternalMath.g:567:4: ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) )
            	    // InternalMath.g:568:5: () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) )
            	    {
            	    // InternalMath.g:568:5: ()
            	    // InternalMath.g:569:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getTermAccess().getDivLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,24,FOLLOW_10); 

            	    					newLeafNode(otherlv_5, grammarAccess.getTermAccess().getSolidusKeyword_1_1_1());
            	    				
            	    // InternalMath.g:579:5: ( (lv_right_6_0= rulePrimary ) )
            	    // InternalMath.g:580:6: (lv_right_6_0= rulePrimary )
            	    {
            	    // InternalMath.g:580:6: (lv_right_6_0= rulePrimary )
            	    // InternalMath.g:581:7: lv_right_6_0= rulePrimary
            	    {

            	    							newCompositeNode(grammarAccess.getTermAccess().getRightPrimaryParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleExternalContent"
    // InternalMath.g:604:1: entryRuleExternalContent returns [EObject current=null] : iv_ruleExternalContent= ruleExternalContent EOF ;
    public final EObject entryRuleExternalContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalContent = null;


        try {
            // InternalMath.g:604:56: (iv_ruleExternalContent= ruleExternalContent EOF )
            // InternalMath.g:605:2: iv_ruleExternalContent= ruleExternalContent EOF
            {
             newCompositeNode(grammarAccess.getExternalContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalContent=ruleExternalContent();

            state._fsp--;

             current =iv_ruleExternalContent; 
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
    // $ANTLR end "entryRuleExternalContent"


    // $ANTLR start "ruleExternalContent"
    // InternalMath.g:611:1: ruleExternalContent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_paren_2_0= rulePlusMinus ) ) (otherlv_3= ',' ( (lv_paren_4_0= rulePlusMinus ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleExternalContent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_paren_2_0 = null;

        EObject lv_paren_4_0 = null;



        	enterRule();

        try {
            // InternalMath.g:617:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_paren_2_0= rulePlusMinus ) ) (otherlv_3= ',' ( (lv_paren_4_0= rulePlusMinus ) ) )* )? otherlv_5= ')' ) )
            // InternalMath.g:618:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_paren_2_0= rulePlusMinus ) ) (otherlv_3= ',' ( (lv_paren_4_0= rulePlusMinus ) ) )* )? otherlv_5= ')' )
            {
            // InternalMath.g:618:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_paren_2_0= rulePlusMinus ) ) (otherlv_3= ',' ( (lv_paren_4_0= rulePlusMinus ) ) )* )? otherlv_5= ')' )
            // InternalMath.g:619:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_paren_2_0= rulePlusMinus ) ) (otherlv_3= ',' ( (lv_paren_4_0= rulePlusMinus ) ) )* )? otherlv_5= ')'
            {
            // InternalMath.g:619:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMath.g:620:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMath.g:620:4: (lv_name_0_0= RULE_ID )
            // InternalMath.g:621:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getExternalContentAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalContentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalContentAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMath.g:641:3: ( ( (lv_paren_2_0= rulePlusMinus ) ) (otherlv_3= ',' ( (lv_paren_4_0= rulePlusMinus ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_INT)||LA9_0==13||LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMath.g:642:4: ( (lv_paren_2_0= rulePlusMinus ) ) (otherlv_3= ',' ( (lv_paren_4_0= rulePlusMinus ) ) )*
                    {
                    // InternalMath.g:642:4: ( (lv_paren_2_0= rulePlusMinus ) )
                    // InternalMath.g:643:5: (lv_paren_2_0= rulePlusMinus )
                    {
                    // InternalMath.g:643:5: (lv_paren_2_0= rulePlusMinus )
                    // InternalMath.g:644:6: lv_paren_2_0= rulePlusMinus
                    {

                    						newCompositeNode(grammarAccess.getExternalContentAccess().getParenPlusMinusParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_paren_2_0=rulePlusMinus();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalContentRule());
                    						}
                    						add(
                    							current,
                    							"paren",
                    							lv_paren_2_0,
                    							"dk.sdu.mmmi.mdsd.Math.PlusMinus");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMath.g:661:4: (otherlv_3= ',' ( (lv_paren_4_0= rulePlusMinus ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==15) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMath.g:662:5: otherlv_3= ',' ( (lv_paren_4_0= rulePlusMinus ) )
                    	    {
                    	    otherlv_3=(Token)match(input,15,FOLLOW_10); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getExternalContentAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalMath.g:666:5: ( (lv_paren_4_0= rulePlusMinus ) )
                    	    // InternalMath.g:667:6: (lv_paren_4_0= rulePlusMinus )
                    	    {
                    	    // InternalMath.g:667:6: (lv_paren_4_0= rulePlusMinus )
                    	    // InternalMath.g:668:7: lv_paren_4_0= rulePlusMinus
                    	    {

                    	    							newCompositeNode(grammarAccess.getExternalContentAccess().getParenPlusMinusParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_paren_4_0=rulePlusMinus();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExternalContentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"paren",
                    	    								lv_paren_4_0,
                    	    								"dk.sdu.mmmi.mdsd.Math.PlusMinus");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getExternalContentAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleExternalContent"


    // $ANTLR start "entryRulePrimary"
    // InternalMath.g:695:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMath.g:695:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMath.g:696:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalMath.g:702:1: rulePrimary returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | this_Parenthesis_2= ruleParenthesis | this_VariableUse_3= ruleVariableUse | this_Let_4= ruleLet | this_ExternalContent_5= ruleExternalContent ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        EObject this_Parenthesis_2 = null;

        EObject this_VariableUse_3 = null;

        EObject this_Let_4 = null;

        EObject this_ExternalContent_5 = null;



        	enterRule();

        try {
            // InternalMath.g:708:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | this_Parenthesis_2= ruleParenthesis | this_VariableUse_3= ruleVariableUse | this_Let_4= ruleLet | this_ExternalContent_5= ruleExternalContent ) )
            // InternalMath.g:709:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | this_Parenthesis_2= ruleParenthesis | this_VariableUse_3= ruleVariableUse | this_Let_4= ruleLet | this_ExternalContent_5= ruleExternalContent )
            {
            // InternalMath.g:709:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | this_Parenthesis_2= ruleParenthesis | this_VariableUse_3= ruleVariableUse | this_Let_4= ruleLet | this_ExternalContent_5= ruleExternalContent )
            int alt10=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt10=1;
                }
                break;
            case 13:
                {
                alt10=2;
                }
                break;
            case RULE_ID:
                {
                int LA10_3 = input.LA(2);

                if ( (LA10_3==13) ) {
                    alt10=5;
                }
                else if ( (LA10_3==EOF||(LA10_3>=14 && LA10_3<=16)||(LA10_3>=19 && LA10_3<=24)) ) {
                    alt10=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 3, input);

                    throw nvae;
                }
                }
                break;
            case 18:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMath.g:710:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalMath.g:710:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalMath.g:711:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalMath.g:711:4: ()
                    // InternalMath.g:712:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getMyNumberAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMath.g:718:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalMath.g:719:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalMath.g:719:5: (lv_value_1_0= RULE_INT )
                    // InternalMath.g:720:6: lv_value_1_0= RULE_INT
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
                    // InternalMath.g:738:3: this_Parenthesis_2= ruleParenthesis
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parenthesis_2=ruleParenthesis();

                    state._fsp--;


                    			current = this_Parenthesis_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMath.g:747:3: this_VariableUse_3= ruleVariableUse
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableUse_3=ruleVariableUse();

                    state._fsp--;


                    			current = this_VariableUse_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMath.g:756:3: this_Let_4= ruleLet
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getLetParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Let_4=ruleLet();

                    state._fsp--;


                    			current = this_Let_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMath.g:765:3: this_ExternalContent_5= ruleExternalContent
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getExternalContentParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalContent_5=ruleExternalContent();

                    state._fsp--;


                    			current = this_ExternalContent_5;
                    			afterParserOrEnumRuleCall();
                    		

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


    // $ANTLR start "entryRuleParenthesis"
    // InternalMath.g:777:1: entryRuleParenthesis returns [EObject current=null] : iv_ruleParenthesis= ruleParenthesis EOF ;
    public final EObject entryRuleParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesis = null;


        try {
            // InternalMath.g:777:52: (iv_ruleParenthesis= ruleParenthesis EOF )
            // InternalMath.g:778:2: iv_ruleParenthesis= ruleParenthesis EOF
            {
             newCompositeNode(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenthesis=ruleParenthesis();

            state._fsp--;

             current =iv_ruleParenthesis; 
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
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalMath.g:784:1: ruleParenthesis returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_paren_2_0= rulePlusMinus ) ) otherlv_3= ')' ) ;
    public final EObject ruleParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_paren_2_0 = null;



        	enterRule();

        try {
            // InternalMath.g:790:2: ( ( () otherlv_1= '(' ( (lv_paren_2_0= rulePlusMinus ) ) otherlv_3= ')' ) )
            // InternalMath.g:791:2: ( () otherlv_1= '(' ( (lv_paren_2_0= rulePlusMinus ) ) otherlv_3= ')' )
            {
            // InternalMath.g:791:2: ( () otherlv_1= '(' ( (lv_paren_2_0= rulePlusMinus ) ) otherlv_3= ')' )
            // InternalMath.g:792:3: () otherlv_1= '(' ( (lv_paren_2_0= rulePlusMinus ) ) otherlv_3= ')'
            {
            // InternalMath.g:792:3: ()
            // InternalMath.g:793:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParenthesisAccess().getParAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMath.g:803:3: ( (lv_paren_2_0= rulePlusMinus ) )
            // InternalMath.g:804:4: (lv_paren_2_0= rulePlusMinus )
            {
            // InternalMath.g:804:4: (lv_paren_2_0= rulePlusMinus )
            // InternalMath.g:805:5: lv_paren_2_0= rulePlusMinus
            {

            					newCompositeNode(grammarAccess.getParenthesisAccess().getParenPlusMinusParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_paren_2_0=rulePlusMinus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParenthesisRule());
            					}
            					set(
            						current,
            						"paren",
            						lv_paren_2_0,
            						"dk.sdu.mmmi.mdsd.Math.PlusMinus");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleVariableUse"
    // InternalMath.g:830:1: entryRuleVariableUse returns [EObject current=null] : iv_ruleVariableUse= ruleVariableUse EOF ;
    public final EObject entryRuleVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableUse = null;


        try {
            // InternalMath.g:830:52: (iv_ruleVariableUse= ruleVariableUse EOF )
            // InternalMath.g:831:2: iv_ruleVariableUse= ruleVariableUse EOF
            {
             newCompositeNode(grammarAccess.getVariableUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableUse=ruleVariableUse();

            state._fsp--;

             current =iv_ruleVariableUse; 
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
    // $ANTLR end "entryRuleVariableUse"


    // $ANTLR start "ruleVariableUse"
    // InternalMath.g:837:1: ruleVariableUse returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVariableUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMath.g:843:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMath.g:844:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMath.g:844:2: ( (otherlv_0= RULE_ID ) )
            // InternalMath.g:845:3: (otherlv_0= RULE_ID )
            {
            // InternalMath.g:845:3: (otherlv_0= RULE_ID )
            // InternalMath.g:846:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableUseRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getVariableUseAccess().getRefBindingCrossReference_0());
            			

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
    // $ANTLR end "ruleVariableUse"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000011002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000042030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000046030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000004000L});

}