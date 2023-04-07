package barbatos_rex1.laprivteacherapp.components;

import barbatos_rex1.laprivcore.user.domain.AuthzService;
import lombok.AllArgsConstructor;
import org.jline.utils.AttributedString;
import org.jline.utils.AttributedStyle;
import org.springframework.shell.jline.PromptProvider;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AuthenticationPromptProvider implements PromptProvider {

    private AuthzService service;

    @Override
    public AttributedString getPrompt() {

        StringBuilder sb = new StringBuilder();
        sb.append("@");
        if (service.currentSession().isEmpty()) {
            sb.append("Unauthenticated User");
        } else {
            sb.append(String.format("%s", service.currentSession().get().shortName));
        }
        sb.append("> ");
        return new AttributedString(sb.toString(), AttributedStyle.BOLD.foreground(AttributedStyle.BLUE));
    }
}
