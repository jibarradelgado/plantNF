/*
 * generated by Xtext
 */
package org.xtext.example.plantext.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class PlantExtGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class DocumentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Document");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cDeclarationAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cDeclarationDeclarationParserRuleCall_0_0 = (RuleCall)cDeclarationAssignment_0.eContents().get(0);
		private final Assignment cTemplateAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTemplateTemplateParserRuleCall_1_0 = (RuleCall)cTemplateAssignment_1.eContents().get(0);
		private final Assignment cSystemAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSystemSystemParserRuleCall_2_0 = (RuleCall)cSystemAssignment_2.eContents().get(0);
		
		//Document:
		//	declaration=Declaration template+=Template+ system=System;
		@Override public ParserRule getRule() { return rule; }

		//declaration=Declaration template+=Template+ system=System
		public Group getGroup() { return cGroup; }

		//declaration=Declaration
		public Assignment getDeclarationAssignment_0() { return cDeclarationAssignment_0; }

		//Declaration
		public RuleCall getDeclarationDeclarationParserRuleCall_0_0() { return cDeclarationDeclarationParserRuleCall_0_0; }

		//template+=Template+
		public Assignment getTemplateAssignment_1() { return cTemplateAssignment_1; }

		//Template
		public RuleCall getTemplateTemplateParserRuleCall_1_0() { return cTemplateTemplateParserRuleCall_1_0; }

		//system=System
		public Assignment getSystemAssignment_2() { return cSystemAssignment_2; }

		//System
		public RuleCall getSystemSystemParserRuleCall_2_0() { return cSystemSystemParserRuleCall_2_0; }
	}

	public class DeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Declaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDeclarationsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTextAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTextTEXTParserRuleCall_1_0 = (RuleCall)cTextAssignment_1.eContents().get(0);
		private final Keyword cEndDeclarationsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Declaration:
		//	"Declarations" text+=TEXT* "EndDeclarations";
		@Override public ParserRule getRule() { return rule; }

		//"Declarations" text+=TEXT* "EndDeclarations"
		public Group getGroup() { return cGroup; }

		//"Declarations"
		public Keyword getDeclarationsKeyword_0() { return cDeclarationsKeyword_0; }

		//text+=TEXT*
		public Assignment getTextAssignment_1() { return cTextAssignment_1; }

		//TEXT
		public RuleCall getTextTEXTParserRuleCall_1_0() { return cTextTEXTParserRuleCall_1_0; }

		//"EndDeclarations"
		public Keyword getEndDeclarationsKeyword_2() { return cEndDeclarationsKeyword_2; }
	}

	public class TemplateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Template");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTemplateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cParametersAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cParametersParameterParserRuleCall_2_0 = (RuleCall)cParametersAssignment_2.eContents().get(0);
		private final Assignment cDeclarationAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDeclarationDeclarationParserRuleCall_3_0 = (RuleCall)cDeclarationAssignment_3.eContents().get(0);
		private final Assignment cStateAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cStateStateParserRuleCall_4_0 = (RuleCall)cStateAssignment_4.eContents().get(0);
		private final Assignment cBranchpointAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cBranchpointBranchpointParserRuleCall_5_0 = (RuleCall)cBranchpointAssignment_5.eContents().get(0);
		private final Assignment cTransitionAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cTransitionTransitionParserRuleCall_6_0 = (RuleCall)cTransitionAssignment_6.eContents().get(0);
		private final Keyword cEndTemplateKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Template:
		//	"Template" name=ID parameters=Parameter? declaration=Declaration? state+=State+ branchpoint+=Branchpoint*
		//	transition+=Transition+ "EndTemplate";
		@Override public ParserRule getRule() { return rule; }

		//"Template" name=ID parameters=Parameter? declaration=Declaration? state+=State+ branchpoint+=Branchpoint*
		//transition+=Transition+ "EndTemplate"
		public Group getGroup() { return cGroup; }

		//"Template"
		public Keyword getTemplateKeyword_0() { return cTemplateKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//parameters=Parameter?
		public Assignment getParametersAssignment_2() { return cParametersAssignment_2; }

		//Parameter
		public RuleCall getParametersParameterParserRuleCall_2_0() { return cParametersParameterParserRuleCall_2_0; }

		//declaration=Declaration?
		public Assignment getDeclarationAssignment_3() { return cDeclarationAssignment_3; }

		//Declaration
		public RuleCall getDeclarationDeclarationParserRuleCall_3_0() { return cDeclarationDeclarationParserRuleCall_3_0; }

		//state+=State+
		public Assignment getStateAssignment_4() { return cStateAssignment_4; }

		//State
		public RuleCall getStateStateParserRuleCall_4_0() { return cStateStateParserRuleCall_4_0; }

		//branchpoint+=Branchpoint*
		public Assignment getBranchpointAssignment_5() { return cBranchpointAssignment_5; }

		//Branchpoint
		public RuleCall getBranchpointBranchpointParserRuleCall_5_0() { return cBranchpointBranchpointParserRuleCall_5_0; }

		//transition+=Transition+
		public Assignment getTransitionAssignment_6() { return cTransitionAssignment_6; }

		//Transition
		public RuleCall getTransitionTransitionParserRuleCall_6_0() { return cTransitionTransitionParserRuleCall_6_0; }

		//"EndTemplate"
		public Keyword getEndTemplateKeyword_7() { return cEndTemplateKeyword_7; }
	}

	public class SystemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "System");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSystemKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTextAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTextTEXTParserRuleCall_1_0 = (RuleCall)cTextAssignment_1.eContents().get(0);
		private final Keyword cEndSystemKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//System:
		//	"System" text+=TEXT* "EndSystem";
		@Override public ParserRule getRule() { return rule; }

		//"System" text+=TEXT* "EndSystem"
		public Group getGroup() { return cGroup; }

		//"System"
		public Keyword getSystemKeyword_0() { return cSystemKeyword_0; }

		//text+=TEXT*
		public Assignment getTextAssignment_1() { return cTextAssignment_1; }

		//TEXT
		public RuleCall getTextTEXTParserRuleCall_1_0() { return cTextTEXTParserRuleCall_1_0; }

		//"EndSystem"
		public Keyword getEndSystemKeyword_2() { return cEndSystemKeyword_2; }
	}

	public class ParameterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Parameter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cParametersKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTextAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTextTEXTParserRuleCall_1_0 = (RuleCall)cTextAssignment_1.eContents().get(0);
		private final Keyword cEndParametersKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Parameter:
		//	"Parameters" text+=TEXT* "EndParameters";
		@Override public ParserRule getRule() { return rule; }

		//"Parameters" text+=TEXT* "EndParameters"
		public Group getGroup() { return cGroup; }

		//"Parameters"
		public Keyword getParametersKeyword_0() { return cParametersKeyword_0; }

		//text+=TEXT*
		public Assignment getTextAssignment_1() { return cTextAssignment_1; }

		//TEXT
		public RuleCall getTextTEXTParserRuleCall_1_0() { return cTextTEXTParserRuleCall_1_0; }

		//"EndParameters"
		public Keyword getEndParametersKeyword_2() { return cEndParametersKeyword_2; }
	}

	public class StateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "State");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIniKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Keyword cComKeyword_1_0 = (Keyword)cAlternatives_1.eContents().get(0);
		private final Keyword cUrgKeyword_1_1 = (Keyword)cAlternatives_1.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cIdAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cIdIDTerminalRuleCall_3_0 = (RuleCall)cIdAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cCommaKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cNameAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_4_1_0 = (RuleCall)cNameAssignment_4_1.eContents().get(0);
		private final Assignment cTextAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cTextTEXTParserRuleCall_5_0 = (RuleCall)cTextAssignment_5.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cColonKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cExponentialRateAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cExponentialRateTEXTParserRuleCall_6_1_0 = (RuleCall)cExponentialRateAssignment_6_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//State:
		//	"ini"? ("com" | "urg")? ":" id=ID ("," name=ID)? text+=TEXT* (":" exponentialRate+=TEXT*)? ";";
		@Override public ParserRule getRule() { return rule; }

		//"ini"? ("com" | "urg")? ":" id=ID ("," name=ID)? text+=TEXT* (":" exponentialRate+=TEXT*)? ";"
		public Group getGroup() { return cGroup; }

		//"ini"?
		public Keyword getIniKeyword_0() { return cIniKeyword_0; }

		//("com" | "urg")?
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//"com"
		public Keyword getComKeyword_1_0() { return cComKeyword_1_0; }

		//"urg"
		public Keyword getUrgKeyword_1_1() { return cUrgKeyword_1_1; }

		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//id=ID
		public Assignment getIdAssignment_3() { return cIdAssignment_3; }

		//ID
		public RuleCall getIdIDTerminalRuleCall_3_0() { return cIdIDTerminalRuleCall_3_0; }

		//("," name=ID)?
		public Group getGroup_4() { return cGroup_4; }

		//","
		public Keyword getCommaKeyword_4_0() { return cCommaKeyword_4_0; }

		//name=ID
		public Assignment getNameAssignment_4_1() { return cNameAssignment_4_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_4_1_0() { return cNameIDTerminalRuleCall_4_1_0; }

		//text+=TEXT*
		public Assignment getTextAssignment_5() { return cTextAssignment_5; }

		//TEXT
		public RuleCall getTextTEXTParserRuleCall_5_0() { return cTextTEXTParserRuleCall_5_0; }

		//(":" exponentialRate+=TEXT*)?
		public Group getGroup_6() { return cGroup_6; }

		//":"
		public Keyword getColonKeyword_6_0() { return cColonKeyword_6_0; }

		//exponentialRate+=TEXT*
		public Assignment getExponentialRateAssignment_6_1() { return cExponentialRateAssignment_6_1; }

		//TEXT
		public RuleCall getExponentialRateTEXTParserRuleCall_6_1_0() { return cExponentialRateTEXTParserRuleCall_6_1_0; }

		//";"
		public Keyword getSemicolonKeyword_7() { return cSemicolonKeyword_7; }
	}

	public class BranchpointElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Branchpoint");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cSemicolonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//Branchpoint:
		//	name=ID ";";
		@Override public ParserRule getRule() { return rule; }

		//name=ID ";"
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//";"
		public Keyword getSemicolonKeyword_1() { return cSemicolonKeyword_1; }
	}

	public class TransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Transition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cOutBoundStateAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cOutBoundStateIDTerminalRuleCall_0_0 = (RuleCall)cOutBoundStateAssignment_0.eContents().get(0);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cInboundStateAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cInboundStateIDTerminalRuleCall_2_0 = (RuleCall)cInboundStateAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cColonKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cSelectKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Keyword cColonKeyword_3_1_1 = (Keyword)cGroup_3_1.eContents().get(1);
		private final Assignment cSelectAssignment_3_1_2 = (Assignment)cGroup_3_1.eContents().get(2);
		private final RuleCall cSelectTEXTParserRuleCall_3_1_2_0 = (RuleCall)cSelectAssignment_3_1_2.eContents().get(0);
		private final Keyword cCommaKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		private final Group cGroup_3_3 = (Group)cGroup_3.eContents().get(3);
		private final Keyword cGuardKeyword_3_3_0 = (Keyword)cGroup_3_3.eContents().get(0);
		private final Keyword cColonKeyword_3_3_1 = (Keyword)cGroup_3_3.eContents().get(1);
		private final Assignment cGuardAssignment_3_3_2 = (Assignment)cGroup_3_3.eContents().get(2);
		private final RuleCall cGuardTEXTParserRuleCall_3_3_2_0 = (RuleCall)cGuardAssignment_3_3_2.eContents().get(0);
		private final Keyword cCommaKeyword_3_4 = (Keyword)cGroup_3.eContents().get(4);
		private final Group cGroup_3_5 = (Group)cGroup_3.eContents().get(5);
		private final Keyword cSyncKeyword_3_5_0 = (Keyword)cGroup_3_5.eContents().get(0);
		private final Keyword cColonKeyword_3_5_1 = (Keyword)cGroup_3_5.eContents().get(1);
		private final Assignment cSyncAssignment_3_5_2 = (Assignment)cGroup_3_5.eContents().get(2);
		private final RuleCall cSyncTEXTParserRuleCall_3_5_2_0 = (RuleCall)cSyncAssignment_3_5_2.eContents().get(0);
		private final Keyword cCommaKeyword_3_6 = (Keyword)cGroup_3.eContents().get(6);
		private final Group cGroup_3_7 = (Group)cGroup_3.eContents().get(7);
		private final Keyword cAssignKeyword_3_7_0 = (Keyword)cGroup_3_7.eContents().get(0);
		private final Keyword cColonKeyword_3_7_1 = (Keyword)cGroup_3_7.eContents().get(1);
		private final Assignment cAssignAssignment_3_7_2 = (Assignment)cGroup_3_7.eContents().get(2);
		private final RuleCall cAssignTEXTParserRuleCall_3_7_2_0 = (RuleCall)cAssignAssignment_3_7_2.eContents().get(0);
		private final Keyword cCommaKeyword_3_8 = (Keyword)cGroup_3.eContents().get(8);
		private final Group cGroup_3_9 = (Group)cGroup_3.eContents().get(9);
		private final Keyword cProbabilityKeyword_3_9_0 = (Keyword)cGroup_3_9.eContents().get(0);
		private final Keyword cColonKeyword_3_9_1 = (Keyword)cGroup_3_9.eContents().get(1);
		private final Assignment cProbabilityAssignment_3_9_2 = (Assignment)cGroup_3_9.eContents().get(2);
		private final RuleCall cProbabilityTEXTParserRuleCall_3_9_2_0 = (RuleCall)cProbabilityAssignment_3_9_2.eContents().get(0);
		private final Keyword cCommaKeyword_3_10 = (Keyword)cGroup_3.eContents().get(10);
		private final Group cGroup_3_11 = (Group)cGroup_3.eContents().get(11);
		private final Keyword cCommentsKeyword_3_11_0 = (Keyword)cGroup_3_11.eContents().get(0);
		private final Keyword cColonKeyword_3_11_1 = (Keyword)cGroup_3_11.eContents().get(1);
		private final Assignment cCommentsAssignment_3_11_2 = (Assignment)cGroup_3_11.eContents().get(2);
		private final RuleCall cCommentsTEXTParserRuleCall_3_11_2_0 = (RuleCall)cCommentsAssignment_3_11_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Transition:
		//	outBoundState=ID "->" inboundState=ID (":" ("select" ":" select+=TEXT+)? ","? ("guard" ":" guard+=TEXT+)? ","? ("sync"
		//	":" sync+=TEXT+)? ","? ("assign" ":" assign+=TEXT+)? ","? ("probability" ":" probability+=TEXT+)? ","? ("comments" ":"
		//	comments+=TEXT+)?) ";";
		@Override public ParserRule getRule() { return rule; }

		//outBoundState=ID "->" inboundState=ID (":" ("select" ":" select+=TEXT+)? ","? ("guard" ":" guard+=TEXT+)? ","? ("sync"
		//":" sync+=TEXT+)? ","? ("assign" ":" assign+=TEXT+)? ","? ("probability" ":" probability+=TEXT+)? ","? ("comments" ":"
		//comments+=TEXT+)?) ";"
		public Group getGroup() { return cGroup; }

		//outBoundState=ID
		public Assignment getOutBoundStateAssignment_0() { return cOutBoundStateAssignment_0; }

		//ID
		public RuleCall getOutBoundStateIDTerminalRuleCall_0_0() { return cOutBoundStateIDTerminalRuleCall_0_0; }

		//"->"
		public Keyword getHyphenMinusGreaterThanSignKeyword_1() { return cHyphenMinusGreaterThanSignKeyword_1; }

		//inboundState=ID
		public Assignment getInboundStateAssignment_2() { return cInboundStateAssignment_2; }

		//ID
		public RuleCall getInboundStateIDTerminalRuleCall_2_0() { return cInboundStateIDTerminalRuleCall_2_0; }

		//":" ("select" ":" select+=TEXT+)? ","? ("guard" ":" guard+=TEXT+)? ","? ("sync" ":" sync+=TEXT+)? ","? ("assign" ":"
		//assign+=TEXT+)? ","? ("probability" ":" probability+=TEXT+)? ","? ("comments" ":" comments+=TEXT+)?
		public Group getGroup_3() { return cGroup_3; }

		//":"
		public Keyword getColonKeyword_3_0() { return cColonKeyword_3_0; }

		//("select" ":" select+=TEXT+)?
		public Group getGroup_3_1() { return cGroup_3_1; }

		//"select"
		public Keyword getSelectKeyword_3_1_0() { return cSelectKeyword_3_1_0; }

		//":"
		public Keyword getColonKeyword_3_1_1() { return cColonKeyword_3_1_1; }

		//select+=TEXT+
		public Assignment getSelectAssignment_3_1_2() { return cSelectAssignment_3_1_2; }

		//TEXT
		public RuleCall getSelectTEXTParserRuleCall_3_1_2_0() { return cSelectTEXTParserRuleCall_3_1_2_0; }

		//","?
		public Keyword getCommaKeyword_3_2() { return cCommaKeyword_3_2; }

		//("guard" ":" guard+=TEXT+)?
		public Group getGroup_3_3() { return cGroup_3_3; }

		//"guard"
		public Keyword getGuardKeyword_3_3_0() { return cGuardKeyword_3_3_0; }

		//":"
		public Keyword getColonKeyword_3_3_1() { return cColonKeyword_3_3_1; }

		//guard+=TEXT+
		public Assignment getGuardAssignment_3_3_2() { return cGuardAssignment_3_3_2; }

		//TEXT
		public RuleCall getGuardTEXTParserRuleCall_3_3_2_0() { return cGuardTEXTParserRuleCall_3_3_2_0; }

		//","?
		public Keyword getCommaKeyword_3_4() { return cCommaKeyword_3_4; }

		//("sync" ":" sync+=TEXT+)?
		public Group getGroup_3_5() { return cGroup_3_5; }

		//"sync"
		public Keyword getSyncKeyword_3_5_0() { return cSyncKeyword_3_5_0; }

		//":"
		public Keyword getColonKeyword_3_5_1() { return cColonKeyword_3_5_1; }

		//sync+=TEXT+
		public Assignment getSyncAssignment_3_5_2() { return cSyncAssignment_3_5_2; }

		//TEXT
		public RuleCall getSyncTEXTParserRuleCall_3_5_2_0() { return cSyncTEXTParserRuleCall_3_5_2_0; }

		//","?
		public Keyword getCommaKeyword_3_6() { return cCommaKeyword_3_6; }

		//("assign" ":" assign+=TEXT+)?
		public Group getGroup_3_7() { return cGroup_3_7; }

		//"assign"
		public Keyword getAssignKeyword_3_7_0() { return cAssignKeyword_3_7_0; }

		//":"
		public Keyword getColonKeyword_3_7_1() { return cColonKeyword_3_7_1; }

		//assign+=TEXT+
		public Assignment getAssignAssignment_3_7_2() { return cAssignAssignment_3_7_2; }

		//TEXT
		public RuleCall getAssignTEXTParserRuleCall_3_7_2_0() { return cAssignTEXTParserRuleCall_3_7_2_0; }

		//","?
		public Keyword getCommaKeyword_3_8() { return cCommaKeyword_3_8; }

		//("probability" ":" probability+=TEXT+)?
		public Group getGroup_3_9() { return cGroup_3_9; }

		//"probability"
		public Keyword getProbabilityKeyword_3_9_0() { return cProbabilityKeyword_3_9_0; }

		//":"
		public Keyword getColonKeyword_3_9_1() { return cColonKeyword_3_9_1; }

		//probability+=TEXT+
		public Assignment getProbabilityAssignment_3_9_2() { return cProbabilityAssignment_3_9_2; }

		//TEXT
		public RuleCall getProbabilityTEXTParserRuleCall_3_9_2_0() { return cProbabilityTEXTParserRuleCall_3_9_2_0; }

		//","?
		public Keyword getCommaKeyword_3_10() { return cCommaKeyword_3_10; }

		//("comments" ":" comments+=TEXT+)?
		public Group getGroup_3_11() { return cGroup_3_11; }

		//"comments"
		public Keyword getCommentsKeyword_3_11_0() { return cCommentsKeyword_3_11_0; }

		//":"
		public Keyword getColonKeyword_3_11_1() { return cColonKeyword_3_11_1; }

		//comments+=TEXT+
		public Assignment getCommentsAssignment_3_11_2() { return cCommentsAssignment_3_11_2; }

		//TEXT
		public RuleCall getCommentsTEXTParserRuleCall_3_11_2_0() { return cCommentsTEXTParserRuleCall_3_11_2_0; }

		//";"
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}

	public class TEXTElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TEXT");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cANY_OTHERTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cCommaKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		
		//TEXT:
		//	ANY_OTHER | ID | INT | ";" | ",";
		@Override public ParserRule getRule() { return rule; }

		//ANY_OTHER | ID | INT | ";" | ","
		public Alternatives getAlternatives() { return cAlternatives; }

		//ANY_OTHER
		public RuleCall getANY_OTHERTerminalRuleCall_0() { return cANY_OTHERTerminalRuleCall_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }

		//INT
		public RuleCall getINTTerminalRuleCall_2() { return cINTTerminalRuleCall_2; }

		//";"
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }

		//","
		public Keyword getCommaKeyword_4() { return cCommaKeyword_4; }
	}
	
	
	private final DocumentElements pDocument;
	private final DeclarationElements pDeclaration;
	private final TemplateElements pTemplate;
	private final SystemElements pSystem;
	private final ParameterElements pParameter;
	private final StateElements pState;
	private final BranchpointElements pBranchpoint;
	private final TransitionElements pTransition;
	private final TEXTElements pTEXT;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public PlantExtGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pDocument = new DocumentElements();
		this.pDeclaration = new DeclarationElements();
		this.pTemplate = new TemplateElements();
		this.pSystem = new SystemElements();
		this.pParameter = new ParameterElements();
		this.pState = new StateElements();
		this.pBranchpoint = new BranchpointElements();
		this.pTransition = new TransitionElements();
		this.pTEXT = new TEXTElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.plantext.PlantExt".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Document:
	//	declaration=Declaration template+=Template+ system=System;
	public DocumentElements getDocumentAccess() {
		return pDocument;
	}
	
	public ParserRule getDocumentRule() {
		return getDocumentAccess().getRule();
	}

	//Declaration:
	//	"Declarations" text+=TEXT* "EndDeclarations";
	public DeclarationElements getDeclarationAccess() {
		return pDeclaration;
	}
	
	public ParserRule getDeclarationRule() {
		return getDeclarationAccess().getRule();
	}

	//Template:
	//	"Template" name=ID parameters=Parameter? declaration=Declaration? state+=State+ branchpoint+=Branchpoint*
	//	transition+=Transition+ "EndTemplate";
	public TemplateElements getTemplateAccess() {
		return pTemplate;
	}
	
	public ParserRule getTemplateRule() {
		return getTemplateAccess().getRule();
	}

	//System:
	//	"System" text+=TEXT* "EndSystem";
	public SystemElements getSystemAccess() {
		return pSystem;
	}
	
	public ParserRule getSystemRule() {
		return getSystemAccess().getRule();
	}

	//Parameter:
	//	"Parameters" text+=TEXT* "EndParameters";
	public ParameterElements getParameterAccess() {
		return pParameter;
	}
	
	public ParserRule getParameterRule() {
		return getParameterAccess().getRule();
	}

	//State:
	//	"ini"? ("com" | "urg")? ":" id=ID ("," name=ID)? text+=TEXT* (":" exponentialRate+=TEXT*)? ";";
	public StateElements getStateAccess() {
		return pState;
	}
	
	public ParserRule getStateRule() {
		return getStateAccess().getRule();
	}

	//Branchpoint:
	//	name=ID ";";
	public BranchpointElements getBranchpointAccess() {
		return pBranchpoint;
	}
	
	public ParserRule getBranchpointRule() {
		return getBranchpointAccess().getRule();
	}

	//Transition:
	//	outBoundState=ID "->" inboundState=ID (":" ("select" ":" select+=TEXT+)? ","? ("guard" ":" guard+=TEXT+)? ","? ("sync"
	//	":" sync+=TEXT+)? ","? ("assign" ":" assign+=TEXT+)? ","? ("probability" ":" probability+=TEXT+)? ","? ("comments" ":"
	//	comments+=TEXT+)?) ";";
	public TransitionElements getTransitionAccess() {
		return pTransition;
	}
	
	public ParserRule getTransitionRule() {
		return getTransitionAccess().getRule();
	}

	//TEXT:
	//	ANY_OTHER | ID | INT | ";" | ",";
	public TEXTElements getTEXTAccess() {
		return pTEXT;
	}
	
	public ParserRule getTEXTRule() {
		return getTEXTAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
