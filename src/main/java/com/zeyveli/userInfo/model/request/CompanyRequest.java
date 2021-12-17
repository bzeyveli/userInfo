package com.zeyveli.userInfo.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CompanyRequest {

    private int id;

    private String name;

    private String catchPhrase;
}
