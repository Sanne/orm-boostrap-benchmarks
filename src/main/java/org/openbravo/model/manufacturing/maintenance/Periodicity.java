/*
 *************************************************************************
 * The contents of this file are subject to the Openbravo  Public  License
 * Version  1.1  (the  "License"),  being   the  Mozilla   Public  License
 * Version 1.1  with a permitted attribution clause; you may not  use this
 * file except in compliance with the License. You  may  obtain  a copy of
 * the License at http://www.openbravo.com/legal/license.html
 * Software distributed under the License  is  distributed  on  an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific  language  governing  rights  and  limitations
 * under the License.
 * The Original Code is Openbravo ERP.
 * The Initial Developer of the Original Code is Openbravo SLU
 * All portions are Copyright (C) 2008-2014 Openbravo SLU
 * All Rights Reserved.
 * Contributor(s):  ______________________________________.
 ************************************************************************
*/
package org.openbravo.model.manufacturing.maintenance;

import java.util.Date;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;

/**
 * Entity class for entity ManufacturingMaintenancePeriodicity (stored in table MA_Maint_Periodicity).
 *
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Periodicity extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "MA_Maint_Periodicity";
    public static final String ENTITY_NAME = "ManufacturingMaintenancePeriodicity";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_CLIENT = "client";
    public static final String PROPERTY_ORGANIZATION = "organization";
    public static final String PROPERTY_ACTIVE = "active";
    public static final String PROPERTY_CREATIONDATE = "creationDate";
    public static final String PROPERTY_CREATEDBY = "createdBy";
    public static final String PROPERTY_UPDATED = "updated";
    public static final String PROPERTY_UPDATEDBY = "updatedBy";
    public static final String PROPERTY_PERIODICITYTYPE = "periodicityType";
    public static final String PROPERTY_MAINTENANCE = "maintenance";
    public static final String PROPERTY_WEEKDAY = "weekday";
    public static final String PROPERTY_DAYOFTHEMONTH = "dayOfTheMonth";
    public static final String PROPERTY_SHIFT = "shift";
    public static final String PROPERTY_STARTINGDAY = "startingDay";
    public static final String PROPERTY_EXCLUDEWEEKENDS = "excludeWeekends";

    public Periodicity() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_EXCLUDEWEEKENDS, true);
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }

    public String getId() {
        return (String) get(PROPERTY_ID);
    }

    public void setId(String id) {
        set(PROPERTY_ID, id);
    }

    public Client getClient() {
        return (Client) get( PROPERTY_CLIENT);
    }

    public void setClient(Client client) {
        set(PROPERTY_CLIENT, client);
    }

    public Organization getOrganization() {
        return (Organization) get(PROPERTY_ORGANIZATION);
    }

    public void setOrganization(Organization organization) {
        set(PROPERTY_ORGANIZATION, organization);
    }

    public Boolean isActive() {
        return (Boolean) get(PROPERTY_ACTIVE);
    }

    public void setActive(Boolean active) {
        set(PROPERTY_ACTIVE, active);
    }

    public Date getCreationDate() {
        return (Date) get(PROPERTY_CREATIONDATE);
    }

    public void setCreationDate(Date creationDate) {
        set(PROPERTY_CREATIONDATE, creationDate);
    }

    public User getCreatedBy() {
        return (User) get( PROPERTY_CREATEDBY);
    }

    public void setCreatedBy(User createdBy) {
        set(PROPERTY_CREATEDBY, createdBy);
    }

    public Date getUpdated() {
        return (Date) get(PROPERTY_UPDATED);
    }

    public void setUpdated(Date updated) {
        set(PROPERTY_UPDATED, updated);
    }

    public User getUpdatedBy() {
        return (User) get( PROPERTY_UPDATEDBY);
    }

    public void setUpdatedBy(User updatedBy) {
        set(PROPERTY_UPDATEDBY, updatedBy);
    }

    public String getPeriodicityType() {
        return (String) get(PROPERTY_PERIODICITYTYPE);
    }

    public void setPeriodicityType(String periodicityType) {
        set(PROPERTY_PERIODICITYTYPE, periodicityType);
    }

    public Maintenance getMaintenance() {
        return (Maintenance) get(PROPERTY_MAINTENANCE);
    }

    public void setMaintenance(Maintenance maintenance) {
        set(PROPERTY_MAINTENANCE, maintenance);
    }

    public String getWeekday() {
        return (String) get(PROPERTY_WEEKDAY);
    }

    public void setWeekday(String weekday) {
        set(PROPERTY_WEEKDAY, weekday);
    }

    public Long getDayOfTheMonth() {
        return (Long) get(PROPERTY_DAYOFTHEMONTH);
    }

    public void setDayOfTheMonth(Long dayOfTheMonth) {
        set(PROPERTY_DAYOFTHEMONTH, dayOfTheMonth);
    }

    public String getShift() {
        return (String) get(PROPERTY_SHIFT);
    }

    public void setShift(String shift) {
        set(PROPERTY_SHIFT, shift);
    }

    public Date getStartingDay() {
        return (Date) get(PROPERTY_STARTINGDAY);
    }

    public void setStartingDay(Date startingDay) {
        set(PROPERTY_STARTINGDAY, startingDay);
    }

    public Boolean isExcludeWeekends() {
        return (Boolean) get(PROPERTY_EXCLUDEWEEKENDS);
    }

    public void setExcludeWeekends(Boolean excludeWeekends) {
        set(PROPERTY_EXCLUDEWEEKENDS, excludeWeekends);
    }

}
