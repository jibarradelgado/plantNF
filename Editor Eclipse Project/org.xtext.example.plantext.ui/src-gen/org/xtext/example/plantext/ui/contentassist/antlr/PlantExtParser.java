/*
 * generated by Xtext
 */
package org.xtext.example.plantext.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.example.plantext.services.PlantExtGrammarAccess;

public class PlantExtParser extends AbstractContentAssistParser {
	
	@Inject
	private PlantExtGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.example.plantext.ui.contentassist.antlr.internal.InternalPlantExtParser createParser() {
		org.xtext.example.plantext.ui.contentassist.antlr.internal.InternalPlantExtParser result = new org.xtext.example.plantext.ui.contentassist.antlr.internal.InternalPlantExtParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getStateAccess().getAlternatives_1(), "rule__State__Alternatives_1");
					put(grammarAccess.getTEXTAccess().getAlternatives(), "rule__TEXT__Alternatives");
					put(grammarAccess.getDocumentAccess().getGroup(), "rule__Document__Group__0");
					put(grammarAccess.getDeclarationAccess().getGroup(), "rule__Declaration__Group__0");
					put(grammarAccess.getTemplateAccess().getGroup(), "rule__Template__Group__0");
					put(grammarAccess.getSystemAccess().getGroup(), "rule__System__Group__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getStateAccess().getGroup(), "rule__State__Group__0");
					put(grammarAccess.getStateAccess().getGroup_4(), "rule__State__Group_4__0");
					put(grammarAccess.getStateAccess().getGroup_6(), "rule__State__Group_6__0");
					put(grammarAccess.getBranchpointAccess().getGroup(), "rule__Branchpoint__Group__0");
					put(grammarAccess.getTransitionAccess().getGroup(), "rule__Transition__Group__0");
					put(grammarAccess.getTransitionAccess().getGroup_3(), "rule__Transition__Group_3__0");
					put(grammarAccess.getTransitionAccess().getGroup_3_1(), "rule__Transition__Group_3_1__0");
					put(grammarAccess.getTransitionAccess().getGroup_3_3(), "rule__Transition__Group_3_3__0");
					put(grammarAccess.getTransitionAccess().getGroup_3_5(), "rule__Transition__Group_3_5__0");
					put(grammarAccess.getTransitionAccess().getGroup_3_7(), "rule__Transition__Group_3_7__0");
					put(grammarAccess.getTransitionAccess().getGroup_3_9(), "rule__Transition__Group_3_9__0");
					put(grammarAccess.getTransitionAccess().getGroup_3_11(), "rule__Transition__Group_3_11__0");
					put(grammarAccess.getDocumentAccess().getDeclarationAssignment_0(), "rule__Document__DeclarationAssignment_0");
					put(grammarAccess.getDocumentAccess().getTemplateAssignment_1(), "rule__Document__TemplateAssignment_1");
					put(grammarAccess.getDocumentAccess().getSystemAssignment_2(), "rule__Document__SystemAssignment_2");
					put(grammarAccess.getDeclarationAccess().getTextAssignment_1(), "rule__Declaration__TextAssignment_1");
					put(grammarAccess.getTemplateAccess().getNameAssignment_1(), "rule__Template__NameAssignment_1");
					put(grammarAccess.getTemplateAccess().getParametersAssignment_2(), "rule__Template__ParametersAssignment_2");
					put(grammarAccess.getTemplateAccess().getDeclarationAssignment_3(), "rule__Template__DeclarationAssignment_3");
					put(grammarAccess.getTemplateAccess().getStateAssignment_4(), "rule__Template__StateAssignment_4");
					put(grammarAccess.getTemplateAccess().getBranchpointAssignment_5(), "rule__Template__BranchpointAssignment_5");
					put(grammarAccess.getTemplateAccess().getTransitionAssignment_6(), "rule__Template__TransitionAssignment_6");
					put(grammarAccess.getSystemAccess().getTextAssignment_1(), "rule__System__TextAssignment_1");
					put(grammarAccess.getParameterAccess().getTextAssignment_1(), "rule__Parameter__TextAssignment_1");
					put(grammarAccess.getStateAccess().getIdAssignment_3(), "rule__State__IdAssignment_3");
					put(grammarAccess.getStateAccess().getNameAssignment_4_1(), "rule__State__NameAssignment_4_1");
					put(grammarAccess.getStateAccess().getTextAssignment_5(), "rule__State__TextAssignment_5");
					put(grammarAccess.getStateAccess().getExponentialRateAssignment_6_1(), "rule__State__ExponentialRateAssignment_6_1");
					put(grammarAccess.getBranchpointAccess().getNameAssignment_0(), "rule__Branchpoint__NameAssignment_0");
					put(grammarAccess.getTransitionAccess().getOutBoundStateAssignment_0(), "rule__Transition__OutBoundStateAssignment_0");
					put(grammarAccess.getTransitionAccess().getInboundStateAssignment_2(), "rule__Transition__InboundStateAssignment_2");
					put(grammarAccess.getTransitionAccess().getSelectAssignment_3_1_2(), "rule__Transition__SelectAssignment_3_1_2");
					put(grammarAccess.getTransitionAccess().getGuardAssignment_3_3_2(), "rule__Transition__GuardAssignment_3_3_2");
					put(grammarAccess.getTransitionAccess().getSyncAssignment_3_5_2(), "rule__Transition__SyncAssignment_3_5_2");
					put(grammarAccess.getTransitionAccess().getAssignAssignment_3_7_2(), "rule__Transition__AssignAssignment_3_7_2");
					put(grammarAccess.getTransitionAccess().getProbabilityAssignment_3_9_2(), "rule__Transition__ProbabilityAssignment_3_9_2");
					put(grammarAccess.getTransitionAccess().getCommentsAssignment_3_11_2(), "rule__Transition__CommentsAssignment_3_11_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.example.plantext.ui.contentassist.antlr.internal.InternalPlantExtParser typedParser = (org.xtext.example.plantext.ui.contentassist.antlr.internal.InternalPlantExtParser) parser;
			typedParser.entryRuleDocument();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public PlantExtGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(PlantExtGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
