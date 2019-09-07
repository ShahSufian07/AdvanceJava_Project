package bd.edu.seu.frontendproject.ui;

import bd.edu.seu.frontendproject.model.LoginToken;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import javax.servlet.http.HttpSession;

@Route("AdmissionOfficer")
public class AdmissionOfficerView extends VerticalLayout {

    public AdmissionOfficerView(HttpSession httpSession) {
        Header header = new Header(httpSession);
        header.addAttachListener(event -> {
            LoginToken loginToken = header.getLoginToken();
            if (!loginToken.getRole().equals("AdmissionOfficer")) {
                httpSession.removeAttribute("user");
                header.getUI().ifPresent(ui -> ui.navigate("login"));
            }
        });

        Div body = new Div();
        body.add(new Span("AdmissionOfficer"));
        Footer footer = new Footer();

        add(header, body, footer);
    }
}