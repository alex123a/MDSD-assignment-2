/*
 * generated by Xtext 2.33.0
 */
grammar InternalMath;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package dk.sdu.mmmi.mdsd.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleMathExp
entryRuleMathExp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMathExpRule()); }
	iv_ruleMathExp=ruleMathExp
	{ $current=$iv_ruleMathExp.current; }
	EOF;

// Rule MathExp
ruleMathExp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_0());
			}
			lv_exp_0_0=ruleExp
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getMathExpRule());
				}
				set(
					$current,
					"exp",
					lv_exp_0_0,
					"dk.sdu.mmmi.mdsd.Math.Exp");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleExp
entryRuleExp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpRule()); }
	iv_ruleExp=ruleExp
	{ $current=$iv_ruleExp.current; }
	EOF;

// Rule Exp
ruleExp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getExpAccess().getVarParserRuleCall());
	}
	this_Var_0=ruleVar
	{
		$current = $this_Var_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleVar
entryRuleVar returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVarRule()); }
	iv_ruleVar=ruleVar
	{ $current=$iv_ruleVar.current; }
	EOF;

// Rule Var
ruleVar returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getVarAccess().getPlusMinusParserRuleCall_0());
		}
		this_PlusMinus_0=rulePlusMinus
		{
			$current = $this_PlusMinus_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getVarAccess().getVarLeftAction_1_0_0(),
							$current);
					}
				)
				otherlv_2='var '
				{
					newLeafNode(otherlv_2, grammarAccess.getVarAccess().getVarKeyword_1_0_1());
				}
				(
					(
						lv_name_3_0=RULE_ID
						{
							newLeafNode(lv_name_3_0, grammarAccess.getVarAccess().getNameIDTerminalRuleCall_1_0_2_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getVarRule());
							}
							setWithLastConsumed(
								$current,
								"name",
								lv_name_3_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
				otherlv_4=' = '
				{
					newLeafNode(otherlv_4, grammarAccess.getVarAccess().getSpaceEqualsSignSpaceKeyword_1_0_3());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getVarAccess().getRightVarParserRuleCall_1_0_4_0());
						}
						lv_right_5_0=ruleVar
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getVarRule());
							}
							set(
								$current,
								"right",
								lv_right_5_0,
								"dk.sdu.mmmi.mdsd.Math.Var");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getVarAccess().getLetLeftAction_1_1_0(),
							$current);
					}
				)
				otherlv_7='let '
				{
					newLeafNode(otherlv_7, grammarAccess.getVarAccess().getLetKeyword_1_1_1());
				}
				(
					(
						lv_name_8_0=RULE_ID
						{
							newLeafNode(lv_name_8_0, grammarAccess.getVarAccess().getNameIDTerminalRuleCall_1_1_2_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getVarRule());
							}
							setWithLastConsumed(
								$current,
								"name",
								lv_name_8_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
				(
					otherlv_9=' = '
					{
						newLeafNode(otherlv_9, grammarAccess.getVarAccess().getSpaceEqualsSignSpaceKeyword_1_1_3_0());
					}
					    |
					otherlv_10='='
					{
						newLeafNode(otherlv_10, grammarAccess.getVarAccess().getEqualsSignKeyword_1_1_3_1());
					}
				)
				(
					(
						{
							newCompositeNode(grammarAccess.getVarAccess().getRightPlusMinusParserRuleCall_1_1_4_0());
						}
						lv_right_11_0=rulePlusMinus
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getVarRule());
							}
							set(
								$current,
								"right",
								lv_right_11_0,
								"dk.sdu.mmmi.mdsd.Math.PlusMinus");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)
	)
;

// Entry rule entryRulePlusMinus
entryRulePlusMinus returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPlusMinusRule()); }
	iv_rulePlusMinus=rulePlusMinus
	{ $current=$iv_rulePlusMinus.current; }
	EOF;

// Rule PlusMinus
rulePlusMinus returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPlusMinusAccess().getTermParserRuleCall_0());
		}
		this_Term_0=ruleTerm
		{
			$current = $this_Term_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getPlusMinusAccess().getPlusLeftAction_1_0_0(),
							$current);
					}
				)
				otherlv_2='+'
				{
					newLeafNode(otherlv_2, grammarAccess.getPlusMinusAccess().getPlusSignKeyword_1_0_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getPlusMinusAccess().getRightTermParserRuleCall_1_0_2_0());
						}
						lv_right_3_0=ruleTerm
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getPlusMinusRule());
							}
							set(
								$current,
								"right",
								lv_right_3_0,
								"dk.sdu.mmmi.mdsd.Math.Term");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getPlusMinusAccess().getMinusLeftAction_1_1_0(),
							$current);
					}
				)
				otherlv_5='-'
				{
					newLeafNode(otherlv_5, grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1_1_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getPlusMinusAccess().getRightTermParserRuleCall_1_1_2_0());
						}
						lv_right_6_0=ruleTerm
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getPlusMinusRule());
							}
							set(
								$current,
								"right",
								lv_right_6_0,
								"dk.sdu.mmmi.mdsd.Math.Term");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)*
	)
;

// Entry rule entryRuleTerm
entryRuleTerm returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTermRule()); }
	iv_ruleTerm=ruleTerm
	{ $current=$iv_ruleTerm.current; }
	EOF;

// Rule Term
ruleTerm returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTermAccess().getPrimaryParserRuleCall_0());
		}
		this_Primary_0=rulePrimary
		{
			$current = $this_Primary_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getTermAccess().getMultLeftAction_1_0_0(),
							$current);
					}
				)
				otherlv_2='*'
				{
					newLeafNode(otherlv_2, grammarAccess.getTermAccess().getAsteriskKeyword_1_0_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getTermAccess().getRightPrimaryParserRuleCall_1_0_2_0());
						}
						lv_right_3_0=rulePrimary
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getTermRule());
							}
							set(
								$current,
								"right",
								lv_right_3_0,
								"dk.sdu.mmmi.mdsd.Math.Primary");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getTermAccess().getDivLeftAction_1_1_0(),
							$current);
					}
				)
				otherlv_5='/'
				{
					newLeafNode(otherlv_5, grammarAccess.getTermAccess().getSolidusKeyword_1_1_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getTermAccess().getRightPrimaryParserRuleCall_1_1_2_0());
						}
						lv_right_6_0=rulePrimary
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getTermRule());
							}
							set(
								$current,
								"right",
								lv_right_6_0,
								"dk.sdu.mmmi.mdsd.Math.Primary");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)*
	)
;

// Entry rule entryRulePrimary
entryRulePrimary returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimaryRule()); }
	iv_rulePrimary=rulePrimary
	{ $current=$iv_rulePrimary.current; }
	EOF;

// Rule Primary
rulePrimary returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getPrimaryAccess().getMyNumberAction_0_0(),
						$current);
				}
			)
			(
				(
					lv_value_1_0=RULE_INT
					{
						newLeafNode(lv_value_1_0, grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPrimaryRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_1_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
		)
		    |
		(
			otherlv_2='('
			{
				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
			}
			{
				newCompositeNode(grammarAccess.getPrimaryAccess().getExpParserRuleCall_1_1());
			}
			this_Exp_3=ruleExp
			{
				$current = $this_Exp_3.current;
				afterParserOrEnumRuleCall();
			}
			otherlv_4=')'
			{
				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
