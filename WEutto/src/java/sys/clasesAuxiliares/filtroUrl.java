package sys.clasesAuxiliares;

import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import javax.servlet.http.HttpSession;

public class filtroUrl implements PhaseListener {

    @Override
    public void afterPhase(PhaseEvent event) {
        FacesContext facesContext = event.getFacesContext();

        
        
        
        
        
        
        //Capturamos el nombre de la pagina actual
        String currentPage = facesContext.getViewRoot().getViewId();

        //Creamos una variable booleana para comprobar si es la pagina de login que capturo
        boolean isPageLogin = currentPage.lastIndexOf("login.xhtml") > -1 ? true : false;
        HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(true);
        //recuperamos un object de Stirng que se guardo para ello se toma la session
        //de usuario que se definio e el loginBean?
        Object usuario = session.getAttribute("usuario");

        //si no es la pagina de logueo y el usuario es nulo lo redirigimos a la pagina
        if (!isPageLogin && usuario == null) {
            NavigationHandler nHandler = facesContext.getApplication().getNavigationHandler();
            nHandler.handleNavigation(facesContext, null, "/login.xhtml");
        }
    }

    @Override
    public void beforePhase(PhaseEvent event) {
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.RESTORE_VIEW;
    }

}
