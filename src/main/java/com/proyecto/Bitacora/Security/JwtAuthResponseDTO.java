
package com.proyecto.Bitacora.Security;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class JwtAuthResponseDTO {
    private String tokenDeAcceso;
    private String tipoDeToken = "Bearer";

    public JwtAuthResponseDTO(String tokenDeAcceso) {
        super();
        this.tokenDeAcceso = tokenDeAcceso;
    }

    public JwtAuthResponseDTO(String tokenDeAcceso, String tipoDeToken) {
        super();
        this.tokenDeAcceso = tokenDeAcceso;
        this.tipoDeToken = tipoDeToken;
    }
}
