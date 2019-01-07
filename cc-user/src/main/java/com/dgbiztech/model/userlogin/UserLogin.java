package com.dgbiztech.model.userlogin;

import lombok.*;
import java.util.Date;
import java.util.List;

@Data
public class UserLogin {

    private String userLoginId;

    private String userLoginCode;

    private String partyNameGroup;

    private String partyFullNameGroup;

    private String partyIdPerson;

    private String partyCodePerson;

    private String partyNamePerson;
    /**
     * @NotEmpty(message="密码不能为空！")
     */
    private String currentPassword;

    private String passwordHint;

    private String enabled;

    private String hasLoggedOut;

    private String requirePasswordChange;

    private Date disabledDateTime;

    private Integer successiveFailedLogins;

    private String sessionid;

    private String oldPassword;

    private String bindMobile;

    private String loginType;

    private String sendId;

    private String custName;

    private List<String> userRoleList;

    private String openId;

    private String fax;

    private String contactAddress;

    private String dealerName;

    private String organizationName;

    private String certificateNumber;

    private String isOperator;

    private String certificateType;

    /** 关联超级机构帐号 */
    private String superUserLoginId;

    private String superUserLoginName;

    private String organizationId;

    /**TIS登陆名 */
    private String tisLoginCode;

    //EIP账号
    private String eipCode;



}