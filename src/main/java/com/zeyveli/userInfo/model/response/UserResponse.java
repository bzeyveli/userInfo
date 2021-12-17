package com.zeyveli.userInfo.model.response;

import com.zeyveli.userInfo.model.entity.Address;
import com.zeyveli.userInfo.model.entity.Company;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserResponse {

    private int id;

    private String name;

    private String user_name;

    private Address addressId;

    private String phone;

    private String email;

    private String website;

    private Company companyId;
}
