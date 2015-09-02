package org.xtext.example.plantext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.plantext.services.PlantExtGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPlantExtParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ANY_OTHER", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'com'", "'urg'", "';'", "','", "'Declarations'", "'EndDeclarations'", "'Template'", "'EndTemplate'", "'System'", "'EndSystem'", "'Parameters'", "'EndParameters'", "'ini'", "':'", "'->'", "'select'", "'guard'", "'sync'", "'assign'", "'probability'", "'comments'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
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
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPlantExtParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPlantExtParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPlantExtParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g"; }


     
     	private PlantExtGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(PlantExtGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleDocument"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:60:1: entryRuleDocument : ruleDocument EOF ;
    public final void entryRuleDocument() throws RecognitionException {
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:61:1: ( ruleDocument EOF )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:62:1: ruleDocument EOF
            {
             before(grammarAccess.getDocumentRule()); 
            pushFollow(FOLLOW_ruleDocument_in_entryRuleDocument61);
            ruleDocument();

            state._fsp--;

             after(grammarAccess.getDocumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocument68); 

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
    // $ANTLR end "entryRuleDocument"


    // $ANTLR start "ruleDocument"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:69:1: ruleDocument : ( ( rule__Document__Group__0 ) ) ;
    public final void ruleDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:73:2: ( ( ( rule__Document__Group__0 ) ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:74:1: ( ( rule__Document__Group__0 ) )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:74:1: ( ( rule__Document__Group__0 ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:75:1: ( rule__Document__Group__0 )
            {
             before(grammarAccess.getDocumentAccess().getGroup()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:76:1: ( rule__Document__Group__0 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:76:2: rule__Document__Group__0
            {
            pushFollow(FOLLOW_rule__Document__Group__0_in_ruleDocument94);
            rule__Document__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDocumentAccess().getGroup()); 

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
    // $ANTLR end "ruleDocument"


    // $ANTLR start "entryRuleDeclaration"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:88:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:89:1: ( ruleDeclaration EOF )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:90:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration121);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration128); 

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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:97:1: ruleDeclaration : ( ( rule__Declaration__Group__0 ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:101:2: ( ( ( rule__Declaration__Group__0 ) ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:102:1: ( ( rule__Declaration__Group__0 ) )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:102:1: ( ( rule__Declaration__Group__0 ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:103:1: ( rule__Declaration__Group__0 )
            {
             before(grammarAccess.getDeclarationAccess().getGroup()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:104:1: ( rule__Declaration__Group__0 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:104:2: rule__Declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Declaration__Group__0_in_ruleDeclaration154);
            rule__Declaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleTemplate"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:116:1: entryRuleTemplate : ruleTemplate EOF ;
    public final void entryRuleTemplate() throws RecognitionException {
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:117:1: ( ruleTemplate EOF )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:118:1: ruleTemplate EOF
            {
             before(grammarAccess.getTemplateRule()); 
            pushFollow(FOLLOW_ruleTemplate_in_entryRuleTemplate181);
            ruleTemplate();

            state._fsp--;

             after(grammarAccess.getTemplateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplate188); 

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
    // $ANTLR end "entryRuleTemplate"


    // $ANTLR start "ruleTemplate"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:125:1: ruleTemplate : ( ( rule__Template__Group__0 ) ) ;
    public final void ruleTemplate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:129:2: ( ( ( rule__Template__Group__0 ) ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:130:1: ( ( rule__Template__Group__0 ) )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:130:1: ( ( rule__Template__Group__0 ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:131:1: ( rule__Template__Group__0 )
            {
             before(grammarAccess.getTemplateAccess().getGroup()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:132:1: ( rule__Template__Group__0 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:132:2: rule__Template__Group__0
            {
            pushFollow(FOLLOW_rule__Template__Group__0_in_ruleTemplate214);
            rule__Template__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTemplateAccess().getGroup()); 

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
    // $ANTLR end "ruleTemplate"


    // $ANTLR start "entryRuleSystem"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:144:1: entryRuleSystem : ruleSystem EOF ;
    public final void entryRuleSystem() throws RecognitionException {
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:145:1: ( ruleSystem EOF )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:146:1: ruleSystem EOF
            {
             before(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_ruleSystem_in_entryRuleSystem241);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getSystemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystem248); 

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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:153:1: ruleSystem : ( ( rule__System__Group__0 ) ) ;
    public final void ruleSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:157:2: ( ( ( rule__System__Group__0 ) ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:158:1: ( ( rule__System__Group__0 ) )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:158:1: ( ( rule__System__Group__0 ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:159:1: ( rule__System__Group__0 )
            {
             before(grammarAccess.getSystemAccess().getGroup()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:160:1: ( rule__System__Group__0 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:160:2: rule__System__Group__0
            {
            pushFollow(FOLLOW_rule__System__Group__0_in_ruleSystem274);
            rule__System__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getGroup()); 

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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleParameter"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:172:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:173:1: ( ruleParameter EOF )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:174:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter301);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter308); 

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:181:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:185:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:186:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:186:1: ( ( rule__Parameter__Group__0 ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:187:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:188:1: ( rule__Parameter__Group__0 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:188:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter334);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleState"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:200:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:201:1: ( ruleState EOF )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:202:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState361);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState368); 

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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:209:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:213:2: ( ( ( rule__State__Group__0 ) ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:214:1: ( ( rule__State__Group__0 ) )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:214:1: ( ( rule__State__Group__0 ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:215:1: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:216:1: ( rule__State__Group__0 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:216:2: rule__State__Group__0
            {
            pushFollow(FOLLOW_rule__State__Group__0_in_ruleState394);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleBranchpoint"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:228:1: entryRuleBranchpoint : ruleBranchpoint EOF ;
    public final void entryRuleBranchpoint() throws RecognitionException {
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:229:1: ( ruleBranchpoint EOF )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:230:1: ruleBranchpoint EOF
            {
             before(grammarAccess.getBranchpointRule()); 
            pushFollow(FOLLOW_ruleBranchpoint_in_entryRuleBranchpoint421);
            ruleBranchpoint();

            state._fsp--;

             after(grammarAccess.getBranchpointRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBranchpoint428); 

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
    // $ANTLR end "entryRuleBranchpoint"


    // $ANTLR start "ruleBranchpoint"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:237:1: ruleBranchpoint : ( ( rule__Branchpoint__Group__0 ) ) ;
    public final void ruleBranchpoint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:241:2: ( ( ( rule__Branchpoint__Group__0 ) ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:242:1: ( ( rule__Branchpoint__Group__0 ) )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:242:1: ( ( rule__Branchpoint__Group__0 ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:243:1: ( rule__Branchpoint__Group__0 )
            {
             before(grammarAccess.getBranchpointAccess().getGroup()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:244:1: ( rule__Branchpoint__Group__0 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:244:2: rule__Branchpoint__Group__0
            {
            pushFollow(FOLLOW_rule__Branchpoint__Group__0_in_ruleBranchpoint454);
            rule__Branchpoint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBranchpointAccess().getGroup()); 

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
    // $ANTLR end "ruleBranchpoint"


    // $ANTLR start "entryRuleTransition"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:256:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:257:1: ( ruleTransition EOF )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:258:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition481);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition488); 

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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:265:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:269:2: ( ( ( rule__Transition__Group__0 ) ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:270:1: ( ( rule__Transition__Group__0 ) )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:270:1: ( ( rule__Transition__Group__0 ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:271:1: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:272:1: ( rule__Transition__Group__0 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:272:2: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_rule__Transition__Group__0_in_ruleTransition514);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleTEXT"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:284:1: entryRuleTEXT : ruleTEXT EOF ;
    public final void entryRuleTEXT() throws RecognitionException {
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:285:1: ( ruleTEXT EOF )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:286:1: ruleTEXT EOF
            {
             before(grammarAccess.getTEXTRule()); 
            pushFollow(FOLLOW_ruleTEXT_in_entryRuleTEXT541);
            ruleTEXT();

            state._fsp--;

             after(grammarAccess.getTEXTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTEXT548); 

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
    // $ANTLR end "entryRuleTEXT"


    // $ANTLR start "ruleTEXT"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:293:1: ruleTEXT : ( ( rule__TEXT__Alternatives ) ) ;
    public final void ruleTEXT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:297:2: ( ( ( rule__TEXT__Alternatives ) ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:298:1: ( ( rule__TEXT__Alternatives ) )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:298:1: ( ( rule__TEXT__Alternatives ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:299:1: ( rule__TEXT__Alternatives )
            {
             before(grammarAccess.getTEXTAccess().getAlternatives()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:300:1: ( rule__TEXT__Alternatives )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:300:2: rule__TEXT__Alternatives
            {
            pushFollow(FOLLOW_rule__TEXT__Alternatives_in_ruleTEXT574);
            rule__TEXT__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTEXTAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTEXT"


    // $ANTLR start "rule__State__Alternatives_1"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:312:1: rule__State__Alternatives_1 : ( ( 'com' ) | ( 'urg' ) );
    public final void rule__State__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:316:1: ( ( 'com' ) | ( 'urg' ) )
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
                    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:317:1: ( 'com' )
                    {
                    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:317:1: ( 'com' )
                    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:318:1: 'com'
                    {
                     before(grammarAccess.getStateAccess().getComKeyword_1_0()); 
                    match(input,11,FOLLOW_11_in_rule__State__Alternatives_1611); 
                     after(grammarAccess.getStateAccess().getComKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:325:6: ( 'urg' )
                    {
                    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:325:6: ( 'urg' )
                    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:326:1: 'urg'
                    {
                     before(grammarAccess.getStateAccess().getUrgKeyword_1_1()); 
                    match(input,12,FOLLOW_12_in_rule__State__Alternatives_1631); 
                     after(grammarAccess.getStateAccess().getUrgKeyword_1_1()); 

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
    // $ANTLR end "rule__State__Alternatives_1"


    // $ANTLR start "rule__TEXT__Alternatives"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:338:1: rule__TEXT__Alternatives : ( ( RULE_ANY_OTHER ) | ( RULE_ID ) | ( RULE_INT ) | ( ';' ) | ( ',' ) );
    public final void rule__TEXT__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:342:1: ( ( RULE_ANY_OTHER ) | ( RULE_ID ) | ( RULE_INT ) | ( ';' ) | ( ',' ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case RULE_ANY_OTHER:
                {
                alt2=1;
                }
                break;
            case RULE_ID:
                {
                alt2=2;
                }
                break;
            case RULE_INT:
                {
                alt2=3;
                }
                break;
            case 13:
                {
                alt2=4;
                }
                break;
            case 14:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:343:1: ( RULE_ANY_OTHER )
                    {
                    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:343:1: ( RULE_ANY_OTHER )
                    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:344:1: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getTEXTAccess().getANY_OTHERTerminalRuleCall_0()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__TEXT__Alternatives665); 
                     after(grammarAccess.getTEXTAccess().getANY_OTHERTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:349:6: ( RULE_ID )
                    {
                    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:349:6: ( RULE_ID )
                    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:350:1: RULE_ID
                    {
                     before(grammarAccess.getTEXTAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TEXT__Alternatives682); 
                     after(grammarAccess.getTEXTAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:355:6: ( RULE_INT )
                    {
                    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:355:6: ( RULE_INT )
                    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:356:1: RULE_INT
                    {
                     before(grammarAccess.getTEXTAccess().getINTTerminalRuleCall_2()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__TEXT__Alternatives699); 
                     after(grammarAccess.getTEXTAccess().getINTTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:361:6: ( ';' )
                    {
                    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:361:6: ( ';' )
                    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:362:1: ';'
                    {
                     before(grammarAccess.getTEXTAccess().getSemicolonKeyword_3()); 
                    match(input,13,FOLLOW_13_in_rule__TEXT__Alternatives717); 
                     after(grammarAccess.getTEXTAccess().getSemicolonKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:369:6: ( ',' )
                    {
                    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:369:6: ( ',' )
                    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:370:1: ','
                    {
                     before(grammarAccess.getTEXTAccess().getCommaKeyword_4()); 
                    match(input,14,FOLLOW_14_in_rule__TEXT__Alternatives737); 
                     after(grammarAccess.getTEXTAccess().getCommaKeyword_4()); 

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
    // $ANTLR end "rule__TEXT__Alternatives"


    // $ANTLR start "rule__Document__Group__0"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:384:1: rule__Document__Group__0 : rule__Document__Group__0__Impl rule__Document__Group__1 ;
    public final void rule__Document__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:388:1: ( rule__Document__Group__0__Impl rule__Document__Group__1 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:389:2: rule__Document__Group__0__Impl rule__Document__Group__1
            {
            pushFollow(FOLLOW_rule__Document__Group__0__Impl_in_rule__Document__Group__0769);
            rule__Document__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Document__Group__1_in_rule__Document__Group__0772);
            rule__Document__Group__1();

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
    // $ANTLR end "rule__Document__Group__0"


    // $ANTLR start "rule__Document__Group__0__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:396:1: rule__Document__Group__0__Impl : ( ( rule__Document__DeclarationAssignment_0 ) ) ;
    public final void rule__Document__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:400:1: ( ( ( rule__Document__DeclarationAssignment_0 ) ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:401:1: ( ( rule__Document__DeclarationAssignment_0 ) )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:401:1: ( ( rule__Document__DeclarationAssignment_0 ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:402:1: ( rule__Document__DeclarationAssignment_0 )
            {
             before(grammarAccess.getDocumentAccess().getDeclarationAssignment_0()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:403:1: ( rule__Document__DeclarationAssignment_0 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:403:2: rule__Document__DeclarationAssignment_0
            {
            pushFollow(FOLLOW_rule__Document__DeclarationAssignment_0_in_rule__Document__Group__0__Impl799);
            rule__Document__DeclarationAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDocumentAccess().getDeclarationAssignment_0()); 

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
    // $ANTLR end "rule__Document__Group__0__Impl"


    // $ANTLR start "rule__Document__Group__1"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:413:1: rule__Document__Group__1 : rule__Document__Group__1__Impl rule__Document__Group__2 ;
    public final void rule__Document__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:417:1: ( rule__Document__Group__1__Impl rule__Document__Group__2 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:418:2: rule__Document__Group__1__Impl rule__Document__Group__2
            {
            pushFollow(FOLLOW_rule__Document__Group__1__Impl_in_rule__Document__Group__1829);
            rule__Document__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Document__Group__2_in_rule__Document__Group__1832);
            rule__Document__Group__2();

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
    // $ANTLR end "rule__Document__Group__1"


    // $ANTLR start "rule__Document__Group__1__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:425:1: rule__Document__Group__1__Impl : ( ( ( rule__Document__TemplateAssignment_1 ) ) ( ( rule__Document__TemplateAssignment_1 )* ) ) ;
    public final void rule__Document__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:429:1: ( ( ( ( rule__Document__TemplateAssignment_1 ) ) ( ( rule__Document__TemplateAssignment_1 )* ) ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:430:1: ( ( ( rule__Document__TemplateAssignment_1 ) ) ( ( rule__Document__TemplateAssignment_1 )* ) )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:430:1: ( ( ( rule__Document__TemplateAssignment_1 ) ) ( ( rule__Document__TemplateAssignment_1 )* ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:431:1: ( ( rule__Document__TemplateAssignment_1 ) ) ( ( rule__Document__TemplateAssignment_1 )* )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:431:1: ( ( rule__Document__TemplateAssignment_1 ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:432:1: ( rule__Document__TemplateAssignment_1 )
            {
             before(grammarAccess.getDocumentAccess().getTemplateAssignment_1()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:433:1: ( rule__Document__TemplateAssignment_1 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:433:2: rule__Document__TemplateAssignment_1
            {
            pushFollow(FOLLOW_rule__Document__TemplateAssignment_1_in_rule__Document__Group__1__Impl861);
            rule__Document__TemplateAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDocumentAccess().getTemplateAssignment_1()); 

            }

            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:436:1: ( ( rule__Document__TemplateAssignment_1 )* )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:437:1: ( rule__Document__TemplateAssignment_1 )*
            {
             before(grammarAccess.getDocumentAccess().getTemplateAssignment_1()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:438:1: ( rule__Document__TemplateAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:438:2: rule__Document__TemplateAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Document__TemplateAssignment_1_in_rule__Document__Group__1__Impl873);
            	    rule__Document__TemplateAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getDocumentAccess().getTemplateAssignment_1()); 

            }


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
    // $ANTLR end "rule__Document__Group__1__Impl"


    // $ANTLR start "rule__Document__Group__2"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:449:1: rule__Document__Group__2 : rule__Document__Group__2__Impl ;
    public final void rule__Document__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:453:1: ( rule__Document__Group__2__Impl )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:454:2: rule__Document__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Document__Group__2__Impl_in_rule__Document__Group__2906);
            rule__Document__Group__2__Impl();

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
    // $ANTLR end "rule__Document__Group__2"


    // $ANTLR start "rule__Document__Group__2__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:460:1: rule__Document__Group__2__Impl : ( ( rule__Document__SystemAssignment_2 ) ) ;
    public final void rule__Document__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:464:1: ( ( ( rule__Document__SystemAssignment_2 ) ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:465:1: ( ( rule__Document__SystemAssignment_2 ) )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:465:1: ( ( rule__Document__SystemAssignment_2 ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:466:1: ( rule__Document__SystemAssignment_2 )
            {
             before(grammarAccess.getDocumentAccess().getSystemAssignment_2()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:467:1: ( rule__Document__SystemAssignment_2 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:467:2: rule__Document__SystemAssignment_2
            {
            pushFollow(FOLLOW_rule__Document__SystemAssignment_2_in_rule__Document__Group__2__Impl933);
            rule__Document__SystemAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDocumentAccess().getSystemAssignment_2()); 

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
    // $ANTLR end "rule__Document__Group__2__Impl"


    // $ANTLR start "rule__Declaration__Group__0"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:483:1: rule__Declaration__Group__0 : rule__Declaration__Group__0__Impl rule__Declaration__Group__1 ;
    public final void rule__Declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:487:1: ( rule__Declaration__Group__0__Impl rule__Declaration__Group__1 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:488:2: rule__Declaration__Group__0__Impl rule__Declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__0969);
            rule__Declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__0972);
            rule__Declaration__Group__1();

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
    // $ANTLR end "rule__Declaration__Group__0"


    // $ANTLR start "rule__Declaration__Group__0__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:495:1: rule__Declaration__Group__0__Impl : ( 'Declarations' ) ;
    public final void rule__Declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:499:1: ( ( 'Declarations' ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:500:1: ( 'Declarations' )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:500:1: ( 'Declarations' )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:501:1: 'Declarations'
            {
             before(grammarAccess.getDeclarationAccess().getDeclarationsKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Declaration__Group__0__Impl1000); 
             after(grammarAccess.getDeclarationAccess().getDeclarationsKeyword_0()); 

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
    // $ANTLR end "rule__Declaration__Group__0__Impl"


    // $ANTLR start "rule__Declaration__Group__1"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:514:1: rule__Declaration__Group__1 : rule__Declaration__Group__1__Impl rule__Declaration__Group__2 ;
    public final void rule__Declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:518:1: ( rule__Declaration__Group__1__Impl rule__Declaration__Group__2 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:519:2: rule__Declaration__Group__1__Impl rule__Declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__11031);
            rule__Declaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__2_in_rule__Declaration__Group__11034);
            rule__Declaration__Group__2();

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
    // $ANTLR end "rule__Declaration__Group__1"


    // $ANTLR start "rule__Declaration__Group__1__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:526:1: rule__Declaration__Group__1__Impl : ( ( rule__Declaration__TextAssignment_1 )* ) ;
    public final void rule__Declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:530:1: ( ( ( rule__Declaration__TextAssignment_1 )* ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:531:1: ( ( rule__Declaration__TextAssignment_1 )* )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:531:1: ( ( rule__Declaration__TextAssignment_1 )* )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:532:1: ( rule__Declaration__TextAssignment_1 )*
            {
             before(grammarAccess.getDeclarationAccess().getTextAssignment_1()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:533:1: ( rule__Declaration__TextAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_ANY_OTHER && LA4_0<=RULE_INT)||(LA4_0>=13 && LA4_0<=14)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:533:2: rule__Declaration__TextAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Declaration__TextAssignment_1_in_rule__Declaration__Group__1__Impl1061);
            	    rule__Declaration__TextAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getDeclarationAccess().getTextAssignment_1()); 

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
    // $ANTLR end "rule__Declaration__Group__1__Impl"


    // $ANTLR start "rule__Declaration__Group__2"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:543:1: rule__Declaration__Group__2 : rule__Declaration__Group__2__Impl ;
    public final void rule__Declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:547:1: ( rule__Declaration__Group__2__Impl )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:548:2: rule__Declaration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group__2__Impl_in_rule__Declaration__Group__21092);
            rule__Declaration__Group__2__Impl();

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
    // $ANTLR end "rule__Declaration__Group__2"


    // $ANTLR start "rule__Declaration__Group__2__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:554:1: rule__Declaration__Group__2__Impl : ( 'EndDeclarations' ) ;
    public final void rule__Declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:558:1: ( ( 'EndDeclarations' ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:559:1: ( 'EndDeclarations' )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:559:1: ( 'EndDeclarations' )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:560:1: 'EndDeclarations'
            {
             before(grammarAccess.getDeclarationAccess().getEndDeclarationsKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__Declaration__Group__2__Impl1120); 
             after(grammarAccess.getDeclarationAccess().getEndDeclarationsKeyword_2()); 

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
    // $ANTLR end "rule__Declaration__Group__2__Impl"


    // $ANTLR start "rule__Template__Group__0"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:579:1: rule__Template__Group__0 : rule__Template__Group__0__Impl rule__Template__Group__1 ;
    public final void rule__Template__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:583:1: ( rule__Template__Group__0__Impl rule__Template__Group__1 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:584:2: rule__Template__Group__0__Impl rule__Template__Group__1
            {
            pushFollow(FOLLOW_rule__Template__Group__0__Impl_in_rule__Template__Group__01157);
            rule__Template__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Template__Group__1_in_rule__Template__Group__01160);
            rule__Template__Group__1();

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
    // $ANTLR end "rule__Template__Group__0"


    // $ANTLR start "rule__Template__Group__0__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:591:1: rule__Template__Group__0__Impl : ( 'Template' ) ;
    public final void rule__Template__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:595:1: ( ( 'Template' ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:596:1: ( 'Template' )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:596:1: ( 'Template' )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:597:1: 'Template'
            {
             before(grammarAccess.getTemplateAccess().getTemplateKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Template__Group__0__Impl1188); 
             after(grammarAccess.getTemplateAccess().getTemplateKeyword_0()); 

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
    // $ANTLR end "rule__Template__Group__0__Impl"


    // $ANTLR start "rule__Template__Group__1"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:610:1: rule__Template__Group__1 : rule__Template__Group__1__Impl rule__Template__Group__2 ;
    public final void rule__Template__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:614:1: ( rule__Template__Group__1__Impl rule__Template__Group__2 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:615:2: rule__Template__Group__1__Impl rule__Template__Group__2
            {
            pushFollow(FOLLOW_rule__Template__Group__1__Impl_in_rule__Template__Group__11219);
            rule__Template__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Template__Group__2_in_rule__Template__Group__11222);
            rule__Template__Group__2();

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
    // $ANTLR end "rule__Template__Group__1"


    // $ANTLR start "rule__Template__Group__1__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:622:1: rule__Template__Group__1__Impl : ( ( rule__Template__NameAssignment_1 ) ) ;
    public final void rule__Template__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:626:1: ( ( ( rule__Template__NameAssignment_1 ) ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:627:1: ( ( rule__Template__NameAssignment_1 ) )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:627:1: ( ( rule__Template__NameAssignment_1 ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:628:1: ( rule__Template__NameAssignment_1 )
            {
             before(grammarAccess.getTemplateAccess().getNameAssignment_1()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:629:1: ( rule__Template__NameAssignment_1 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:629:2: rule__Template__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Template__NameAssignment_1_in_rule__Template__Group__1__Impl1249);
            rule__Template__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTemplateAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Template__Group__1__Impl"


    // $ANTLR start "rule__Template__Group__2"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:639:1: rule__Template__Group__2 : rule__Template__Group__2__Impl rule__Template__Group__3 ;
    public final void rule__Template__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:643:1: ( rule__Template__Group__2__Impl rule__Template__Group__3 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:644:2: rule__Template__Group__2__Impl rule__Template__Group__3
            {
            pushFollow(FOLLOW_rule__Template__Group__2__Impl_in_rule__Template__Group__21279);
            rule__Template__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Template__Group__3_in_rule__Template__Group__21282);
            rule__Template__Group__3();

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
    // $ANTLR end "rule__Template__Group__2"


    // $ANTLR start "rule__Template__Group__2__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:651:1: rule__Template__Group__2__Impl : ( ( rule__Template__ParametersAssignment_2 )? ) ;
    public final void rule__Template__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:655:1: ( ( ( rule__Template__ParametersAssignment_2 )? ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:656:1: ( ( rule__Template__ParametersAssignment_2 )? )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:656:1: ( ( rule__Template__ParametersAssignment_2 )? )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:657:1: ( rule__Template__ParametersAssignment_2 )?
            {
             before(grammarAccess.getTemplateAccess().getParametersAssignment_2()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:658:1: ( rule__Template__ParametersAssignment_2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:658:2: rule__Template__ParametersAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Template__ParametersAssignment_2_in_rule__Template__Group__2__Impl1309);
                    rule__Template__ParametersAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTemplateAccess().getParametersAssignment_2()); 

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
    // $ANTLR end "rule__Template__Group__2__Impl"


    // $ANTLR start "rule__Template__Group__3"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:668:1: rule__Template__Group__3 : rule__Template__Group__3__Impl rule__Template__Group__4 ;
    public final void rule__Template__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:672:1: ( rule__Template__Group__3__Impl rule__Template__Group__4 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:673:2: rule__Template__Group__3__Impl rule__Template__Group__4
            {
            pushFollow(FOLLOW_rule__Template__Group__3__Impl_in_rule__Template__Group__31340);
            rule__Template__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Template__Group__4_in_rule__Template__Group__31343);
            rule__Template__Group__4();

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
    // $ANTLR end "rule__Template__Group__3"


    // $ANTLR start "rule__Template__Group__3__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:680:1: rule__Template__Group__3__Impl : ( ( rule__Template__DeclarationAssignment_3 )? ) ;
    public final void rule__Template__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:684:1: ( ( ( rule__Template__DeclarationAssignment_3 )? ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:685:1: ( ( rule__Template__DeclarationAssignment_3 )? )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:685:1: ( ( rule__Template__DeclarationAssignment_3 )? )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:686:1: ( rule__Template__DeclarationAssignment_3 )?
            {
             before(grammarAccess.getTemplateAccess().getDeclarationAssignment_3()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:687:1: ( rule__Template__DeclarationAssignment_3 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:687:2: rule__Template__DeclarationAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Template__DeclarationAssignment_3_in_rule__Template__Group__3__Impl1370);
                    rule__Template__DeclarationAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTemplateAccess().getDeclarationAssignment_3()); 

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
    // $ANTLR end "rule__Template__Group__3__Impl"


    // $ANTLR start "rule__Template__Group__4"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:697:1: rule__Template__Group__4 : rule__Template__Group__4__Impl rule__Template__Group__5 ;
    public final void rule__Template__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:701:1: ( rule__Template__Group__4__Impl rule__Template__Group__5 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:702:2: rule__Template__Group__4__Impl rule__Template__Group__5
            {
            pushFollow(FOLLOW_rule__Template__Group__4__Impl_in_rule__Template__Group__41401);
            rule__Template__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Template__Group__5_in_rule__Template__Group__41404);
            rule__Template__Group__5();

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
    // $ANTLR end "rule__Template__Group__4"


    // $ANTLR start "rule__Template__Group__4__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:709:1: rule__Template__Group__4__Impl : ( ( ( rule__Template__StateAssignment_4 ) ) ( ( rule__Template__StateAssignment_4 )* ) ) ;
    public final void rule__Template__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:713:1: ( ( ( ( rule__Template__StateAssignment_4 ) ) ( ( rule__Template__StateAssignment_4 )* ) ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:714:1: ( ( ( rule__Template__StateAssignment_4 ) ) ( ( rule__Template__StateAssignment_4 )* ) )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:714:1: ( ( ( rule__Template__StateAssignment_4 ) ) ( ( rule__Template__StateAssignment_4 )* ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:715:1: ( ( rule__Template__StateAssignment_4 ) ) ( ( rule__Template__StateAssignment_4 )* )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:715:1: ( ( rule__Template__StateAssignment_4 ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:716:1: ( rule__Template__StateAssignment_4 )
            {
             before(grammarAccess.getTemplateAccess().getStateAssignment_4()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:717:1: ( rule__Template__StateAssignment_4 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:717:2: rule__Template__StateAssignment_4
            {
            pushFollow(FOLLOW_rule__Template__StateAssignment_4_in_rule__Template__Group__4__Impl1433);
            rule__Template__StateAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTemplateAccess().getStateAssignment_4()); 

            }

            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:720:1: ( ( rule__Template__StateAssignment_4 )* )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:721:1: ( rule__Template__StateAssignment_4 )*
            {
             before(grammarAccess.getTemplateAccess().getStateAssignment_4()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:722:1: ( rule__Template__StateAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=11 && LA7_0<=12)||(LA7_0>=23 && LA7_0<=24)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:722:2: rule__Template__StateAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Template__StateAssignment_4_in_rule__Template__Group__4__Impl1445);
            	    rule__Template__StateAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getTemplateAccess().getStateAssignment_4()); 

            }


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
    // $ANTLR end "rule__Template__Group__4__Impl"


    // $ANTLR start "rule__Template__Group__5"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:733:1: rule__Template__Group__5 : rule__Template__Group__5__Impl rule__Template__Group__6 ;
    public final void rule__Template__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:737:1: ( rule__Template__Group__5__Impl rule__Template__Group__6 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:738:2: rule__Template__Group__5__Impl rule__Template__Group__6
            {
            pushFollow(FOLLOW_rule__Template__Group__5__Impl_in_rule__Template__Group__51478);
            rule__Template__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Template__Group__6_in_rule__Template__Group__51481);
            rule__Template__Group__6();

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
    // $ANTLR end "rule__Template__Group__5"


    // $ANTLR start "rule__Template__Group__5__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:745:1: rule__Template__Group__5__Impl : ( ( rule__Template__BranchpointAssignment_5 )* ) ;
    public final void rule__Template__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:749:1: ( ( ( rule__Template__BranchpointAssignment_5 )* ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:750:1: ( ( rule__Template__BranchpointAssignment_5 )* )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:750:1: ( ( rule__Template__BranchpointAssignment_5 )* )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:751:1: ( rule__Template__BranchpointAssignment_5 )*
            {
             before(grammarAccess.getTemplateAccess().getBranchpointAssignment_5()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:752:1: ( rule__Template__BranchpointAssignment_5 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==13) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:752:2: rule__Template__BranchpointAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Template__BranchpointAssignment_5_in_rule__Template__Group__5__Impl1508);
            	    rule__Template__BranchpointAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getTemplateAccess().getBranchpointAssignment_5()); 

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
    // $ANTLR end "rule__Template__Group__5__Impl"


    // $ANTLR start "rule__Template__Group__6"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:762:1: rule__Template__Group__6 : rule__Template__Group__6__Impl rule__Template__Group__7 ;
    public final void rule__Template__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:766:1: ( rule__Template__Group__6__Impl rule__Template__Group__7 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:767:2: rule__Template__Group__6__Impl rule__Template__Group__7
            {
            pushFollow(FOLLOW_rule__Template__Group__6__Impl_in_rule__Template__Group__61539);
            rule__Template__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Template__Group__7_in_rule__Template__Group__61542);
            rule__Template__Group__7();

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
    // $ANTLR end "rule__Template__Group__6"


    // $ANTLR start "rule__Template__Group__6__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:774:1: rule__Template__Group__6__Impl : ( ( ( rule__Template__TransitionAssignment_6 ) ) ( ( rule__Template__TransitionAssignment_6 )* ) ) ;
    public final void rule__Template__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:778:1: ( ( ( ( rule__Template__TransitionAssignment_6 ) ) ( ( rule__Template__TransitionAssignment_6 )* ) ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:779:1: ( ( ( rule__Template__TransitionAssignment_6 ) ) ( ( rule__Template__TransitionAssignment_6 )* ) )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:779:1: ( ( ( rule__Template__TransitionAssignment_6 ) ) ( ( rule__Template__TransitionAssignment_6 )* ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:780:1: ( ( rule__Template__TransitionAssignment_6 ) ) ( ( rule__Template__TransitionAssignment_6 )* )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:780:1: ( ( rule__Template__TransitionAssignment_6 ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:781:1: ( rule__Template__TransitionAssignment_6 )
            {
             before(grammarAccess.getTemplateAccess().getTransitionAssignment_6()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:782:1: ( rule__Template__TransitionAssignment_6 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:782:2: rule__Template__TransitionAssignment_6
            {
            pushFollow(FOLLOW_rule__Template__TransitionAssignment_6_in_rule__Template__Group__6__Impl1571);
            rule__Template__TransitionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTemplateAccess().getTransitionAssignment_6()); 

            }

            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:785:1: ( ( rule__Template__TransitionAssignment_6 )* )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:786:1: ( rule__Template__TransitionAssignment_6 )*
            {
             before(grammarAccess.getTemplateAccess().getTransitionAssignment_6()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:787:1: ( rule__Template__TransitionAssignment_6 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:787:2: rule__Template__TransitionAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Template__TransitionAssignment_6_in_rule__Template__Group__6__Impl1583);
            	    rule__Template__TransitionAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getTemplateAccess().getTransitionAssignment_6()); 

            }


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
    // $ANTLR end "rule__Template__Group__6__Impl"


    // $ANTLR start "rule__Template__Group__7"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:798:1: rule__Template__Group__7 : rule__Template__Group__7__Impl ;
    public final void rule__Template__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:802:1: ( rule__Template__Group__7__Impl )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:803:2: rule__Template__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Template__Group__7__Impl_in_rule__Template__Group__71616);
            rule__Template__Group__7__Impl();

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
    // $ANTLR end "rule__Template__Group__7"


    // $ANTLR start "rule__Template__Group__7__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:809:1: rule__Template__Group__7__Impl : ( 'EndTemplate' ) ;
    public final void rule__Template__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:813:1: ( ( 'EndTemplate' ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:814:1: ( 'EndTemplate' )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:814:1: ( 'EndTemplate' )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:815:1: 'EndTemplate'
            {
             before(grammarAccess.getTemplateAccess().getEndTemplateKeyword_7()); 
            match(input,18,FOLLOW_18_in_rule__Template__Group__7__Impl1644); 
             after(grammarAccess.getTemplateAccess().getEndTemplateKeyword_7()); 

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
    // $ANTLR end "rule__Template__Group__7__Impl"


    // $ANTLR start "rule__System__Group__0"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:844:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:848:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:849:2: rule__System__Group__0__Impl rule__System__Group__1
            {
            pushFollow(FOLLOW_rule__System__Group__0__Impl_in_rule__System__Group__01691);
            rule__System__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__1_in_rule__System__Group__01694);
            rule__System__Group__1();

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
    // $ANTLR end "rule__System__Group__0"


    // $ANTLR start "rule__System__Group__0__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:856:1: rule__System__Group__0__Impl : ( 'System' ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:860:1: ( ( 'System' ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:861:1: ( 'System' )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:861:1: ( 'System' )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:862:1: 'System'
            {
             before(grammarAccess.getSystemAccess().getSystemKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__System__Group__0__Impl1722); 
             after(grammarAccess.getSystemAccess().getSystemKeyword_0()); 

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
    // $ANTLR end "rule__System__Group__0__Impl"


    // $ANTLR start "rule__System__Group__1"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:875:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:879:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:880:2: rule__System__Group__1__Impl rule__System__Group__2
            {
            pushFollow(FOLLOW_rule__System__Group__1__Impl_in_rule__System__Group__11753);
            rule__System__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__2_in_rule__System__Group__11756);
            rule__System__Group__2();

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
    // $ANTLR end "rule__System__Group__1"


    // $ANTLR start "rule__System__Group__1__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:887:1: rule__System__Group__1__Impl : ( ( rule__System__TextAssignment_1 )* ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:891:1: ( ( ( rule__System__TextAssignment_1 )* ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:892:1: ( ( rule__System__TextAssignment_1 )* )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:892:1: ( ( rule__System__TextAssignment_1 )* )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:893:1: ( rule__System__TextAssignment_1 )*
            {
             before(grammarAccess.getSystemAccess().getTextAssignment_1()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:894:1: ( rule__System__TextAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_ANY_OTHER && LA10_0<=RULE_INT)||(LA10_0>=13 && LA10_0<=14)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:894:2: rule__System__TextAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__System__TextAssignment_1_in_rule__System__Group__1__Impl1783);
            	    rule__System__TextAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getSystemAccess().getTextAssignment_1()); 

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
    // $ANTLR end "rule__System__Group__1__Impl"


    // $ANTLR start "rule__System__Group__2"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:904:1: rule__System__Group__2 : rule__System__Group__2__Impl ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:908:1: ( rule__System__Group__2__Impl )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:909:2: rule__System__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__System__Group__2__Impl_in_rule__System__Group__21814);
            rule__System__Group__2__Impl();

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
    // $ANTLR end "rule__System__Group__2"


    // $ANTLR start "rule__System__Group__2__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:915:1: rule__System__Group__2__Impl : ( 'EndSystem' ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:919:1: ( ( 'EndSystem' ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:920:1: ( 'EndSystem' )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:920:1: ( 'EndSystem' )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:921:1: 'EndSystem'
            {
             before(grammarAccess.getSystemAccess().getEndSystemKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__System__Group__2__Impl1842); 
             after(grammarAccess.getSystemAccess().getEndSystemKeyword_2()); 

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
    // $ANTLR end "rule__System__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:940:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:944:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:945:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__01879);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__01882);
            rule__Parameter__Group__1();

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
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:952:1: rule__Parameter__Group__0__Impl : ( 'Parameters' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:956:1: ( ( 'Parameters' ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:957:1: ( 'Parameters' )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:957:1: ( 'Parameters' )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:958:1: 'Parameters'
            {
             before(grammarAccess.getParameterAccess().getParametersKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Parameter__Group__0__Impl1910); 
             after(grammarAccess.getParameterAccess().getParametersKeyword_0()); 

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
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:971:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:975:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:976:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__11941);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__11944);
            rule__Parameter__Group__2();

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
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:983:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__TextAssignment_1 )* ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:987:1: ( ( ( rule__Parameter__TextAssignment_1 )* ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:988:1: ( ( rule__Parameter__TextAssignment_1 )* )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:988:1: ( ( rule__Parameter__TextAssignment_1 )* )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:989:1: ( rule__Parameter__TextAssignment_1 )*
            {
             before(grammarAccess.getParameterAccess().getTextAssignment_1()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:990:1: ( rule__Parameter__TextAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_ANY_OTHER && LA11_0<=RULE_INT)||(LA11_0>=13 && LA11_0<=14)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:990:2: rule__Parameter__TextAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Parameter__TextAssignment_1_in_rule__Parameter__Group__1__Impl1971);
            	    rule__Parameter__TextAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getParameterAccess().getTextAssignment_1()); 

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
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1000:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1004:1: ( rule__Parameter__Group__2__Impl )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1005:2: rule__Parameter__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__22002);
            rule__Parameter__Group__2__Impl();

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
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1011:1: rule__Parameter__Group__2__Impl : ( 'EndParameters' ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1015:1: ( ( 'EndParameters' ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1016:1: ( 'EndParameters' )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1016:1: ( 'EndParameters' )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1017:1: 'EndParameters'
            {
             before(grammarAccess.getParameterAccess().getEndParametersKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__Parameter__Group__2__Impl2030); 
             after(grammarAccess.getParameterAccess().getEndParametersKeyword_2()); 

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
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__State__Group__0"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1036:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1040:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1041:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__02067);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__1_in_rule__State__Group__02070);
            rule__State__Group__1();

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
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1048:1: rule__State__Group__0__Impl : ( ( 'ini' )? ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1052:1: ( ( ( 'ini' )? ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1053:1: ( ( 'ini' )? )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1053:1: ( ( 'ini' )? )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1054:1: ( 'ini' )?
            {
             before(grammarAccess.getStateAccess().getIniKeyword_0()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1055:1: ( 'ini' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1056:2: 'ini'
                    {
                    match(input,23,FOLLOW_23_in_rule__State__Group__0__Impl2099); 

                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getIniKeyword_0()); 

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
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1067:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1071:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1072:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__12132);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__2_in_rule__State__Group__12135);
            rule__State__Group__2();

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
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1079:1: rule__State__Group__1__Impl : ( ( rule__State__Alternatives_1 )? ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1083:1: ( ( ( rule__State__Alternatives_1 )? ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1084:1: ( ( rule__State__Alternatives_1 )? )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1084:1: ( ( rule__State__Alternatives_1 )? )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1085:1: ( rule__State__Alternatives_1 )?
            {
             before(grammarAccess.getStateAccess().getAlternatives_1()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1086:1: ( rule__State__Alternatives_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=11 && LA13_0<=12)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1086:2: rule__State__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__State__Alternatives_1_in_rule__State__Group__1__Impl2162);
                    rule__State__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__State__Group__2"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1096:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1100:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1101:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__22193);
            rule__State__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__3_in_rule__State__Group__22196);
            rule__State__Group__3();

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
    // $ANTLR end "rule__State__Group__2"


    // $ANTLR start "rule__State__Group__2__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1108:1: rule__State__Group__2__Impl : ( ':' ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1112:1: ( ( ':' ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1113:1: ( ':' )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1113:1: ( ':' )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1114:1: ':'
            {
             before(grammarAccess.getStateAccess().getColonKeyword_2()); 
            match(input,24,FOLLOW_24_in_rule__State__Group__2__Impl2224); 
             after(grammarAccess.getStateAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__State__Group__2__Impl"


    // $ANTLR start "rule__State__Group__3"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1127:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1131:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1132:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__32255);
            rule__State__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__4_in_rule__State__Group__32258);
            rule__State__Group__4();

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
    // $ANTLR end "rule__State__Group__3"


    // $ANTLR start "rule__State__Group__3__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1139:1: rule__State__Group__3__Impl : ( ( rule__State__IdAssignment_3 ) ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1143:1: ( ( ( rule__State__IdAssignment_3 ) ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1144:1: ( ( rule__State__IdAssignment_3 ) )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1144:1: ( ( rule__State__IdAssignment_3 ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1145:1: ( rule__State__IdAssignment_3 )
            {
             before(grammarAccess.getStateAccess().getIdAssignment_3()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1146:1: ( rule__State__IdAssignment_3 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1146:2: rule__State__IdAssignment_3
            {
            pushFollow(FOLLOW_rule__State__IdAssignment_3_in_rule__State__Group__3__Impl2285);
            rule__State__IdAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getIdAssignment_3()); 

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
    // $ANTLR end "rule__State__Group__3__Impl"


    // $ANTLR start "rule__State__Group__4"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1156:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1160:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1161:2: rule__State__Group__4__Impl rule__State__Group__5
            {
            pushFollow(FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__42315);
            rule__State__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__5_in_rule__State__Group__42318);
            rule__State__Group__5();

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
    // $ANTLR end "rule__State__Group__4"


    // $ANTLR start "rule__State__Group__4__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1168:1: rule__State__Group__4__Impl : ( ( rule__State__Group_4__0 )? ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1172:1: ( ( ( rule__State__Group_4__0 )? ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1173:1: ( ( rule__State__Group_4__0 )? )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1173:1: ( ( rule__State__Group_4__0 )? )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1174:1: ( rule__State__Group_4__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_4()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1175:1: ( rule__State__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==14) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==RULE_ID) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1175:2: rule__State__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_4__0_in_rule__State__Group__4__Impl2345);
                    rule__State__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getGroup_4()); 

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
    // $ANTLR end "rule__State__Group__4__Impl"


    // $ANTLR start "rule__State__Group__5"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1185:1: rule__State__Group__5 : rule__State__Group__5__Impl rule__State__Group__6 ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1189:1: ( rule__State__Group__5__Impl rule__State__Group__6 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1190:2: rule__State__Group__5__Impl rule__State__Group__6
            {
            pushFollow(FOLLOW_rule__State__Group__5__Impl_in_rule__State__Group__52376);
            rule__State__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__6_in_rule__State__Group__52379);
            rule__State__Group__6();

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
    // $ANTLR end "rule__State__Group__5"


    // $ANTLR start "rule__State__Group__5__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1197:1: rule__State__Group__5__Impl : ( ( rule__State__TextAssignment_5 )* ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1201:1: ( ( ( rule__State__TextAssignment_5 )* ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1202:1: ( ( rule__State__TextAssignment_5 )* )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1202:1: ( ( rule__State__TextAssignment_5 )* )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1203:1: ( rule__State__TextAssignment_5 )*
            {
             before(grammarAccess.getStateAccess().getTextAssignment_5()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1204:1: ( rule__State__TextAssignment_5 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==13) ) {
                    switch ( input.LA(2) ) {
                    case 24:
                        {
                        int LA15_4 = input.LA(3);

                        if ( ((LA15_4>=RULE_ANY_OTHER && LA15_4<=RULE_INT)||(LA15_4>=13 && LA15_4<=14)) ) {
                            alt15=1;
                        }


                        }
                        break;
                    case RULE_ANY_OTHER:
                    case RULE_INT:
                    case 13:
                    case 14:
                        {
                        alt15=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        switch ( input.LA(3) ) {
                        case 24:
                            {
                            alt15=1;
                            }
                            break;
                        case RULE_ID:
                        case RULE_INT:
                        case 13:
                        case 14:
                            {
                            alt15=1;
                            }
                            break;
                        case RULE_ANY_OTHER:
                            {
                            alt15=1;
                            }
                            break;

                        }

                        }
                        break;

                    }

                }
                else if ( ((LA15_0>=RULE_ANY_OTHER && LA15_0<=RULE_INT)||LA15_0==14) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1204:2: rule__State__TextAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__State__TextAssignment_5_in_rule__State__Group__5__Impl2406);
            	    rule__State__TextAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getTextAssignment_5()); 

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
    // $ANTLR end "rule__State__Group__5__Impl"


    // $ANTLR start "rule__State__Group__6"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1214:1: rule__State__Group__6 : rule__State__Group__6__Impl rule__State__Group__7 ;
    public final void rule__State__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1218:1: ( rule__State__Group__6__Impl rule__State__Group__7 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1219:2: rule__State__Group__6__Impl rule__State__Group__7
            {
            pushFollow(FOLLOW_rule__State__Group__6__Impl_in_rule__State__Group__62437);
            rule__State__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__7_in_rule__State__Group__62440);
            rule__State__Group__7();

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
    // $ANTLR end "rule__State__Group__6"


    // $ANTLR start "rule__State__Group__6__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1226:1: rule__State__Group__6__Impl : ( ( rule__State__Group_6__0 )? ) ;
    public final void rule__State__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1230:1: ( ( ( rule__State__Group_6__0 )? ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1231:1: ( ( rule__State__Group_6__0 )? )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1231:1: ( ( rule__State__Group_6__0 )? )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1232:1: ( rule__State__Group_6__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_6()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1233:1: ( rule__State__Group_6__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1233:2: rule__State__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_6__0_in_rule__State__Group__6__Impl2467);
                    rule__State__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getGroup_6()); 

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
    // $ANTLR end "rule__State__Group__6__Impl"


    // $ANTLR start "rule__State__Group__7"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1243:1: rule__State__Group__7 : rule__State__Group__7__Impl ;
    public final void rule__State__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1247:1: ( rule__State__Group__7__Impl )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1248:2: rule__State__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__State__Group__7__Impl_in_rule__State__Group__72498);
            rule__State__Group__7__Impl();

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
    // $ANTLR end "rule__State__Group__7"


    // $ANTLR start "rule__State__Group__7__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1254:1: rule__State__Group__7__Impl : ( ';' ) ;
    public final void rule__State__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1258:1: ( ( ';' ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1259:1: ( ';' )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1259:1: ( ';' )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1260:1: ';'
            {
             before(grammarAccess.getStateAccess().getSemicolonKeyword_7()); 
            match(input,13,FOLLOW_13_in_rule__State__Group__7__Impl2526); 
             after(grammarAccess.getStateAccess().getSemicolonKeyword_7()); 

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
    // $ANTLR end "rule__State__Group__7__Impl"


    // $ANTLR start "rule__State__Group_4__0"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1289:1: rule__State__Group_4__0 : rule__State__Group_4__0__Impl rule__State__Group_4__1 ;
    public final void rule__State__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1293:1: ( rule__State__Group_4__0__Impl rule__State__Group_4__1 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1294:2: rule__State__Group_4__0__Impl rule__State__Group_4__1
            {
            pushFollow(FOLLOW_rule__State__Group_4__0__Impl_in_rule__State__Group_4__02573);
            rule__State__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_4__1_in_rule__State__Group_4__02576);
            rule__State__Group_4__1();

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
    // $ANTLR end "rule__State__Group_4__0"


    // $ANTLR start "rule__State__Group_4__0__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1301:1: rule__State__Group_4__0__Impl : ( ',' ) ;
    public final void rule__State__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1305:1: ( ( ',' ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1306:1: ( ',' )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1306:1: ( ',' )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1307:1: ','
            {
             before(grammarAccess.getStateAccess().getCommaKeyword_4_0()); 
            match(input,14,FOLLOW_14_in_rule__State__Group_4__0__Impl2604); 
             after(grammarAccess.getStateAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__State__Group_4__0__Impl"


    // $ANTLR start "rule__State__Group_4__1"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1320:1: rule__State__Group_4__1 : rule__State__Group_4__1__Impl ;
    public final void rule__State__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1324:1: ( rule__State__Group_4__1__Impl )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1325:2: rule__State__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__State__Group_4__1__Impl_in_rule__State__Group_4__12635);
            rule__State__Group_4__1__Impl();

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
    // $ANTLR end "rule__State__Group_4__1"


    // $ANTLR start "rule__State__Group_4__1__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1331:1: rule__State__Group_4__1__Impl : ( ( rule__State__NameAssignment_4_1 ) ) ;
    public final void rule__State__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1335:1: ( ( ( rule__State__NameAssignment_4_1 ) ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1336:1: ( ( rule__State__NameAssignment_4_1 ) )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1336:1: ( ( rule__State__NameAssignment_4_1 ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1337:1: ( rule__State__NameAssignment_4_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_4_1()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1338:1: ( rule__State__NameAssignment_4_1 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1338:2: rule__State__NameAssignment_4_1
            {
            pushFollow(FOLLOW_rule__State__NameAssignment_4_1_in_rule__State__Group_4__1__Impl2662);
            rule__State__NameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_4_1()); 

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
    // $ANTLR end "rule__State__Group_4__1__Impl"


    // $ANTLR start "rule__State__Group_6__0"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1352:1: rule__State__Group_6__0 : rule__State__Group_6__0__Impl rule__State__Group_6__1 ;
    public final void rule__State__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1356:1: ( rule__State__Group_6__0__Impl rule__State__Group_6__1 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1357:2: rule__State__Group_6__0__Impl rule__State__Group_6__1
            {
            pushFollow(FOLLOW_rule__State__Group_6__0__Impl_in_rule__State__Group_6__02696);
            rule__State__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_6__1_in_rule__State__Group_6__02699);
            rule__State__Group_6__1();

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
    // $ANTLR end "rule__State__Group_6__0"


    // $ANTLR start "rule__State__Group_6__0__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1364:1: rule__State__Group_6__0__Impl : ( ':' ) ;
    public final void rule__State__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1368:1: ( ( ':' ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1369:1: ( ':' )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1369:1: ( ':' )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1370:1: ':'
            {
             before(grammarAccess.getStateAccess().getColonKeyword_6_0()); 
            match(input,24,FOLLOW_24_in_rule__State__Group_6__0__Impl2727); 
             after(grammarAccess.getStateAccess().getColonKeyword_6_0()); 

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
    // $ANTLR end "rule__State__Group_6__0__Impl"


    // $ANTLR start "rule__State__Group_6__1"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1383:1: rule__State__Group_6__1 : rule__State__Group_6__1__Impl ;
    public final void rule__State__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1387:1: ( rule__State__Group_6__1__Impl )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1388:2: rule__State__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__State__Group_6__1__Impl_in_rule__State__Group_6__12758);
            rule__State__Group_6__1__Impl();

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
    // $ANTLR end "rule__State__Group_6__1"


    // $ANTLR start "rule__State__Group_6__1__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1394:1: rule__State__Group_6__1__Impl : ( ( rule__State__ExponentialRateAssignment_6_1 )* ) ;
    public final void rule__State__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1398:1: ( ( ( rule__State__ExponentialRateAssignment_6_1 )* ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1399:1: ( ( rule__State__ExponentialRateAssignment_6_1 )* )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1399:1: ( ( rule__State__ExponentialRateAssignment_6_1 )* )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1400:1: ( rule__State__ExponentialRateAssignment_6_1 )*
            {
             before(grammarAccess.getStateAccess().getExponentialRateAssignment_6_1()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1401:1: ( rule__State__ExponentialRateAssignment_6_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==13) ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1==RULE_ID) ) {
                        int LA17_4 = input.LA(3);

                        if ( ((LA17_4>=RULE_ID && LA17_4<=RULE_INT)||(LA17_4>=13 && LA17_4<=14)) ) {
                            alt17=1;
                        }
                        else if ( (LA17_4==RULE_ANY_OTHER) ) {
                            alt17=1;
                        }


                    }
                    else if ( (LA17_1==RULE_ANY_OTHER||LA17_1==RULE_INT||(LA17_1>=13 && LA17_1<=14)) ) {
                        alt17=1;
                    }


                }
                else if ( ((LA17_0>=RULE_ANY_OTHER && LA17_0<=RULE_INT)||LA17_0==14) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1401:2: rule__State__ExponentialRateAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_rule__State__ExponentialRateAssignment_6_1_in_rule__State__Group_6__1__Impl2785);
            	    rule__State__ExponentialRateAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getExponentialRateAssignment_6_1()); 

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
    // $ANTLR end "rule__State__Group_6__1__Impl"


    // $ANTLR start "rule__Branchpoint__Group__0"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1415:1: rule__Branchpoint__Group__0 : rule__Branchpoint__Group__0__Impl rule__Branchpoint__Group__1 ;
    public final void rule__Branchpoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1419:1: ( rule__Branchpoint__Group__0__Impl rule__Branchpoint__Group__1 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1420:2: rule__Branchpoint__Group__0__Impl rule__Branchpoint__Group__1
            {
            pushFollow(FOLLOW_rule__Branchpoint__Group__0__Impl_in_rule__Branchpoint__Group__02820);
            rule__Branchpoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Branchpoint__Group__1_in_rule__Branchpoint__Group__02823);
            rule__Branchpoint__Group__1();

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
    // $ANTLR end "rule__Branchpoint__Group__0"


    // $ANTLR start "rule__Branchpoint__Group__0__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1427:1: rule__Branchpoint__Group__0__Impl : ( ( rule__Branchpoint__NameAssignment_0 ) ) ;
    public final void rule__Branchpoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1431:1: ( ( ( rule__Branchpoint__NameAssignment_0 ) ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1432:1: ( ( rule__Branchpoint__NameAssignment_0 ) )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1432:1: ( ( rule__Branchpoint__NameAssignment_0 ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1433:1: ( rule__Branchpoint__NameAssignment_0 )
            {
             before(grammarAccess.getBranchpointAccess().getNameAssignment_0()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1434:1: ( rule__Branchpoint__NameAssignment_0 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1434:2: rule__Branchpoint__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Branchpoint__NameAssignment_0_in_rule__Branchpoint__Group__0__Impl2850);
            rule__Branchpoint__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBranchpointAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Branchpoint__Group__0__Impl"


    // $ANTLR start "rule__Branchpoint__Group__1"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1444:1: rule__Branchpoint__Group__1 : rule__Branchpoint__Group__1__Impl ;
    public final void rule__Branchpoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1448:1: ( rule__Branchpoint__Group__1__Impl )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1449:2: rule__Branchpoint__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Branchpoint__Group__1__Impl_in_rule__Branchpoint__Group__12880);
            rule__Branchpoint__Group__1__Impl();

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
    // $ANTLR end "rule__Branchpoint__Group__1"


    // $ANTLR start "rule__Branchpoint__Group__1__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1455:1: rule__Branchpoint__Group__1__Impl : ( ';' ) ;
    public final void rule__Branchpoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1459:1: ( ( ';' ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1460:1: ( ';' )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1460:1: ( ';' )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1461:1: ';'
            {
             before(grammarAccess.getBranchpointAccess().getSemicolonKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__Branchpoint__Group__1__Impl2908); 
             after(grammarAccess.getBranchpointAccess().getSemicolonKeyword_1()); 

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
    // $ANTLR end "rule__Branchpoint__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1478:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1482:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1483:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__02943);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__02946);
            rule__Transition__Group__1();

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
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1490:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__OutBoundStateAssignment_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1494:1: ( ( ( rule__Transition__OutBoundStateAssignment_0 ) ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1495:1: ( ( rule__Transition__OutBoundStateAssignment_0 ) )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1495:1: ( ( rule__Transition__OutBoundStateAssignment_0 ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1496:1: ( rule__Transition__OutBoundStateAssignment_0 )
            {
             before(grammarAccess.getTransitionAccess().getOutBoundStateAssignment_0()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1497:1: ( rule__Transition__OutBoundStateAssignment_0 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1497:2: rule__Transition__OutBoundStateAssignment_0
            {
            pushFollow(FOLLOW_rule__Transition__OutBoundStateAssignment_0_in_rule__Transition__Group__0__Impl2973);
            rule__Transition__OutBoundStateAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getOutBoundStateAssignment_0()); 

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
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1507:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1511:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1512:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__13003);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__13006);
            rule__Transition__Group__2();

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
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1519:1: rule__Transition__Group__1__Impl : ( '->' ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1523:1: ( ( '->' ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1524:1: ( '->' )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1524:1: ( '->' )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1525:1: '->'
            {
             before(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__Transition__Group__1__Impl3034); 
             after(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

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
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1538:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1542:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1543:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__23065);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__23068);
            rule__Transition__Group__3();

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
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1550:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__InboundStateAssignment_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1554:1: ( ( ( rule__Transition__InboundStateAssignment_2 ) ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1555:1: ( ( rule__Transition__InboundStateAssignment_2 ) )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1555:1: ( ( rule__Transition__InboundStateAssignment_2 ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1556:1: ( rule__Transition__InboundStateAssignment_2 )
            {
             before(grammarAccess.getTransitionAccess().getInboundStateAssignment_2()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1557:1: ( rule__Transition__InboundStateAssignment_2 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1557:2: rule__Transition__InboundStateAssignment_2
            {
            pushFollow(FOLLOW_rule__Transition__InboundStateAssignment_2_in_rule__Transition__Group__2__Impl3095);
            rule__Transition__InboundStateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getInboundStateAssignment_2()); 

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
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__3"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1567:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1571:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1572:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__33125);
            rule__Transition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__33128);
            rule__Transition__Group__4();

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
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1579:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__Group_3__0 ) ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1583:1: ( ( ( rule__Transition__Group_3__0 ) ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1584:1: ( ( rule__Transition__Group_3__0 ) )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1584:1: ( ( rule__Transition__Group_3__0 ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1585:1: ( rule__Transition__Group_3__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup_3()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1586:1: ( rule__Transition__Group_3__0 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1586:2: rule__Transition__Group_3__0
            {
            pushFollow(FOLLOW_rule__Transition__Group_3__0_in_rule__Transition__Group__3__Impl3155);
            rule__Transition__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group__4"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1596:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1600:1: ( rule__Transition__Group__4__Impl )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1601:2: rule__Transition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__43185);
            rule__Transition__Group__4__Impl();

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
    // $ANTLR end "rule__Transition__Group__4"


    // $ANTLR start "rule__Transition__Group__4__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1607:1: rule__Transition__Group__4__Impl : ( ';' ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1611:1: ( ( ';' ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1612:1: ( ';' )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1612:1: ( ';' )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1613:1: ';'
            {
             before(grammarAccess.getTransitionAccess().getSemicolonKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Transition__Group__4__Impl3213); 
             after(grammarAccess.getTransitionAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__Transition__Group__4__Impl"


    // $ANTLR start "rule__Transition__Group_3__0"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1636:1: rule__Transition__Group_3__0 : rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1 ;
    public final void rule__Transition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1640:1: ( rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1641:2: rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1
            {
            pushFollow(FOLLOW_rule__Transition__Group_3__0__Impl_in_rule__Transition__Group_3__03254);
            rule__Transition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group_3__1_in_rule__Transition__Group_3__03257);
            rule__Transition__Group_3__1();

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
    // $ANTLR end "rule__Transition__Group_3__0"


    // $ANTLR start "rule__Transition__Group_3__0__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1648:1: rule__Transition__Group_3__0__Impl : ( ':' ) ;
    public final void rule__Transition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1652:1: ( ( ':' ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1653:1: ( ':' )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1653:1: ( ':' )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1654:1: ':'
            {
             before(grammarAccess.getTransitionAccess().getColonKeyword_3_0()); 
            match(input,24,FOLLOW_24_in_rule__Transition__Group_3__0__Impl3285); 
             after(grammarAccess.getTransitionAccess().getColonKeyword_3_0()); 

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
    // $ANTLR end "rule__Transition__Group_3__0__Impl"


    // $ANTLR start "rule__Transition__Group_3__1"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1667:1: rule__Transition__Group_3__1 : rule__Transition__Group_3__1__Impl rule__Transition__Group_3__2 ;
    public final void rule__Transition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1671:1: ( rule__Transition__Group_3__1__Impl rule__Transition__Group_3__2 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1672:2: rule__Transition__Group_3__1__Impl rule__Transition__Group_3__2
            {
            pushFollow(FOLLOW_rule__Transition__Group_3__1__Impl_in_rule__Transition__Group_3__13316);
            rule__Transition__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group_3__2_in_rule__Transition__Group_3__13319);
            rule__Transition__Group_3__2();

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
    // $ANTLR end "rule__Transition__Group_3__1"


    // $ANTLR start "rule__Transition__Group_3__1__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1679:1: rule__Transition__Group_3__1__Impl : ( ( rule__Transition__Group_3_1__0 )? ) ;
    public final void rule__Transition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1683:1: ( ( ( rule__Transition__Group_3_1__0 )? ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1684:1: ( ( rule__Transition__Group_3_1__0 )? )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1684:1: ( ( rule__Transition__Group_3_1__0 )? )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1685:1: ( rule__Transition__Group_3_1__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_3_1()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1686:1: ( rule__Transition__Group_3_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1686:2: rule__Transition__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__Transition__Group_3_1__0_in_rule__Transition__Group_3__1__Impl3346);
                    rule__Transition__Group_3_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__Transition__Group_3__1__Impl"


    // $ANTLR start "rule__Transition__Group_3__2"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1696:1: rule__Transition__Group_3__2 : rule__Transition__Group_3__2__Impl rule__Transition__Group_3__3 ;
    public final void rule__Transition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1700:1: ( rule__Transition__Group_3__2__Impl rule__Transition__Group_3__3 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1701:2: rule__Transition__Group_3__2__Impl rule__Transition__Group_3__3
            {
            pushFollow(FOLLOW_rule__Transition__Group_3__2__Impl_in_rule__Transition__Group_3__23377);
            rule__Transition__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group_3__3_in_rule__Transition__Group_3__23380);
            rule__Transition__Group_3__3();

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
    // $ANTLR end "rule__Transition__Group_3__2"


    // $ANTLR start "rule__Transition__Group_3__2__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1708:1: rule__Transition__Group_3__2__Impl : ( ( ',' )? ) ;
    public final void rule__Transition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1712:1: ( ( ( ',' )? ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1713:1: ( ( ',' )? )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1713:1: ( ( ',' )? )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1714:1: ( ',' )?
            {
             before(grammarAccess.getTransitionAccess().getCommaKeyword_3_2()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1715:1: ( ',' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==14) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1716:2: ','
                    {
                    match(input,14,FOLLOW_14_in_rule__Transition__Group_3__2__Impl3409); 

                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getCommaKeyword_3_2()); 

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
    // $ANTLR end "rule__Transition__Group_3__2__Impl"


    // $ANTLR start "rule__Transition__Group_3__3"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1727:1: rule__Transition__Group_3__3 : rule__Transition__Group_3__3__Impl rule__Transition__Group_3__4 ;
    public final void rule__Transition__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1731:1: ( rule__Transition__Group_3__3__Impl rule__Transition__Group_3__4 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1732:2: rule__Transition__Group_3__3__Impl rule__Transition__Group_3__4
            {
            pushFollow(FOLLOW_rule__Transition__Group_3__3__Impl_in_rule__Transition__Group_3__33442);
            rule__Transition__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group_3__4_in_rule__Transition__Group_3__33445);
            rule__Transition__Group_3__4();

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
    // $ANTLR end "rule__Transition__Group_3__3"


    // $ANTLR start "rule__Transition__Group_3__3__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1739:1: rule__Transition__Group_3__3__Impl : ( ( rule__Transition__Group_3_3__0 )? ) ;
    public final void rule__Transition__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1743:1: ( ( ( rule__Transition__Group_3_3__0 )? ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1744:1: ( ( rule__Transition__Group_3_3__0 )? )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1744:1: ( ( rule__Transition__Group_3_3__0 )? )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1745:1: ( rule__Transition__Group_3_3__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_3_3()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1746:1: ( rule__Transition__Group_3_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1746:2: rule__Transition__Group_3_3__0
                    {
                    pushFollow(FOLLOW_rule__Transition__Group_3_3__0_in_rule__Transition__Group_3__3__Impl3472);
                    rule__Transition__Group_3_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__Transition__Group_3__3__Impl"


    // $ANTLR start "rule__Transition__Group_3__4"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1756:1: rule__Transition__Group_3__4 : rule__Transition__Group_3__4__Impl rule__Transition__Group_3__5 ;
    public final void rule__Transition__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1760:1: ( rule__Transition__Group_3__4__Impl rule__Transition__Group_3__5 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1761:2: rule__Transition__Group_3__4__Impl rule__Transition__Group_3__5
            {
            pushFollow(FOLLOW_rule__Transition__Group_3__4__Impl_in_rule__Transition__Group_3__43503);
            rule__Transition__Group_3__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group_3__5_in_rule__Transition__Group_3__43506);
            rule__Transition__Group_3__5();

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
    // $ANTLR end "rule__Transition__Group_3__4"


    // $ANTLR start "rule__Transition__Group_3__4__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1768:1: rule__Transition__Group_3__4__Impl : ( ( ',' )? ) ;
    public final void rule__Transition__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1772:1: ( ( ( ',' )? ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1773:1: ( ( ',' )? )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1773:1: ( ( ',' )? )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1774:1: ( ',' )?
            {
             before(grammarAccess.getTransitionAccess().getCommaKeyword_3_4()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1775:1: ( ',' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==14) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1776:2: ','
                    {
                    match(input,14,FOLLOW_14_in_rule__Transition__Group_3__4__Impl3535); 

                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getCommaKeyword_3_4()); 

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
    // $ANTLR end "rule__Transition__Group_3__4__Impl"


    // $ANTLR start "rule__Transition__Group_3__5"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1787:1: rule__Transition__Group_3__5 : rule__Transition__Group_3__5__Impl rule__Transition__Group_3__6 ;
    public final void rule__Transition__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1791:1: ( rule__Transition__Group_3__5__Impl rule__Transition__Group_3__6 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1792:2: rule__Transition__Group_3__5__Impl rule__Transition__Group_3__6
            {
            pushFollow(FOLLOW_rule__Transition__Group_3__5__Impl_in_rule__Transition__Group_3__53568);
            rule__Transition__Group_3__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group_3__6_in_rule__Transition__Group_3__53571);
            rule__Transition__Group_3__6();

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
    // $ANTLR end "rule__Transition__Group_3__5"


    // $ANTLR start "rule__Transition__Group_3__5__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1799:1: rule__Transition__Group_3__5__Impl : ( ( rule__Transition__Group_3_5__0 )? ) ;
    public final void rule__Transition__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1803:1: ( ( ( rule__Transition__Group_3_5__0 )? ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1804:1: ( ( rule__Transition__Group_3_5__0 )? )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1804:1: ( ( rule__Transition__Group_3_5__0 )? )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1805:1: ( rule__Transition__Group_3_5__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_3_5()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1806:1: ( rule__Transition__Group_3_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1806:2: rule__Transition__Group_3_5__0
                    {
                    pushFollow(FOLLOW_rule__Transition__Group_3_5__0_in_rule__Transition__Group_3__5__Impl3598);
                    rule__Transition__Group_3_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_3_5()); 

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
    // $ANTLR end "rule__Transition__Group_3__5__Impl"


    // $ANTLR start "rule__Transition__Group_3__6"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1816:1: rule__Transition__Group_3__6 : rule__Transition__Group_3__6__Impl rule__Transition__Group_3__7 ;
    public final void rule__Transition__Group_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1820:1: ( rule__Transition__Group_3__6__Impl rule__Transition__Group_3__7 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1821:2: rule__Transition__Group_3__6__Impl rule__Transition__Group_3__7
            {
            pushFollow(FOLLOW_rule__Transition__Group_3__6__Impl_in_rule__Transition__Group_3__63629);
            rule__Transition__Group_3__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group_3__7_in_rule__Transition__Group_3__63632);
            rule__Transition__Group_3__7();

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
    // $ANTLR end "rule__Transition__Group_3__6"


    // $ANTLR start "rule__Transition__Group_3__6__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1828:1: rule__Transition__Group_3__6__Impl : ( ( ',' )? ) ;
    public final void rule__Transition__Group_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1832:1: ( ( ( ',' )? ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1833:1: ( ( ',' )? )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1833:1: ( ( ',' )? )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1834:1: ( ',' )?
            {
             before(grammarAccess.getTransitionAccess().getCommaKeyword_3_6()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1835:1: ( ',' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==14) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1836:2: ','
                    {
                    match(input,14,FOLLOW_14_in_rule__Transition__Group_3__6__Impl3661); 

                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getCommaKeyword_3_6()); 

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
    // $ANTLR end "rule__Transition__Group_3__6__Impl"


    // $ANTLR start "rule__Transition__Group_3__7"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1847:1: rule__Transition__Group_3__7 : rule__Transition__Group_3__7__Impl rule__Transition__Group_3__8 ;
    public final void rule__Transition__Group_3__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1851:1: ( rule__Transition__Group_3__7__Impl rule__Transition__Group_3__8 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1852:2: rule__Transition__Group_3__7__Impl rule__Transition__Group_3__8
            {
            pushFollow(FOLLOW_rule__Transition__Group_3__7__Impl_in_rule__Transition__Group_3__73694);
            rule__Transition__Group_3__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group_3__8_in_rule__Transition__Group_3__73697);
            rule__Transition__Group_3__8();

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
    // $ANTLR end "rule__Transition__Group_3__7"


    // $ANTLR start "rule__Transition__Group_3__7__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1859:1: rule__Transition__Group_3__7__Impl : ( ( rule__Transition__Group_3_7__0 )? ) ;
    public final void rule__Transition__Group_3__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1863:1: ( ( ( rule__Transition__Group_3_7__0 )? ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1864:1: ( ( rule__Transition__Group_3_7__0 )? )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1864:1: ( ( rule__Transition__Group_3_7__0 )? )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1865:1: ( rule__Transition__Group_3_7__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_3_7()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1866:1: ( rule__Transition__Group_3_7__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==29) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1866:2: rule__Transition__Group_3_7__0
                    {
                    pushFollow(FOLLOW_rule__Transition__Group_3_7__0_in_rule__Transition__Group_3__7__Impl3724);
                    rule__Transition__Group_3_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_3_7()); 

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
    // $ANTLR end "rule__Transition__Group_3__7__Impl"


    // $ANTLR start "rule__Transition__Group_3__8"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1876:1: rule__Transition__Group_3__8 : rule__Transition__Group_3__8__Impl rule__Transition__Group_3__9 ;
    public final void rule__Transition__Group_3__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1880:1: ( rule__Transition__Group_3__8__Impl rule__Transition__Group_3__9 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1881:2: rule__Transition__Group_3__8__Impl rule__Transition__Group_3__9
            {
            pushFollow(FOLLOW_rule__Transition__Group_3__8__Impl_in_rule__Transition__Group_3__83755);
            rule__Transition__Group_3__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group_3__9_in_rule__Transition__Group_3__83758);
            rule__Transition__Group_3__9();

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
    // $ANTLR end "rule__Transition__Group_3__8"


    // $ANTLR start "rule__Transition__Group_3__8__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1888:1: rule__Transition__Group_3__8__Impl : ( ( ',' )? ) ;
    public final void rule__Transition__Group_3__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1892:1: ( ( ( ',' )? ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1893:1: ( ( ',' )? )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1893:1: ( ( ',' )? )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1894:1: ( ',' )?
            {
             before(grammarAccess.getTransitionAccess().getCommaKeyword_3_8()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1895:1: ( ',' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==14) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1896:2: ','
                    {
                    match(input,14,FOLLOW_14_in_rule__Transition__Group_3__8__Impl3787); 

                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getCommaKeyword_3_8()); 

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
    // $ANTLR end "rule__Transition__Group_3__8__Impl"


    // $ANTLR start "rule__Transition__Group_3__9"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1907:1: rule__Transition__Group_3__9 : rule__Transition__Group_3__9__Impl rule__Transition__Group_3__10 ;
    public final void rule__Transition__Group_3__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1911:1: ( rule__Transition__Group_3__9__Impl rule__Transition__Group_3__10 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1912:2: rule__Transition__Group_3__9__Impl rule__Transition__Group_3__10
            {
            pushFollow(FOLLOW_rule__Transition__Group_3__9__Impl_in_rule__Transition__Group_3__93820);
            rule__Transition__Group_3__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group_3__10_in_rule__Transition__Group_3__93823);
            rule__Transition__Group_3__10();

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
    // $ANTLR end "rule__Transition__Group_3__9"


    // $ANTLR start "rule__Transition__Group_3__9__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1919:1: rule__Transition__Group_3__9__Impl : ( ( rule__Transition__Group_3_9__0 )? ) ;
    public final void rule__Transition__Group_3__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1923:1: ( ( ( rule__Transition__Group_3_9__0 )? ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1924:1: ( ( rule__Transition__Group_3_9__0 )? )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1924:1: ( ( rule__Transition__Group_3_9__0 )? )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1925:1: ( rule__Transition__Group_3_9__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_3_9()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1926:1: ( rule__Transition__Group_3_9__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==30) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1926:2: rule__Transition__Group_3_9__0
                    {
                    pushFollow(FOLLOW_rule__Transition__Group_3_9__0_in_rule__Transition__Group_3__9__Impl3850);
                    rule__Transition__Group_3_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_3_9()); 

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
    // $ANTLR end "rule__Transition__Group_3__9__Impl"


    // $ANTLR start "rule__Transition__Group_3__10"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1936:1: rule__Transition__Group_3__10 : rule__Transition__Group_3__10__Impl rule__Transition__Group_3__11 ;
    public final void rule__Transition__Group_3__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1940:1: ( rule__Transition__Group_3__10__Impl rule__Transition__Group_3__11 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1941:2: rule__Transition__Group_3__10__Impl rule__Transition__Group_3__11
            {
            pushFollow(FOLLOW_rule__Transition__Group_3__10__Impl_in_rule__Transition__Group_3__103881);
            rule__Transition__Group_3__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group_3__11_in_rule__Transition__Group_3__103884);
            rule__Transition__Group_3__11();

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
    // $ANTLR end "rule__Transition__Group_3__10"


    // $ANTLR start "rule__Transition__Group_3__10__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1948:1: rule__Transition__Group_3__10__Impl : ( ( ',' )? ) ;
    public final void rule__Transition__Group_3__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1952:1: ( ( ( ',' )? ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1953:1: ( ( ',' )? )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1953:1: ( ( ',' )? )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1954:1: ( ',' )?
            {
             before(grammarAccess.getTransitionAccess().getCommaKeyword_3_10()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1955:1: ( ',' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==14) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1956:2: ','
                    {
                    match(input,14,FOLLOW_14_in_rule__Transition__Group_3__10__Impl3913); 

                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getCommaKeyword_3_10()); 

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
    // $ANTLR end "rule__Transition__Group_3__10__Impl"


    // $ANTLR start "rule__Transition__Group_3__11"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1967:1: rule__Transition__Group_3__11 : rule__Transition__Group_3__11__Impl ;
    public final void rule__Transition__Group_3__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1971:1: ( rule__Transition__Group_3__11__Impl )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1972:2: rule__Transition__Group_3__11__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group_3__11__Impl_in_rule__Transition__Group_3__113946);
            rule__Transition__Group_3__11__Impl();

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
    // $ANTLR end "rule__Transition__Group_3__11"


    // $ANTLR start "rule__Transition__Group_3__11__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1978:1: rule__Transition__Group_3__11__Impl : ( ( rule__Transition__Group_3_11__0 )? ) ;
    public final void rule__Transition__Group_3__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1982:1: ( ( ( rule__Transition__Group_3_11__0 )? ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1983:1: ( ( rule__Transition__Group_3_11__0 )? )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1983:1: ( ( rule__Transition__Group_3_11__0 )? )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1984:1: ( rule__Transition__Group_3_11__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_3_11()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1985:1: ( rule__Transition__Group_3_11__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:1985:2: rule__Transition__Group_3_11__0
                    {
                    pushFollow(FOLLOW_rule__Transition__Group_3_11__0_in_rule__Transition__Group_3__11__Impl3973);
                    rule__Transition__Group_3_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_3_11()); 

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
    // $ANTLR end "rule__Transition__Group_3__11__Impl"


    // $ANTLR start "rule__Transition__Group_3_1__0"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2019:1: rule__Transition__Group_3_1__0 : rule__Transition__Group_3_1__0__Impl rule__Transition__Group_3_1__1 ;
    public final void rule__Transition__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2023:1: ( rule__Transition__Group_3_1__0__Impl rule__Transition__Group_3_1__1 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2024:2: rule__Transition__Group_3_1__0__Impl rule__Transition__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Transition__Group_3_1__0__Impl_in_rule__Transition__Group_3_1__04028);
            rule__Transition__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group_3_1__1_in_rule__Transition__Group_3_1__04031);
            rule__Transition__Group_3_1__1();

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
    // $ANTLR end "rule__Transition__Group_3_1__0"


    // $ANTLR start "rule__Transition__Group_3_1__0__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2031:1: rule__Transition__Group_3_1__0__Impl : ( 'select' ) ;
    public final void rule__Transition__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2035:1: ( ( 'select' ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2036:1: ( 'select' )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2036:1: ( 'select' )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2037:1: 'select'
            {
             before(grammarAccess.getTransitionAccess().getSelectKeyword_3_1_0()); 
            match(input,26,FOLLOW_26_in_rule__Transition__Group_3_1__0__Impl4059); 
             after(grammarAccess.getTransitionAccess().getSelectKeyword_3_1_0()); 

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
    // $ANTLR end "rule__Transition__Group_3_1__0__Impl"


    // $ANTLR start "rule__Transition__Group_3_1__1"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2050:1: rule__Transition__Group_3_1__1 : rule__Transition__Group_3_1__1__Impl rule__Transition__Group_3_1__2 ;
    public final void rule__Transition__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2054:1: ( rule__Transition__Group_3_1__1__Impl rule__Transition__Group_3_1__2 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2055:2: rule__Transition__Group_3_1__1__Impl rule__Transition__Group_3_1__2
            {
            pushFollow(FOLLOW_rule__Transition__Group_3_1__1__Impl_in_rule__Transition__Group_3_1__14090);
            rule__Transition__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group_3_1__2_in_rule__Transition__Group_3_1__14093);
            rule__Transition__Group_3_1__2();

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
    // $ANTLR end "rule__Transition__Group_3_1__1"


    // $ANTLR start "rule__Transition__Group_3_1__1__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2062:1: rule__Transition__Group_3_1__1__Impl : ( ':' ) ;
    public final void rule__Transition__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2066:1: ( ( ':' ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2067:1: ( ':' )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2067:1: ( ':' )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2068:1: ':'
            {
             before(grammarAccess.getTransitionAccess().getColonKeyword_3_1_1()); 
            match(input,24,FOLLOW_24_in_rule__Transition__Group_3_1__1__Impl4121); 
             after(grammarAccess.getTransitionAccess().getColonKeyword_3_1_1()); 

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
    // $ANTLR end "rule__Transition__Group_3_1__1__Impl"


    // $ANTLR start "rule__Transition__Group_3_1__2"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2081:1: rule__Transition__Group_3_1__2 : rule__Transition__Group_3_1__2__Impl ;
    public final void rule__Transition__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2085:1: ( rule__Transition__Group_3_1__2__Impl )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2086:2: rule__Transition__Group_3_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group_3_1__2__Impl_in_rule__Transition__Group_3_1__24152);
            rule__Transition__Group_3_1__2__Impl();

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
    // $ANTLR end "rule__Transition__Group_3_1__2"


    // $ANTLR start "rule__Transition__Group_3_1__2__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2092:1: rule__Transition__Group_3_1__2__Impl : ( ( ( rule__Transition__SelectAssignment_3_1_2 ) ) ( ( rule__Transition__SelectAssignment_3_1_2 )* ) ) ;
    public final void rule__Transition__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2096:1: ( ( ( ( rule__Transition__SelectAssignment_3_1_2 ) ) ( ( rule__Transition__SelectAssignment_3_1_2 )* ) ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2097:1: ( ( ( rule__Transition__SelectAssignment_3_1_2 ) ) ( ( rule__Transition__SelectAssignment_3_1_2 )* ) )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2097:1: ( ( ( rule__Transition__SelectAssignment_3_1_2 ) ) ( ( rule__Transition__SelectAssignment_3_1_2 )* ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2098:1: ( ( rule__Transition__SelectAssignment_3_1_2 ) ) ( ( rule__Transition__SelectAssignment_3_1_2 )* )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2098:1: ( ( rule__Transition__SelectAssignment_3_1_2 ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2099:1: ( rule__Transition__SelectAssignment_3_1_2 )
            {
             before(grammarAccess.getTransitionAccess().getSelectAssignment_3_1_2()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2100:1: ( rule__Transition__SelectAssignment_3_1_2 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2100:2: rule__Transition__SelectAssignment_3_1_2
            {
            pushFollow(FOLLOW_rule__Transition__SelectAssignment_3_1_2_in_rule__Transition__Group_3_1__2__Impl4181);
            rule__Transition__SelectAssignment_3_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getSelectAssignment_3_1_2()); 

            }

            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2103:1: ( ( rule__Transition__SelectAssignment_3_1_2 )* )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2104:1: ( rule__Transition__SelectAssignment_3_1_2 )*
            {
             before(grammarAccess.getTransitionAccess().getSelectAssignment_3_1_2()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2105:1: ( rule__Transition__SelectAssignment_3_1_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=RULE_ANY_OTHER && LA29_0<=RULE_INT)||LA29_0==14) ) {
                    alt29=1;
                }
                else if ( (LA29_0==13) ) {
                    int LA29_3 = input.LA(2);

                    if ( (LA29_3==RULE_ANY_OTHER||LA29_3==RULE_INT||(LA29_3>=13 && LA29_3<=14)||(LA29_3>=27 && LA29_3<=31)) ) {
                        alt29=1;
                    }
                    else if ( (LA29_3==RULE_ID) ) {
                        int LA29_4 = input.LA(3);

                        if ( ((LA29_4>=RULE_ANY_OTHER && LA29_4<=RULE_INT)||(LA29_4>=13 && LA29_4<=14)||(LA29_4>=27 && LA29_4<=31)) ) {
                            alt29=1;
                        }


                    }


                }


                switch (alt29) {
            	case 1 :
            	    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2105:2: rule__Transition__SelectAssignment_3_1_2
            	    {
            	    pushFollow(FOLLOW_rule__Transition__SelectAssignment_3_1_2_in_rule__Transition__Group_3_1__2__Impl4193);
            	    rule__Transition__SelectAssignment_3_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getSelectAssignment_3_1_2()); 

            }


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
    // $ANTLR end "rule__Transition__Group_3_1__2__Impl"


    // $ANTLR start "rule__Transition__Group_3_3__0"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2122:1: rule__Transition__Group_3_3__0 : rule__Transition__Group_3_3__0__Impl rule__Transition__Group_3_3__1 ;
    public final void rule__Transition__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2126:1: ( rule__Transition__Group_3_3__0__Impl rule__Transition__Group_3_3__1 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2127:2: rule__Transition__Group_3_3__0__Impl rule__Transition__Group_3_3__1
            {
            pushFollow(FOLLOW_rule__Transition__Group_3_3__0__Impl_in_rule__Transition__Group_3_3__04232);
            rule__Transition__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group_3_3__1_in_rule__Transition__Group_3_3__04235);
            rule__Transition__Group_3_3__1();

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
    // $ANTLR end "rule__Transition__Group_3_3__0"


    // $ANTLR start "rule__Transition__Group_3_3__0__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2134:1: rule__Transition__Group_3_3__0__Impl : ( 'guard' ) ;
    public final void rule__Transition__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2138:1: ( ( 'guard' ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2139:1: ( 'guard' )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2139:1: ( 'guard' )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2140:1: 'guard'
            {
             before(grammarAccess.getTransitionAccess().getGuardKeyword_3_3_0()); 
            match(input,27,FOLLOW_27_in_rule__Transition__Group_3_3__0__Impl4263); 
             after(grammarAccess.getTransitionAccess().getGuardKeyword_3_3_0()); 

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
    // $ANTLR end "rule__Transition__Group_3_3__0__Impl"


    // $ANTLR start "rule__Transition__Group_3_3__1"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2153:1: rule__Transition__Group_3_3__1 : rule__Transition__Group_3_3__1__Impl rule__Transition__Group_3_3__2 ;
    public final void rule__Transition__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2157:1: ( rule__Transition__Group_3_3__1__Impl rule__Transition__Group_3_3__2 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2158:2: rule__Transition__Group_3_3__1__Impl rule__Transition__Group_3_3__2
            {
            pushFollow(FOLLOW_rule__Transition__Group_3_3__1__Impl_in_rule__Transition__Group_3_3__14294);
            rule__Transition__Group_3_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group_3_3__2_in_rule__Transition__Group_3_3__14297);
            rule__Transition__Group_3_3__2();

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
    // $ANTLR end "rule__Transition__Group_3_3__1"


    // $ANTLR start "rule__Transition__Group_3_3__1__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2165:1: rule__Transition__Group_3_3__1__Impl : ( ':' ) ;
    public final void rule__Transition__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2169:1: ( ( ':' ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2170:1: ( ':' )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2170:1: ( ':' )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2171:1: ':'
            {
             before(grammarAccess.getTransitionAccess().getColonKeyword_3_3_1()); 
            match(input,24,FOLLOW_24_in_rule__Transition__Group_3_3__1__Impl4325); 
             after(grammarAccess.getTransitionAccess().getColonKeyword_3_3_1()); 

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
    // $ANTLR end "rule__Transition__Group_3_3__1__Impl"


    // $ANTLR start "rule__Transition__Group_3_3__2"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2184:1: rule__Transition__Group_3_3__2 : rule__Transition__Group_3_3__2__Impl ;
    public final void rule__Transition__Group_3_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2188:1: ( rule__Transition__Group_3_3__2__Impl )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2189:2: rule__Transition__Group_3_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group_3_3__2__Impl_in_rule__Transition__Group_3_3__24356);
            rule__Transition__Group_3_3__2__Impl();

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
    // $ANTLR end "rule__Transition__Group_3_3__2"


    // $ANTLR start "rule__Transition__Group_3_3__2__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2195:1: rule__Transition__Group_3_3__2__Impl : ( ( ( rule__Transition__GuardAssignment_3_3_2 ) ) ( ( rule__Transition__GuardAssignment_3_3_2 )* ) ) ;
    public final void rule__Transition__Group_3_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2199:1: ( ( ( ( rule__Transition__GuardAssignment_3_3_2 ) ) ( ( rule__Transition__GuardAssignment_3_3_2 )* ) ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2200:1: ( ( ( rule__Transition__GuardAssignment_3_3_2 ) ) ( ( rule__Transition__GuardAssignment_3_3_2 )* ) )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2200:1: ( ( ( rule__Transition__GuardAssignment_3_3_2 ) ) ( ( rule__Transition__GuardAssignment_3_3_2 )* ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2201:1: ( ( rule__Transition__GuardAssignment_3_3_2 ) ) ( ( rule__Transition__GuardAssignment_3_3_2 )* )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2201:1: ( ( rule__Transition__GuardAssignment_3_3_2 ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2202:1: ( rule__Transition__GuardAssignment_3_3_2 )
            {
             before(grammarAccess.getTransitionAccess().getGuardAssignment_3_3_2()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2203:1: ( rule__Transition__GuardAssignment_3_3_2 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2203:2: rule__Transition__GuardAssignment_3_3_2
            {
            pushFollow(FOLLOW_rule__Transition__GuardAssignment_3_3_2_in_rule__Transition__Group_3_3__2__Impl4385);
            rule__Transition__GuardAssignment_3_3_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGuardAssignment_3_3_2()); 

            }

            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2206:1: ( ( rule__Transition__GuardAssignment_3_3_2 )* )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2207:1: ( rule__Transition__GuardAssignment_3_3_2 )*
            {
             before(grammarAccess.getTransitionAccess().getGuardAssignment_3_3_2()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2208:1: ( rule__Transition__GuardAssignment_3_3_2 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=RULE_ANY_OTHER && LA30_0<=RULE_INT)||LA30_0==14) ) {
                    alt30=1;
                }
                else if ( (LA30_0==13) ) {
                    int LA30_3 = input.LA(2);

                    if ( (LA30_3==RULE_ID) ) {
                        int LA30_4 = input.LA(3);

                        if ( ((LA30_4>=RULE_ANY_OTHER && LA30_4<=RULE_INT)||(LA30_4>=13 && LA30_4<=14)||(LA30_4>=28 && LA30_4<=31)) ) {
                            alt30=1;
                        }


                    }
                    else if ( (LA30_3==RULE_ANY_OTHER||LA30_3==RULE_INT||(LA30_3>=13 && LA30_3<=14)||(LA30_3>=28 && LA30_3<=31)) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2208:2: rule__Transition__GuardAssignment_3_3_2
            	    {
            	    pushFollow(FOLLOW_rule__Transition__GuardAssignment_3_3_2_in_rule__Transition__Group_3_3__2__Impl4397);
            	    rule__Transition__GuardAssignment_3_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getGuardAssignment_3_3_2()); 

            }


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
    // $ANTLR end "rule__Transition__Group_3_3__2__Impl"


    // $ANTLR start "rule__Transition__Group_3_5__0"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2225:1: rule__Transition__Group_3_5__0 : rule__Transition__Group_3_5__0__Impl rule__Transition__Group_3_5__1 ;
    public final void rule__Transition__Group_3_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2229:1: ( rule__Transition__Group_3_5__0__Impl rule__Transition__Group_3_5__1 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2230:2: rule__Transition__Group_3_5__0__Impl rule__Transition__Group_3_5__1
            {
            pushFollow(FOLLOW_rule__Transition__Group_3_5__0__Impl_in_rule__Transition__Group_3_5__04436);
            rule__Transition__Group_3_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group_3_5__1_in_rule__Transition__Group_3_5__04439);
            rule__Transition__Group_3_5__1();

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
    // $ANTLR end "rule__Transition__Group_3_5__0"


    // $ANTLR start "rule__Transition__Group_3_5__0__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2237:1: rule__Transition__Group_3_5__0__Impl : ( 'sync' ) ;
    public final void rule__Transition__Group_3_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2241:1: ( ( 'sync' ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2242:1: ( 'sync' )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2242:1: ( 'sync' )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2243:1: 'sync'
            {
             before(grammarAccess.getTransitionAccess().getSyncKeyword_3_5_0()); 
            match(input,28,FOLLOW_28_in_rule__Transition__Group_3_5__0__Impl4467); 
             after(grammarAccess.getTransitionAccess().getSyncKeyword_3_5_0()); 

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
    // $ANTLR end "rule__Transition__Group_3_5__0__Impl"


    // $ANTLR start "rule__Transition__Group_3_5__1"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2256:1: rule__Transition__Group_3_5__1 : rule__Transition__Group_3_5__1__Impl rule__Transition__Group_3_5__2 ;
    public final void rule__Transition__Group_3_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2260:1: ( rule__Transition__Group_3_5__1__Impl rule__Transition__Group_3_5__2 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2261:2: rule__Transition__Group_3_5__1__Impl rule__Transition__Group_3_5__2
            {
            pushFollow(FOLLOW_rule__Transition__Group_3_5__1__Impl_in_rule__Transition__Group_3_5__14498);
            rule__Transition__Group_3_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group_3_5__2_in_rule__Transition__Group_3_5__14501);
            rule__Transition__Group_3_5__2();

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
    // $ANTLR end "rule__Transition__Group_3_5__1"


    // $ANTLR start "rule__Transition__Group_3_5__1__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2268:1: rule__Transition__Group_3_5__1__Impl : ( ':' ) ;
    public final void rule__Transition__Group_3_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2272:1: ( ( ':' ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2273:1: ( ':' )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2273:1: ( ':' )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2274:1: ':'
            {
             before(grammarAccess.getTransitionAccess().getColonKeyword_3_5_1()); 
            match(input,24,FOLLOW_24_in_rule__Transition__Group_3_5__1__Impl4529); 
             after(grammarAccess.getTransitionAccess().getColonKeyword_3_5_1()); 

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
    // $ANTLR end "rule__Transition__Group_3_5__1__Impl"


    // $ANTLR start "rule__Transition__Group_3_5__2"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2287:1: rule__Transition__Group_3_5__2 : rule__Transition__Group_3_5__2__Impl ;
    public final void rule__Transition__Group_3_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2291:1: ( rule__Transition__Group_3_5__2__Impl )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2292:2: rule__Transition__Group_3_5__2__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group_3_5__2__Impl_in_rule__Transition__Group_3_5__24560);
            rule__Transition__Group_3_5__2__Impl();

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
    // $ANTLR end "rule__Transition__Group_3_5__2"


    // $ANTLR start "rule__Transition__Group_3_5__2__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2298:1: rule__Transition__Group_3_5__2__Impl : ( ( ( rule__Transition__SyncAssignment_3_5_2 ) ) ( ( rule__Transition__SyncAssignment_3_5_2 )* ) ) ;
    public final void rule__Transition__Group_3_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2302:1: ( ( ( ( rule__Transition__SyncAssignment_3_5_2 ) ) ( ( rule__Transition__SyncAssignment_3_5_2 )* ) ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2303:1: ( ( ( rule__Transition__SyncAssignment_3_5_2 ) ) ( ( rule__Transition__SyncAssignment_3_5_2 )* ) )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2303:1: ( ( ( rule__Transition__SyncAssignment_3_5_2 ) ) ( ( rule__Transition__SyncAssignment_3_5_2 )* ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2304:1: ( ( rule__Transition__SyncAssignment_3_5_2 ) ) ( ( rule__Transition__SyncAssignment_3_5_2 )* )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2304:1: ( ( rule__Transition__SyncAssignment_3_5_2 ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2305:1: ( rule__Transition__SyncAssignment_3_5_2 )
            {
             before(grammarAccess.getTransitionAccess().getSyncAssignment_3_5_2()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2306:1: ( rule__Transition__SyncAssignment_3_5_2 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2306:2: rule__Transition__SyncAssignment_3_5_2
            {
            pushFollow(FOLLOW_rule__Transition__SyncAssignment_3_5_2_in_rule__Transition__Group_3_5__2__Impl4589);
            rule__Transition__SyncAssignment_3_5_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getSyncAssignment_3_5_2()); 

            }

            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2309:1: ( ( rule__Transition__SyncAssignment_3_5_2 )* )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2310:1: ( rule__Transition__SyncAssignment_3_5_2 )*
            {
             before(grammarAccess.getTransitionAccess().getSyncAssignment_3_5_2()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2311:1: ( rule__Transition__SyncAssignment_3_5_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=RULE_ANY_OTHER && LA31_0<=RULE_INT)||LA31_0==14) ) {
                    alt31=1;
                }
                else if ( (LA31_0==13) ) {
                    int LA31_3 = input.LA(2);

                    if ( (LA31_3==RULE_ID) ) {
                        int LA31_4 = input.LA(3);

                        if ( ((LA31_4>=RULE_ANY_OTHER && LA31_4<=RULE_INT)||(LA31_4>=13 && LA31_4<=14)||(LA31_4>=29 && LA31_4<=31)) ) {
                            alt31=1;
                        }


                    }
                    else if ( (LA31_3==RULE_ANY_OTHER||LA31_3==RULE_INT||(LA31_3>=13 && LA31_3<=14)||(LA31_3>=29 && LA31_3<=31)) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2311:2: rule__Transition__SyncAssignment_3_5_2
            	    {
            	    pushFollow(FOLLOW_rule__Transition__SyncAssignment_3_5_2_in_rule__Transition__Group_3_5__2__Impl4601);
            	    rule__Transition__SyncAssignment_3_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getSyncAssignment_3_5_2()); 

            }


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
    // $ANTLR end "rule__Transition__Group_3_5__2__Impl"


    // $ANTLR start "rule__Transition__Group_3_7__0"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2328:1: rule__Transition__Group_3_7__0 : rule__Transition__Group_3_7__0__Impl rule__Transition__Group_3_7__1 ;
    public final void rule__Transition__Group_3_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2332:1: ( rule__Transition__Group_3_7__0__Impl rule__Transition__Group_3_7__1 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2333:2: rule__Transition__Group_3_7__0__Impl rule__Transition__Group_3_7__1
            {
            pushFollow(FOLLOW_rule__Transition__Group_3_7__0__Impl_in_rule__Transition__Group_3_7__04640);
            rule__Transition__Group_3_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group_3_7__1_in_rule__Transition__Group_3_7__04643);
            rule__Transition__Group_3_7__1();

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
    // $ANTLR end "rule__Transition__Group_3_7__0"


    // $ANTLR start "rule__Transition__Group_3_7__0__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2340:1: rule__Transition__Group_3_7__0__Impl : ( 'assign' ) ;
    public final void rule__Transition__Group_3_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2344:1: ( ( 'assign' ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2345:1: ( 'assign' )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2345:1: ( 'assign' )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2346:1: 'assign'
            {
             before(grammarAccess.getTransitionAccess().getAssignKeyword_3_7_0()); 
            match(input,29,FOLLOW_29_in_rule__Transition__Group_3_7__0__Impl4671); 
             after(grammarAccess.getTransitionAccess().getAssignKeyword_3_7_0()); 

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
    // $ANTLR end "rule__Transition__Group_3_7__0__Impl"


    // $ANTLR start "rule__Transition__Group_3_7__1"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2359:1: rule__Transition__Group_3_7__1 : rule__Transition__Group_3_7__1__Impl rule__Transition__Group_3_7__2 ;
    public final void rule__Transition__Group_3_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2363:1: ( rule__Transition__Group_3_7__1__Impl rule__Transition__Group_3_7__2 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2364:2: rule__Transition__Group_3_7__1__Impl rule__Transition__Group_3_7__2
            {
            pushFollow(FOLLOW_rule__Transition__Group_3_7__1__Impl_in_rule__Transition__Group_3_7__14702);
            rule__Transition__Group_3_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group_3_7__2_in_rule__Transition__Group_3_7__14705);
            rule__Transition__Group_3_7__2();

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
    // $ANTLR end "rule__Transition__Group_3_7__1"


    // $ANTLR start "rule__Transition__Group_3_7__1__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2371:1: rule__Transition__Group_3_7__1__Impl : ( ':' ) ;
    public final void rule__Transition__Group_3_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2375:1: ( ( ':' ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2376:1: ( ':' )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2376:1: ( ':' )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2377:1: ':'
            {
             before(grammarAccess.getTransitionAccess().getColonKeyword_3_7_1()); 
            match(input,24,FOLLOW_24_in_rule__Transition__Group_3_7__1__Impl4733); 
             after(grammarAccess.getTransitionAccess().getColonKeyword_3_7_1()); 

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
    // $ANTLR end "rule__Transition__Group_3_7__1__Impl"


    // $ANTLR start "rule__Transition__Group_3_7__2"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2390:1: rule__Transition__Group_3_7__2 : rule__Transition__Group_3_7__2__Impl ;
    public final void rule__Transition__Group_3_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2394:1: ( rule__Transition__Group_3_7__2__Impl )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2395:2: rule__Transition__Group_3_7__2__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group_3_7__2__Impl_in_rule__Transition__Group_3_7__24764);
            rule__Transition__Group_3_7__2__Impl();

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
    // $ANTLR end "rule__Transition__Group_3_7__2"


    // $ANTLR start "rule__Transition__Group_3_7__2__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2401:1: rule__Transition__Group_3_7__2__Impl : ( ( ( rule__Transition__AssignAssignment_3_7_2 ) ) ( ( rule__Transition__AssignAssignment_3_7_2 )* ) ) ;
    public final void rule__Transition__Group_3_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2405:1: ( ( ( ( rule__Transition__AssignAssignment_3_7_2 ) ) ( ( rule__Transition__AssignAssignment_3_7_2 )* ) ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2406:1: ( ( ( rule__Transition__AssignAssignment_3_7_2 ) ) ( ( rule__Transition__AssignAssignment_3_7_2 )* ) )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2406:1: ( ( ( rule__Transition__AssignAssignment_3_7_2 ) ) ( ( rule__Transition__AssignAssignment_3_7_2 )* ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2407:1: ( ( rule__Transition__AssignAssignment_3_7_2 ) ) ( ( rule__Transition__AssignAssignment_3_7_2 )* )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2407:1: ( ( rule__Transition__AssignAssignment_3_7_2 ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2408:1: ( rule__Transition__AssignAssignment_3_7_2 )
            {
             before(grammarAccess.getTransitionAccess().getAssignAssignment_3_7_2()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2409:1: ( rule__Transition__AssignAssignment_3_7_2 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2409:2: rule__Transition__AssignAssignment_3_7_2
            {
            pushFollow(FOLLOW_rule__Transition__AssignAssignment_3_7_2_in_rule__Transition__Group_3_7__2__Impl4793);
            rule__Transition__AssignAssignment_3_7_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getAssignAssignment_3_7_2()); 

            }

            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2412:1: ( ( rule__Transition__AssignAssignment_3_7_2 )* )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2413:1: ( rule__Transition__AssignAssignment_3_7_2 )*
            {
             before(grammarAccess.getTransitionAccess().getAssignAssignment_3_7_2()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2414:1: ( rule__Transition__AssignAssignment_3_7_2 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=RULE_ANY_OTHER && LA32_0<=RULE_INT)||LA32_0==14) ) {
                    alt32=1;
                }
                else if ( (LA32_0==13) ) {
                    int LA32_3 = input.LA(2);

                    if ( (LA32_3==RULE_ID) ) {
                        int LA32_4 = input.LA(3);

                        if ( ((LA32_4>=RULE_ANY_OTHER && LA32_4<=RULE_INT)||(LA32_4>=13 && LA32_4<=14)||(LA32_4>=30 && LA32_4<=31)) ) {
                            alt32=1;
                        }


                    }
                    else if ( (LA32_3==RULE_ANY_OTHER||LA32_3==RULE_INT||(LA32_3>=13 && LA32_3<=14)||(LA32_3>=30 && LA32_3<=31)) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2414:2: rule__Transition__AssignAssignment_3_7_2
            	    {
            	    pushFollow(FOLLOW_rule__Transition__AssignAssignment_3_7_2_in_rule__Transition__Group_3_7__2__Impl4805);
            	    rule__Transition__AssignAssignment_3_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getAssignAssignment_3_7_2()); 

            }


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
    // $ANTLR end "rule__Transition__Group_3_7__2__Impl"


    // $ANTLR start "rule__Transition__Group_3_9__0"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2431:1: rule__Transition__Group_3_9__0 : rule__Transition__Group_3_9__0__Impl rule__Transition__Group_3_9__1 ;
    public final void rule__Transition__Group_3_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2435:1: ( rule__Transition__Group_3_9__0__Impl rule__Transition__Group_3_9__1 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2436:2: rule__Transition__Group_3_9__0__Impl rule__Transition__Group_3_9__1
            {
            pushFollow(FOLLOW_rule__Transition__Group_3_9__0__Impl_in_rule__Transition__Group_3_9__04844);
            rule__Transition__Group_3_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group_3_9__1_in_rule__Transition__Group_3_9__04847);
            rule__Transition__Group_3_9__1();

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
    // $ANTLR end "rule__Transition__Group_3_9__0"


    // $ANTLR start "rule__Transition__Group_3_9__0__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2443:1: rule__Transition__Group_3_9__0__Impl : ( 'probability' ) ;
    public final void rule__Transition__Group_3_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2447:1: ( ( 'probability' ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2448:1: ( 'probability' )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2448:1: ( 'probability' )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2449:1: 'probability'
            {
             before(grammarAccess.getTransitionAccess().getProbabilityKeyword_3_9_0()); 
            match(input,30,FOLLOW_30_in_rule__Transition__Group_3_9__0__Impl4875); 
             after(grammarAccess.getTransitionAccess().getProbabilityKeyword_3_9_0()); 

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
    // $ANTLR end "rule__Transition__Group_3_9__0__Impl"


    // $ANTLR start "rule__Transition__Group_3_9__1"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2462:1: rule__Transition__Group_3_9__1 : rule__Transition__Group_3_9__1__Impl rule__Transition__Group_3_9__2 ;
    public final void rule__Transition__Group_3_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2466:1: ( rule__Transition__Group_3_9__1__Impl rule__Transition__Group_3_9__2 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2467:2: rule__Transition__Group_3_9__1__Impl rule__Transition__Group_3_9__2
            {
            pushFollow(FOLLOW_rule__Transition__Group_3_9__1__Impl_in_rule__Transition__Group_3_9__14906);
            rule__Transition__Group_3_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group_3_9__2_in_rule__Transition__Group_3_9__14909);
            rule__Transition__Group_3_9__2();

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
    // $ANTLR end "rule__Transition__Group_3_9__1"


    // $ANTLR start "rule__Transition__Group_3_9__1__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2474:1: rule__Transition__Group_3_9__1__Impl : ( ':' ) ;
    public final void rule__Transition__Group_3_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2478:1: ( ( ':' ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2479:1: ( ':' )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2479:1: ( ':' )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2480:1: ':'
            {
             before(grammarAccess.getTransitionAccess().getColonKeyword_3_9_1()); 
            match(input,24,FOLLOW_24_in_rule__Transition__Group_3_9__1__Impl4937); 
             after(grammarAccess.getTransitionAccess().getColonKeyword_3_9_1()); 

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
    // $ANTLR end "rule__Transition__Group_3_9__1__Impl"


    // $ANTLR start "rule__Transition__Group_3_9__2"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2493:1: rule__Transition__Group_3_9__2 : rule__Transition__Group_3_9__2__Impl ;
    public final void rule__Transition__Group_3_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2497:1: ( rule__Transition__Group_3_9__2__Impl )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2498:2: rule__Transition__Group_3_9__2__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group_3_9__2__Impl_in_rule__Transition__Group_3_9__24968);
            rule__Transition__Group_3_9__2__Impl();

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
    // $ANTLR end "rule__Transition__Group_3_9__2"


    // $ANTLR start "rule__Transition__Group_3_9__2__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2504:1: rule__Transition__Group_3_9__2__Impl : ( ( ( rule__Transition__ProbabilityAssignment_3_9_2 ) ) ( ( rule__Transition__ProbabilityAssignment_3_9_2 )* ) ) ;
    public final void rule__Transition__Group_3_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2508:1: ( ( ( ( rule__Transition__ProbabilityAssignment_3_9_2 ) ) ( ( rule__Transition__ProbabilityAssignment_3_9_2 )* ) ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2509:1: ( ( ( rule__Transition__ProbabilityAssignment_3_9_2 ) ) ( ( rule__Transition__ProbabilityAssignment_3_9_2 )* ) )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2509:1: ( ( ( rule__Transition__ProbabilityAssignment_3_9_2 ) ) ( ( rule__Transition__ProbabilityAssignment_3_9_2 )* ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2510:1: ( ( rule__Transition__ProbabilityAssignment_3_9_2 ) ) ( ( rule__Transition__ProbabilityAssignment_3_9_2 )* )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2510:1: ( ( rule__Transition__ProbabilityAssignment_3_9_2 ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2511:1: ( rule__Transition__ProbabilityAssignment_3_9_2 )
            {
             before(grammarAccess.getTransitionAccess().getProbabilityAssignment_3_9_2()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2512:1: ( rule__Transition__ProbabilityAssignment_3_9_2 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2512:2: rule__Transition__ProbabilityAssignment_3_9_2
            {
            pushFollow(FOLLOW_rule__Transition__ProbabilityAssignment_3_9_2_in_rule__Transition__Group_3_9__2__Impl4997);
            rule__Transition__ProbabilityAssignment_3_9_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getProbabilityAssignment_3_9_2()); 

            }

            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2515:1: ( ( rule__Transition__ProbabilityAssignment_3_9_2 )* )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2516:1: ( rule__Transition__ProbabilityAssignment_3_9_2 )*
            {
             before(grammarAccess.getTransitionAccess().getProbabilityAssignment_3_9_2()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2517:1: ( rule__Transition__ProbabilityAssignment_3_9_2 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=RULE_ANY_OTHER && LA33_0<=RULE_INT)||LA33_0==14) ) {
                    alt33=1;
                }
                else if ( (LA33_0==13) ) {
                    int LA33_3 = input.LA(2);

                    if ( (LA33_3==RULE_ANY_OTHER||LA33_3==RULE_INT||(LA33_3>=13 && LA33_3<=14)||LA33_3==31) ) {
                        alt33=1;
                    }
                    else if ( (LA33_3==RULE_ID) ) {
                        int LA33_4 = input.LA(3);

                        if ( ((LA33_4>=RULE_ANY_OTHER && LA33_4<=RULE_INT)||(LA33_4>=13 && LA33_4<=14)||LA33_4==31) ) {
                            alt33=1;
                        }


                    }


                }


                switch (alt33) {
            	case 1 :
            	    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2517:2: rule__Transition__ProbabilityAssignment_3_9_2
            	    {
            	    pushFollow(FOLLOW_rule__Transition__ProbabilityAssignment_3_9_2_in_rule__Transition__Group_3_9__2__Impl5009);
            	    rule__Transition__ProbabilityAssignment_3_9_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getProbabilityAssignment_3_9_2()); 

            }


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
    // $ANTLR end "rule__Transition__Group_3_9__2__Impl"


    // $ANTLR start "rule__Transition__Group_3_11__0"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2534:1: rule__Transition__Group_3_11__0 : rule__Transition__Group_3_11__0__Impl rule__Transition__Group_3_11__1 ;
    public final void rule__Transition__Group_3_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2538:1: ( rule__Transition__Group_3_11__0__Impl rule__Transition__Group_3_11__1 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2539:2: rule__Transition__Group_3_11__0__Impl rule__Transition__Group_3_11__1
            {
            pushFollow(FOLLOW_rule__Transition__Group_3_11__0__Impl_in_rule__Transition__Group_3_11__05048);
            rule__Transition__Group_3_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group_3_11__1_in_rule__Transition__Group_3_11__05051);
            rule__Transition__Group_3_11__1();

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
    // $ANTLR end "rule__Transition__Group_3_11__0"


    // $ANTLR start "rule__Transition__Group_3_11__0__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2546:1: rule__Transition__Group_3_11__0__Impl : ( 'comments' ) ;
    public final void rule__Transition__Group_3_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2550:1: ( ( 'comments' ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2551:1: ( 'comments' )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2551:1: ( 'comments' )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2552:1: 'comments'
            {
             before(grammarAccess.getTransitionAccess().getCommentsKeyword_3_11_0()); 
            match(input,31,FOLLOW_31_in_rule__Transition__Group_3_11__0__Impl5079); 
             after(grammarAccess.getTransitionAccess().getCommentsKeyword_3_11_0()); 

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
    // $ANTLR end "rule__Transition__Group_3_11__0__Impl"


    // $ANTLR start "rule__Transition__Group_3_11__1"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2565:1: rule__Transition__Group_3_11__1 : rule__Transition__Group_3_11__1__Impl rule__Transition__Group_3_11__2 ;
    public final void rule__Transition__Group_3_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2569:1: ( rule__Transition__Group_3_11__1__Impl rule__Transition__Group_3_11__2 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2570:2: rule__Transition__Group_3_11__1__Impl rule__Transition__Group_3_11__2
            {
            pushFollow(FOLLOW_rule__Transition__Group_3_11__1__Impl_in_rule__Transition__Group_3_11__15110);
            rule__Transition__Group_3_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group_3_11__2_in_rule__Transition__Group_3_11__15113);
            rule__Transition__Group_3_11__2();

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
    // $ANTLR end "rule__Transition__Group_3_11__1"


    // $ANTLR start "rule__Transition__Group_3_11__1__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2577:1: rule__Transition__Group_3_11__1__Impl : ( ':' ) ;
    public final void rule__Transition__Group_3_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2581:1: ( ( ':' ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2582:1: ( ':' )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2582:1: ( ':' )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2583:1: ':'
            {
             before(grammarAccess.getTransitionAccess().getColonKeyword_3_11_1()); 
            match(input,24,FOLLOW_24_in_rule__Transition__Group_3_11__1__Impl5141); 
             after(grammarAccess.getTransitionAccess().getColonKeyword_3_11_1()); 

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
    // $ANTLR end "rule__Transition__Group_3_11__1__Impl"


    // $ANTLR start "rule__Transition__Group_3_11__2"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2596:1: rule__Transition__Group_3_11__2 : rule__Transition__Group_3_11__2__Impl ;
    public final void rule__Transition__Group_3_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2600:1: ( rule__Transition__Group_3_11__2__Impl )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2601:2: rule__Transition__Group_3_11__2__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group_3_11__2__Impl_in_rule__Transition__Group_3_11__25172);
            rule__Transition__Group_3_11__2__Impl();

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
    // $ANTLR end "rule__Transition__Group_3_11__2"


    // $ANTLR start "rule__Transition__Group_3_11__2__Impl"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2607:1: rule__Transition__Group_3_11__2__Impl : ( ( ( rule__Transition__CommentsAssignment_3_11_2 ) ) ( ( rule__Transition__CommentsAssignment_3_11_2 )* ) ) ;
    public final void rule__Transition__Group_3_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2611:1: ( ( ( ( rule__Transition__CommentsAssignment_3_11_2 ) ) ( ( rule__Transition__CommentsAssignment_3_11_2 )* ) ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2612:1: ( ( ( rule__Transition__CommentsAssignment_3_11_2 ) ) ( ( rule__Transition__CommentsAssignment_3_11_2 )* ) )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2612:1: ( ( ( rule__Transition__CommentsAssignment_3_11_2 ) ) ( ( rule__Transition__CommentsAssignment_3_11_2 )* ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2613:1: ( ( rule__Transition__CommentsAssignment_3_11_2 ) ) ( ( rule__Transition__CommentsAssignment_3_11_2 )* )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2613:1: ( ( rule__Transition__CommentsAssignment_3_11_2 ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2614:1: ( rule__Transition__CommentsAssignment_3_11_2 )
            {
             before(grammarAccess.getTransitionAccess().getCommentsAssignment_3_11_2()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2615:1: ( rule__Transition__CommentsAssignment_3_11_2 )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2615:2: rule__Transition__CommentsAssignment_3_11_2
            {
            pushFollow(FOLLOW_rule__Transition__CommentsAssignment_3_11_2_in_rule__Transition__Group_3_11__2__Impl5201);
            rule__Transition__CommentsAssignment_3_11_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getCommentsAssignment_3_11_2()); 

            }

            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2618:1: ( ( rule__Transition__CommentsAssignment_3_11_2 )* )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2619:1: ( rule__Transition__CommentsAssignment_3_11_2 )*
            {
             before(grammarAccess.getTransitionAccess().getCommentsAssignment_3_11_2()); 
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2620:1: ( rule__Transition__CommentsAssignment_3_11_2 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==13) ) {
                    int LA34_1 = input.LA(2);

                    if ( (LA34_1==RULE_ID) ) {
                        int LA34_4 = input.LA(3);

                        if ( ((LA34_4>=RULE_ANY_OTHER && LA34_4<=RULE_INT)||(LA34_4>=13 && LA34_4<=14)) ) {
                            alt34=1;
                        }


                    }
                    else if ( (LA34_1==RULE_ANY_OTHER||LA34_1==RULE_INT||(LA34_1>=13 && LA34_1<=14)) ) {
                        alt34=1;
                    }


                }
                else if ( ((LA34_0>=RULE_ANY_OTHER && LA34_0<=RULE_INT)||LA34_0==14) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2620:2: rule__Transition__CommentsAssignment_3_11_2
            	    {
            	    pushFollow(FOLLOW_rule__Transition__CommentsAssignment_3_11_2_in_rule__Transition__Group_3_11__2__Impl5213);
            	    rule__Transition__CommentsAssignment_3_11_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getCommentsAssignment_3_11_2()); 

            }


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
    // $ANTLR end "rule__Transition__Group_3_11__2__Impl"


    // $ANTLR start "rule__Document__DeclarationAssignment_0"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2638:1: rule__Document__DeclarationAssignment_0 : ( ruleDeclaration ) ;
    public final void rule__Document__DeclarationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2642:1: ( ( ruleDeclaration ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2643:1: ( ruleDeclaration )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2643:1: ( ruleDeclaration )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2644:1: ruleDeclaration
            {
             before(grammarAccess.getDocumentAccess().getDeclarationDeclarationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDeclaration_in_rule__Document__DeclarationAssignment_05257);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDocumentAccess().getDeclarationDeclarationParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Document__DeclarationAssignment_0"


    // $ANTLR start "rule__Document__TemplateAssignment_1"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2653:1: rule__Document__TemplateAssignment_1 : ( ruleTemplate ) ;
    public final void rule__Document__TemplateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2657:1: ( ( ruleTemplate ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2658:1: ( ruleTemplate )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2658:1: ( ruleTemplate )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2659:1: ruleTemplate
            {
             before(grammarAccess.getDocumentAccess().getTemplateTemplateParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTemplate_in_rule__Document__TemplateAssignment_15288);
            ruleTemplate();

            state._fsp--;

             after(grammarAccess.getDocumentAccess().getTemplateTemplateParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Document__TemplateAssignment_1"


    // $ANTLR start "rule__Document__SystemAssignment_2"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2668:1: rule__Document__SystemAssignment_2 : ( ruleSystem ) ;
    public final void rule__Document__SystemAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2672:1: ( ( ruleSystem ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2673:1: ( ruleSystem )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2673:1: ( ruleSystem )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2674:1: ruleSystem
            {
             before(grammarAccess.getDocumentAccess().getSystemSystemParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSystem_in_rule__Document__SystemAssignment_25319);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getDocumentAccess().getSystemSystemParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Document__SystemAssignment_2"


    // $ANTLR start "rule__Declaration__TextAssignment_1"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2683:1: rule__Declaration__TextAssignment_1 : ( ruleTEXT ) ;
    public final void rule__Declaration__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2687:1: ( ( ruleTEXT ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2688:1: ( ruleTEXT )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2688:1: ( ruleTEXT )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2689:1: ruleTEXT
            {
             before(grammarAccess.getDeclarationAccess().getTextTEXTParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTEXT_in_rule__Declaration__TextAssignment_15350);
            ruleTEXT();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getTextTEXTParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Declaration__TextAssignment_1"


    // $ANTLR start "rule__Template__NameAssignment_1"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2698:1: rule__Template__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Template__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2702:1: ( ( RULE_ID ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2703:1: ( RULE_ID )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2703:1: ( RULE_ID )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2704:1: RULE_ID
            {
             before(grammarAccess.getTemplateAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Template__NameAssignment_15381); 
             after(grammarAccess.getTemplateAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Template__NameAssignment_1"


    // $ANTLR start "rule__Template__ParametersAssignment_2"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2713:1: rule__Template__ParametersAssignment_2 : ( ruleParameter ) ;
    public final void rule__Template__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2717:1: ( ( ruleParameter ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2718:1: ( ruleParameter )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2718:1: ( ruleParameter )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2719:1: ruleParameter
            {
             before(grammarAccess.getTemplateAccess().getParametersParameterParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Template__ParametersAssignment_25412);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getTemplateAccess().getParametersParameterParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Template__ParametersAssignment_2"


    // $ANTLR start "rule__Template__DeclarationAssignment_3"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2728:1: rule__Template__DeclarationAssignment_3 : ( ruleDeclaration ) ;
    public final void rule__Template__DeclarationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2732:1: ( ( ruleDeclaration ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2733:1: ( ruleDeclaration )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2733:1: ( ruleDeclaration )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2734:1: ruleDeclaration
            {
             before(grammarAccess.getTemplateAccess().getDeclarationDeclarationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleDeclaration_in_rule__Template__DeclarationAssignment_35443);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getTemplateAccess().getDeclarationDeclarationParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Template__DeclarationAssignment_3"


    // $ANTLR start "rule__Template__StateAssignment_4"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2743:1: rule__Template__StateAssignment_4 : ( ruleState ) ;
    public final void rule__Template__StateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2747:1: ( ( ruleState ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2748:1: ( ruleState )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2748:1: ( ruleState )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2749:1: ruleState
            {
             before(grammarAccess.getTemplateAccess().getStateStateParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__Template__StateAssignment_45474);
            ruleState();

            state._fsp--;

             after(grammarAccess.getTemplateAccess().getStateStateParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Template__StateAssignment_4"


    // $ANTLR start "rule__Template__BranchpointAssignment_5"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2758:1: rule__Template__BranchpointAssignment_5 : ( ruleBranchpoint ) ;
    public final void rule__Template__BranchpointAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2762:1: ( ( ruleBranchpoint ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2763:1: ( ruleBranchpoint )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2763:1: ( ruleBranchpoint )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2764:1: ruleBranchpoint
            {
             before(grammarAccess.getTemplateAccess().getBranchpointBranchpointParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleBranchpoint_in_rule__Template__BranchpointAssignment_55505);
            ruleBranchpoint();

            state._fsp--;

             after(grammarAccess.getTemplateAccess().getBranchpointBranchpointParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Template__BranchpointAssignment_5"


    // $ANTLR start "rule__Template__TransitionAssignment_6"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2773:1: rule__Template__TransitionAssignment_6 : ( ruleTransition ) ;
    public final void rule__Template__TransitionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2777:1: ( ( ruleTransition ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2778:1: ( ruleTransition )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2778:1: ( ruleTransition )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2779:1: ruleTransition
            {
             before(grammarAccess.getTemplateAccess().getTransitionTransitionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleTransition_in_rule__Template__TransitionAssignment_65536);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTemplateAccess().getTransitionTransitionParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Template__TransitionAssignment_6"


    // $ANTLR start "rule__System__TextAssignment_1"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2788:1: rule__System__TextAssignment_1 : ( ruleTEXT ) ;
    public final void rule__System__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2792:1: ( ( ruleTEXT ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2793:1: ( ruleTEXT )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2793:1: ( ruleTEXT )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2794:1: ruleTEXT
            {
             before(grammarAccess.getSystemAccess().getTextTEXTParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTEXT_in_rule__System__TextAssignment_15567);
            ruleTEXT();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getTextTEXTParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__System__TextAssignment_1"


    // $ANTLR start "rule__Parameter__TextAssignment_1"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2803:1: rule__Parameter__TextAssignment_1 : ( ruleTEXT ) ;
    public final void rule__Parameter__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2807:1: ( ( ruleTEXT ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2808:1: ( ruleTEXT )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2808:1: ( ruleTEXT )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2809:1: ruleTEXT
            {
             before(grammarAccess.getParameterAccess().getTextTEXTParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTEXT_in_rule__Parameter__TextAssignment_15598);
            ruleTEXT();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTextTEXTParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Parameter__TextAssignment_1"


    // $ANTLR start "rule__State__IdAssignment_3"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2818:1: rule__State__IdAssignment_3 : ( RULE_ID ) ;
    public final void rule__State__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2822:1: ( ( RULE_ID ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2823:1: ( RULE_ID )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2823:1: ( RULE_ID )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2824:1: RULE_ID
            {
             before(grammarAccess.getStateAccess().getIdIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__IdAssignment_35629); 
             after(grammarAccess.getStateAccess().getIdIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__State__IdAssignment_3"


    // $ANTLR start "rule__State__NameAssignment_4_1"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2833:1: rule__State__NameAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2837:1: ( ( RULE_ID ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2838:1: ( RULE_ID )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2838:1: ( RULE_ID )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2839:1: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__NameAssignment_4_15660); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__State__NameAssignment_4_1"


    // $ANTLR start "rule__State__TextAssignment_5"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2848:1: rule__State__TextAssignment_5 : ( ruleTEXT ) ;
    public final void rule__State__TextAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2852:1: ( ( ruleTEXT ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2853:1: ( ruleTEXT )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2853:1: ( ruleTEXT )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2854:1: ruleTEXT
            {
             before(grammarAccess.getStateAccess().getTextTEXTParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleTEXT_in_rule__State__TextAssignment_55691);
            ruleTEXT();

            state._fsp--;

             after(grammarAccess.getStateAccess().getTextTEXTParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__State__TextAssignment_5"


    // $ANTLR start "rule__State__ExponentialRateAssignment_6_1"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2863:1: rule__State__ExponentialRateAssignment_6_1 : ( ruleTEXT ) ;
    public final void rule__State__ExponentialRateAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2867:1: ( ( ruleTEXT ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2868:1: ( ruleTEXT )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2868:1: ( ruleTEXT )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2869:1: ruleTEXT
            {
             before(grammarAccess.getStateAccess().getExponentialRateTEXTParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleTEXT_in_rule__State__ExponentialRateAssignment_6_15722);
            ruleTEXT();

            state._fsp--;

             after(grammarAccess.getStateAccess().getExponentialRateTEXTParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__State__ExponentialRateAssignment_6_1"


    // $ANTLR start "rule__Branchpoint__NameAssignment_0"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2878:1: rule__Branchpoint__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Branchpoint__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2882:1: ( ( RULE_ID ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2883:1: ( RULE_ID )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2883:1: ( RULE_ID )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2884:1: RULE_ID
            {
             before(grammarAccess.getBranchpointAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Branchpoint__NameAssignment_05753); 
             after(grammarAccess.getBranchpointAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Branchpoint__NameAssignment_0"


    // $ANTLR start "rule__Transition__OutBoundStateAssignment_0"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2893:1: rule__Transition__OutBoundStateAssignment_0 : ( RULE_ID ) ;
    public final void rule__Transition__OutBoundStateAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2897:1: ( ( RULE_ID ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2898:1: ( RULE_ID )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2898:1: ( RULE_ID )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2899:1: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getOutBoundStateIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transition__OutBoundStateAssignment_05784); 
             after(grammarAccess.getTransitionAccess().getOutBoundStateIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Transition__OutBoundStateAssignment_0"


    // $ANTLR start "rule__Transition__InboundStateAssignment_2"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2908:1: rule__Transition__InboundStateAssignment_2 : ( RULE_ID ) ;
    public final void rule__Transition__InboundStateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2912:1: ( ( RULE_ID ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2913:1: ( RULE_ID )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2913:1: ( RULE_ID )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2914:1: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getInboundStateIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transition__InboundStateAssignment_25815); 
             after(grammarAccess.getTransitionAccess().getInboundStateIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Transition__InboundStateAssignment_2"


    // $ANTLR start "rule__Transition__SelectAssignment_3_1_2"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2923:1: rule__Transition__SelectAssignment_3_1_2 : ( ruleTEXT ) ;
    public final void rule__Transition__SelectAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2927:1: ( ( ruleTEXT ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2928:1: ( ruleTEXT )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2928:1: ( ruleTEXT )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2929:1: ruleTEXT
            {
             before(grammarAccess.getTransitionAccess().getSelectTEXTParserRuleCall_3_1_2_0()); 
            pushFollow(FOLLOW_ruleTEXT_in_rule__Transition__SelectAssignment_3_1_25846);
            ruleTEXT();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getSelectTEXTParserRuleCall_3_1_2_0()); 

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
    // $ANTLR end "rule__Transition__SelectAssignment_3_1_2"


    // $ANTLR start "rule__Transition__GuardAssignment_3_3_2"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2938:1: rule__Transition__GuardAssignment_3_3_2 : ( ruleTEXT ) ;
    public final void rule__Transition__GuardAssignment_3_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2942:1: ( ( ruleTEXT ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2943:1: ( ruleTEXT )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2943:1: ( ruleTEXT )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2944:1: ruleTEXT
            {
             before(grammarAccess.getTransitionAccess().getGuardTEXTParserRuleCall_3_3_2_0()); 
            pushFollow(FOLLOW_ruleTEXT_in_rule__Transition__GuardAssignment_3_3_25877);
            ruleTEXT();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getGuardTEXTParserRuleCall_3_3_2_0()); 

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
    // $ANTLR end "rule__Transition__GuardAssignment_3_3_2"


    // $ANTLR start "rule__Transition__SyncAssignment_3_5_2"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2953:1: rule__Transition__SyncAssignment_3_5_2 : ( ruleTEXT ) ;
    public final void rule__Transition__SyncAssignment_3_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2957:1: ( ( ruleTEXT ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2958:1: ( ruleTEXT )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2958:1: ( ruleTEXT )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2959:1: ruleTEXT
            {
             before(grammarAccess.getTransitionAccess().getSyncTEXTParserRuleCall_3_5_2_0()); 
            pushFollow(FOLLOW_ruleTEXT_in_rule__Transition__SyncAssignment_3_5_25908);
            ruleTEXT();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getSyncTEXTParserRuleCall_3_5_2_0()); 

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
    // $ANTLR end "rule__Transition__SyncAssignment_3_5_2"


    // $ANTLR start "rule__Transition__AssignAssignment_3_7_2"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2968:1: rule__Transition__AssignAssignment_3_7_2 : ( ruleTEXT ) ;
    public final void rule__Transition__AssignAssignment_3_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2972:1: ( ( ruleTEXT ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2973:1: ( ruleTEXT )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2973:1: ( ruleTEXT )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2974:1: ruleTEXT
            {
             before(grammarAccess.getTransitionAccess().getAssignTEXTParserRuleCall_3_7_2_0()); 
            pushFollow(FOLLOW_ruleTEXT_in_rule__Transition__AssignAssignment_3_7_25939);
            ruleTEXT();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getAssignTEXTParserRuleCall_3_7_2_0()); 

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
    // $ANTLR end "rule__Transition__AssignAssignment_3_7_2"


    // $ANTLR start "rule__Transition__ProbabilityAssignment_3_9_2"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2983:1: rule__Transition__ProbabilityAssignment_3_9_2 : ( ruleTEXT ) ;
    public final void rule__Transition__ProbabilityAssignment_3_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2987:1: ( ( ruleTEXT ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2988:1: ( ruleTEXT )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2988:1: ( ruleTEXT )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2989:1: ruleTEXT
            {
             before(grammarAccess.getTransitionAccess().getProbabilityTEXTParserRuleCall_3_9_2_0()); 
            pushFollow(FOLLOW_ruleTEXT_in_rule__Transition__ProbabilityAssignment_3_9_25970);
            ruleTEXT();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getProbabilityTEXTParserRuleCall_3_9_2_0()); 

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
    // $ANTLR end "rule__Transition__ProbabilityAssignment_3_9_2"


    // $ANTLR start "rule__Transition__CommentsAssignment_3_11_2"
    // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:2998:1: rule__Transition__CommentsAssignment_3_11_2 : ( ruleTEXT ) ;
    public final void rule__Transition__CommentsAssignment_3_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:3002:1: ( ( ruleTEXT ) )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:3003:1: ( ruleTEXT )
            {
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:3003:1: ( ruleTEXT )
            // ../org.xtext.example.plantext.ui/src-gen/org/xtext/example/plantext/ui/contentassist/antlr/internal/InternalPlantExt.g:3004:1: ruleTEXT
            {
             before(grammarAccess.getTransitionAccess().getCommentsTEXTParserRuleCall_3_11_2_0()); 
            pushFollow(FOLLOW_ruleTEXT_in_rule__Transition__CommentsAssignment_3_11_26001);
            ruleTEXT();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getCommentsTEXTParserRuleCall_3_11_2_0()); 

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
    // $ANTLR end "rule__Transition__CommentsAssignment_3_11_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDocument_in_entryRuleDocument61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocument68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__0_in_ruleDocument94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__0_in_ruleDeclaration154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplate_in_entryRuleTemplate181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplate188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__Group__0_in_ruleTemplate214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_entryRuleSystem241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystem248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__0_in_ruleSystem274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0_in_ruleState394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBranchpoint_in_entryRuleBranchpoint421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBranchpoint428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Branchpoint__Group__0_in_ruleBranchpoint454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0_in_ruleTransition514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTEXT_in_entryRuleTEXT541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTEXT548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TEXT__Alternatives_in_ruleTEXT574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__State__Alternatives_1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__State__Alternatives_1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__TEXT__Alternatives665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TEXT__Alternatives682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__TEXT__Alternatives699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__TEXT__Alternatives717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__TEXT__Alternatives737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__0__Impl_in_rule__Document__Group__0769 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Document__Group__1_in_rule__Document__Group__0772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__DeclarationAssignment_0_in_rule__Document__Group__0__Impl799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__Group__1__Impl_in_rule__Document__Group__1829 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Document__Group__2_in_rule__Document__Group__1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__TemplateAssignment_1_in_rule__Document__Group__1__Impl861 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Document__TemplateAssignment_1_in_rule__Document__Group__1__Impl873 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Document__Group__2__Impl_in_rule__Document__Group__2906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Document__SystemAssignment_2_in_rule__Document__Group__2__Impl933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__0969 = new BitSet(new long[]{0x0000000000016070L});
    public static final BitSet FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__0972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Declaration__Group__0__Impl1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__11031 = new BitSet(new long[]{0x0000000000016070L});
    public static final BitSet FOLLOW_rule__Declaration__Group__2_in_rule__Declaration__Group__11034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__TextAssignment_1_in_rule__Declaration__Group__1__Impl1061 = new BitSet(new long[]{0x0000000000006072L});
    public static final BitSet FOLLOW_rule__Declaration__Group__2__Impl_in_rule__Declaration__Group__21092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Declaration__Group__2__Impl1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__Group__0__Impl_in_rule__Template__Group__01157 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Template__Group__1_in_rule__Template__Group__01160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Template__Group__0__Impl1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__Group__1__Impl_in_rule__Template__Group__11219 = new BitSet(new long[]{0x0000000001A09800L});
    public static final BitSet FOLLOW_rule__Template__Group__2_in_rule__Template__Group__11222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__NameAssignment_1_in_rule__Template__Group__1__Impl1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__Group__2__Impl_in_rule__Template__Group__21279 = new BitSet(new long[]{0x0000000001A09800L});
    public static final BitSet FOLLOW_rule__Template__Group__3_in_rule__Template__Group__21282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__ParametersAssignment_2_in_rule__Template__Group__2__Impl1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__Group__3__Impl_in_rule__Template__Group__31340 = new BitSet(new long[]{0x0000000001A09800L});
    public static final BitSet FOLLOW_rule__Template__Group__4_in_rule__Template__Group__31343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__DeclarationAssignment_3_in_rule__Template__Group__3__Impl1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__Group__4__Impl_in_rule__Template__Group__41401 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Template__Group__5_in_rule__Template__Group__41404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__StateAssignment_4_in_rule__Template__Group__4__Impl1433 = new BitSet(new long[]{0x0000000001A09802L});
    public static final BitSet FOLLOW_rule__Template__StateAssignment_4_in_rule__Template__Group__4__Impl1445 = new BitSet(new long[]{0x0000000001A09802L});
    public static final BitSet FOLLOW_rule__Template__Group__5__Impl_in_rule__Template__Group__51478 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Template__Group__6_in_rule__Template__Group__51481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__BranchpointAssignment_5_in_rule__Template__Group__5__Impl1508 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Template__Group__6__Impl_in_rule__Template__Group__61539 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Template__Group__7_in_rule__Template__Group__61542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__TransitionAssignment_6_in_rule__Template__Group__6__Impl1571 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Template__TransitionAssignment_6_in_rule__Template__Group__6__Impl1583 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Template__Group__7__Impl_in_rule__Template__Group__71616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Template__Group__7__Impl1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__0__Impl_in_rule__System__Group__01691 = new BitSet(new long[]{0x0000000000106070L});
    public static final BitSet FOLLOW_rule__System__Group__1_in_rule__System__Group__01694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__System__Group__0__Impl1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__1__Impl_in_rule__System__Group__11753 = new BitSet(new long[]{0x0000000000106070L});
    public static final BitSet FOLLOW_rule__System__Group__2_in_rule__System__Group__11756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__TextAssignment_1_in_rule__System__Group__1__Impl1783 = new BitSet(new long[]{0x0000000000006072L});
    public static final BitSet FOLLOW_rule__System__Group__2__Impl_in_rule__System__Group__21814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__System__Group__2__Impl1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__01879 = new BitSet(new long[]{0x0000000000406070L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__01882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Parameter__Group__0__Impl1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__11941 = new BitSet(new long[]{0x0000000000406070L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2_in_rule__Parameter__Group__11944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__TextAssignment_1_in_rule__Parameter__Group__1__Impl1971 = new BitSet(new long[]{0x0000000000006072L});
    public static final BitSet FOLLOW_rule__Parameter__Group__2__Impl_in_rule__Parameter__Group__22002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Parameter__Group__2__Impl2030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__02067 = new BitSet(new long[]{0x0000000001A09800L});
    public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__02070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__State__Group__0__Impl2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__12132 = new BitSet(new long[]{0x0000000001A09800L});
    public static final BitSet FOLLOW_rule__State__Group__2_in_rule__State__Group__12135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Alternatives_1_in_rule__State__Group__1__Impl2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__22193 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__State__Group__3_in_rule__State__Group__22196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__State__Group__2__Impl2224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__32255 = new BitSet(new long[]{0x0000000001006070L});
    public static final BitSet FOLLOW_rule__State__Group__4_in_rule__State__Group__32258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IdAssignment_3_in_rule__State__Group__3__Impl2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__42315 = new BitSet(new long[]{0x0000000001006070L});
    public static final BitSet FOLLOW_rule__State__Group__5_in_rule__State__Group__42318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_4__0_in_rule__State__Group__4__Impl2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__5__Impl_in_rule__State__Group__52376 = new BitSet(new long[]{0x0000000001006070L});
    public static final BitSet FOLLOW_rule__State__Group__6_in_rule__State__Group__52379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__TextAssignment_5_in_rule__State__Group__5__Impl2406 = new BitSet(new long[]{0x0000000000006072L});
    public static final BitSet FOLLOW_rule__State__Group__6__Impl_in_rule__State__Group__62437 = new BitSet(new long[]{0x0000000001006070L});
    public static final BitSet FOLLOW_rule__State__Group__7_in_rule__State__Group__62440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_6__0_in_rule__State__Group__6__Impl2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__7__Impl_in_rule__State__Group__72498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__State__Group__7__Impl2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_4__0__Impl_in_rule__State__Group_4__02573 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__State__Group_4__1_in_rule__State__Group_4__02576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__State__Group_4__0__Impl2604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_4__1__Impl_in_rule__State__Group_4__12635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__NameAssignment_4_1_in_rule__State__Group_4__1__Impl2662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_6__0__Impl_in_rule__State__Group_6__02696 = new BitSet(new long[]{0x0000000000006070L});
    public static final BitSet FOLLOW_rule__State__Group_6__1_in_rule__State__Group_6__02699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__State__Group_6__0__Impl2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_6__1__Impl_in_rule__State__Group_6__12758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__ExponentialRateAssignment_6_1_in_rule__State__Group_6__1__Impl2785 = new BitSet(new long[]{0x0000000000006072L});
    public static final BitSet FOLLOW_rule__Branchpoint__Group__0__Impl_in_rule__Branchpoint__Group__02820 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Branchpoint__Group__1_in_rule__Branchpoint__Group__02823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Branchpoint__NameAssignment_0_in_rule__Branchpoint__Group__0__Impl2850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Branchpoint__Group__1__Impl_in_rule__Branchpoint__Group__12880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Branchpoint__Group__1__Impl2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__02943 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__02946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__OutBoundStateAssignment_0_in_rule__Transition__Group__0__Impl2973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__13003 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__13006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Transition__Group__1__Impl3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__23065 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__23068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__InboundStateAssignment_2_in_rule__Transition__Group__2__Impl3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__33125 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__33128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_3__0_in_rule__Transition__Group__3__Impl3155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__43185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Transition__Group__4__Impl3213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_3__0__Impl_in_rule__Transition__Group_3__03254 = new BitSet(new long[]{0x00000000FC004000L});
    public static final BitSet FOLLOW_rule__Transition__Group_3__1_in_rule__Transition__Group_3__03257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Transition__Group_3__0__Impl3285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_3__1__Impl_in_rule__Transition__Group_3__13316 = new BitSet(new long[]{0x00000000FC004000L});
    public static final BitSet FOLLOW_rule__Transition__Group_3__2_in_rule__Transition__Group_3__13319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_3_1__0_in_rule__Transition__Group_3__1__Impl3346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_3__2__Impl_in_rule__Transition__Group_3__23377 = new BitSet(new long[]{0x00000000FC004000L});
    public static final BitSet FOLLOW_rule__Transition__Group_3__3_in_rule__Transition__Group_3__23380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Transition__Group_3__2__Impl3409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_3__3__Impl_in_rule__Transition__Group_3__33442 = new BitSet(new long[]{0x00000000FC004000L});
    public static final BitSet FOLLOW_rule__Transition__Group_3__4_in_rule__Transition__Group_3__33445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_3_3__0_in_rule__Transition__Group_3__3__Impl3472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_3__4__Impl_in_rule__Transition__Group_3__43503 = new BitSet(new long[]{0x00000000FC004000L});
    public static final BitSet FOLLOW_rule__Transition__Group_3__5_in_rule__Transition__Group_3__43506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Transition__Group_3__4__Impl3535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_3__5__Impl_in_rule__Transition__Group_3__53568 = new BitSet(new long[]{0x00000000FC004000L});
    public static final BitSet FOLLOW_rule__Transition__Group_3__6_in_rule__Transition__Group_3__53571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_3_5__0_in_rule__Transition__Group_3__5__Impl3598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_3__6__Impl_in_rule__Transition__Group_3__63629 = new BitSet(new long[]{0x00000000FC004000L});
    public static final BitSet FOLLOW_rule__Transition__Group_3__7_in_rule__Transition__Group_3__63632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Transition__Group_3__6__Impl3661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_3__7__Impl_in_rule__Transition__Group_3__73694 = new BitSet(new long[]{0x00000000FC004000L});
    public static final BitSet FOLLOW_rule__Transition__Group_3__8_in_rule__Transition__Group_3__73697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_3_7__0_in_rule__Transition__Group_3__7__Impl3724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_3__8__Impl_in_rule__Transition__Group_3__83755 = new BitSet(new long[]{0x00000000FC004000L});
    public static final BitSet FOLLOW_rule__Transition__Group_3__9_in_rule__Transition__Group_3__83758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Transition__Group_3__8__Impl3787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_3__9__Impl_in_rule__Transition__Group_3__93820 = new BitSet(new long[]{0x00000000FC004000L});
    public static final BitSet FOLLOW_rule__Transition__Group_3__10_in_rule__Transition__Group_3__93823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_3_9__0_in_rule__Transition__Group_3__9__Impl3850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_3__10__Impl_in_rule__Transition__Group_3__103881 = new BitSet(new long[]{0x00000000FC004000L});
    public static final BitSet FOLLOW_rule__Transition__Group_3__11_in_rule__Transition__Group_3__103884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Transition__Group_3__10__Impl3913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_3__11__Impl_in_rule__Transition__Group_3__113946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_3_11__0_in_rule__Transition__Group_3__11__Impl3973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_3_1__0__Impl_in_rule__Transition__Group_3_1__04028 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Transition__Group_3_1__1_in_rule__Transition__Group_3_1__04031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Transition__Group_3_1__0__Impl4059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_3_1__1__Impl_in_rule__Transition__Group_3_1__14090 = new BitSet(new long[]{0x0000000000006070L});
    public static final BitSet FOLLOW_rule__Transition__Group_3_1__2_in_rule__Transition__Group_3_1__14093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Transition__Group_3_1__1__Impl4121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_3_1__2__Impl_in_rule__Transition__Group_3_1__24152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__SelectAssignment_3_1_2_in_rule__Transition__Group_3_1__2__Impl4181 = new BitSet(new long[]{0x0000000000006072L});
    public static final BitSet FOLLOW_rule__Transition__SelectAssignment_3_1_2_in_rule__Transition__Group_3_1__2__Impl4193 = new BitSet(new long[]{0x0000000000006072L});
    public static final BitSet FOLLOW_rule__Transition__Group_3_3__0__Impl_in_rule__Transition__Group_3_3__04232 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Transition__Group_3_3__1_in_rule__Transition__Group_3_3__04235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Transition__Group_3_3__0__Impl4263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_3_3__1__Impl_in_rule__Transition__Group_3_3__14294 = new BitSet(new long[]{0x0000000000006070L});
    public static final BitSet FOLLOW_rule__Transition__Group_3_3__2_in_rule__Transition__Group_3_3__14297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Transition__Group_3_3__1__Impl4325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_3_3__2__Impl_in_rule__Transition__Group_3_3__24356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__GuardAssignment_3_3_2_in_rule__Transition__Group_3_3__2__Impl4385 = new BitSet(new long[]{0x0000000000006072L});
    public static final BitSet FOLLOW_rule__Transition__GuardAssignment_3_3_2_in_rule__Transition__Group_3_3__2__Impl4397 = new BitSet(new long[]{0x0000000000006072L});
    public static final BitSet FOLLOW_rule__Transition__Group_3_5__0__Impl_in_rule__Transition__Group_3_5__04436 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Transition__Group_3_5__1_in_rule__Transition__Group_3_5__04439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Transition__Group_3_5__0__Impl4467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_3_5__1__Impl_in_rule__Transition__Group_3_5__14498 = new BitSet(new long[]{0x0000000000006070L});
    public static final BitSet FOLLOW_rule__Transition__Group_3_5__2_in_rule__Transition__Group_3_5__14501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Transition__Group_3_5__1__Impl4529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_3_5__2__Impl_in_rule__Transition__Group_3_5__24560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__SyncAssignment_3_5_2_in_rule__Transition__Group_3_5__2__Impl4589 = new BitSet(new long[]{0x0000000000006072L});
    public static final BitSet FOLLOW_rule__Transition__SyncAssignment_3_5_2_in_rule__Transition__Group_3_5__2__Impl4601 = new BitSet(new long[]{0x0000000000006072L});
    public static final BitSet FOLLOW_rule__Transition__Group_3_7__0__Impl_in_rule__Transition__Group_3_7__04640 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Transition__Group_3_7__1_in_rule__Transition__Group_3_7__04643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Transition__Group_3_7__0__Impl4671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_3_7__1__Impl_in_rule__Transition__Group_3_7__14702 = new BitSet(new long[]{0x0000000000006070L});
    public static final BitSet FOLLOW_rule__Transition__Group_3_7__2_in_rule__Transition__Group_3_7__14705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Transition__Group_3_7__1__Impl4733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_3_7__2__Impl_in_rule__Transition__Group_3_7__24764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__AssignAssignment_3_7_2_in_rule__Transition__Group_3_7__2__Impl4793 = new BitSet(new long[]{0x0000000000006072L});
    public static final BitSet FOLLOW_rule__Transition__AssignAssignment_3_7_2_in_rule__Transition__Group_3_7__2__Impl4805 = new BitSet(new long[]{0x0000000000006072L});
    public static final BitSet FOLLOW_rule__Transition__Group_3_9__0__Impl_in_rule__Transition__Group_3_9__04844 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Transition__Group_3_9__1_in_rule__Transition__Group_3_9__04847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Transition__Group_3_9__0__Impl4875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_3_9__1__Impl_in_rule__Transition__Group_3_9__14906 = new BitSet(new long[]{0x0000000000006070L});
    public static final BitSet FOLLOW_rule__Transition__Group_3_9__2_in_rule__Transition__Group_3_9__14909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Transition__Group_3_9__1__Impl4937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_3_9__2__Impl_in_rule__Transition__Group_3_9__24968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__ProbabilityAssignment_3_9_2_in_rule__Transition__Group_3_9__2__Impl4997 = new BitSet(new long[]{0x0000000000006072L});
    public static final BitSet FOLLOW_rule__Transition__ProbabilityAssignment_3_9_2_in_rule__Transition__Group_3_9__2__Impl5009 = new BitSet(new long[]{0x0000000000006072L});
    public static final BitSet FOLLOW_rule__Transition__Group_3_11__0__Impl_in_rule__Transition__Group_3_11__05048 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Transition__Group_3_11__1_in_rule__Transition__Group_3_11__05051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Transition__Group_3_11__0__Impl5079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_3_11__1__Impl_in_rule__Transition__Group_3_11__15110 = new BitSet(new long[]{0x0000000000006070L});
    public static final BitSet FOLLOW_rule__Transition__Group_3_11__2_in_rule__Transition__Group_3_11__15113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Transition__Group_3_11__1__Impl5141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_3_11__2__Impl_in_rule__Transition__Group_3_11__25172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__CommentsAssignment_3_11_2_in_rule__Transition__Group_3_11__2__Impl5201 = new BitSet(new long[]{0x0000000000006072L});
    public static final BitSet FOLLOW_rule__Transition__CommentsAssignment_3_11_2_in_rule__Transition__Group_3_11__2__Impl5213 = new BitSet(new long[]{0x0000000000006072L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__Document__DeclarationAssignment_05257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplate_in_rule__Document__TemplateAssignment_15288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_rule__Document__SystemAssignment_25319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTEXT_in_rule__Declaration__TextAssignment_15350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Template__NameAssignment_15381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Template__ParametersAssignment_25412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__Template__DeclarationAssignment_35443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__Template__StateAssignment_45474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBranchpoint_in_rule__Template__BranchpointAssignment_55505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__Template__TransitionAssignment_65536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTEXT_in_rule__System__TextAssignment_15567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTEXT_in_rule__Parameter__TextAssignment_15598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__IdAssignment_35629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__NameAssignment_4_15660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTEXT_in_rule__State__TextAssignment_55691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTEXT_in_rule__State__ExponentialRateAssignment_6_15722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Branchpoint__NameAssignment_05753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__OutBoundStateAssignment_05784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__InboundStateAssignment_25815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTEXT_in_rule__Transition__SelectAssignment_3_1_25846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTEXT_in_rule__Transition__GuardAssignment_3_3_25877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTEXT_in_rule__Transition__SyncAssignment_3_5_25908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTEXT_in_rule__Transition__AssignAssignment_3_7_25939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTEXT_in_rule__Transition__ProbabilityAssignment_3_9_25970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTEXT_in_rule__Transition__CommentsAssignment_3_11_26001 = new BitSet(new long[]{0x0000000000000002L});

}