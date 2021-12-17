package com.zeyveli.userInfo.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CompanyResponse {

    private int id;

    private String name;

    private String catchPhrase;

}
