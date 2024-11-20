package com.br.empoderatech.login.domain.dto;

import com.br.empoderatech.login.domain.enums.UserRole;

public record RegisterDTO(String login, String password, UserRole role, String email, String cpf, String cep) {
}
