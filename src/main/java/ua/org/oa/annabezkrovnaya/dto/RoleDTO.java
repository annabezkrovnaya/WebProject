package ua.org.oa.annabezkrovnaya.dto;

import ua.org.oa.annabezkrovnaya.model.Entity;

public class RoleDTO extends Entity<Integer> {

    private String roleName;

    public RoleDTO() {
    }

    public RoleDTO(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "RoleDTO{" +
                "roleName='" + roleName + '\'' +
                '}';
    }
}
