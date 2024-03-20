package com.konfigthis.client;

import com.konfigthis.client.api.PermissionManagementApi;

public class VisierPermissionManagement {
    private ApiClient apiClient;
    public final PermissionManagementApi permissionManagement;

    public VisierPermissionManagement() {
        this(null);
    }

    public VisierPermissionManagement(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.permissionManagement = new PermissionManagementApi(this.apiClient);
    }

}
