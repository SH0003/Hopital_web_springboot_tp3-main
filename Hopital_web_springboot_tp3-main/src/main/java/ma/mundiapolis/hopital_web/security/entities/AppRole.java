package ma.mundiapolis.hopital_web.security.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //table en base donnes
@Data //get setters and getters
@NoArgsConstructor @AllArgsConstructor
@Builder //cree les attributs sans ordre
public class AppRole {
    @Id
    private String role;
}
