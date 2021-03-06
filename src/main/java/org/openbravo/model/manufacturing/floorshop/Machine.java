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
package org.openbravo.model.manufacturing.floorshop;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openbravo.base.structure.ActiveEnabled;
import org.openbravo.base.structure.BaseOBObject;
import org.openbravo.base.structure.ClientEnabled;
import org.openbravo.base.structure.OrganizationEnabled;
import org.openbravo.base.structure.Traceable;
import org.openbravo.model.ad.access.User;
import org.openbravo.model.ad.system.Client;
import org.openbravo.model.common.enterprise.Organization;
import org.openbravo.model.manufacturing.cost.CostCenter;
import org.openbravo.model.manufacturing.cost.CostCenterMachine;
import org.openbravo.model.manufacturing.maintenance.Maintenance;
import org.openbravo.model.manufacturing.maintenance.MaintenanceSchedule;
import org.openbravo.model.manufacturing.processplan.OperationMachine;
import org.openbravo.model.manufacturing.transaction.ProductionRunMachine;

/**
 * Entity class for entity ManufacturingMachine (stored in table MA_Machine).
 *
 * NOTE: This class should not be instantiated directly. To instantiate this
 * class the {@link org.openbravo.base.provider.OBProvider} should be used.
 */
public class Machine extends BaseOBObject implements Traceable, ClientEnabled, OrganizationEnabled, ActiveEnabled {
    private static final long serialVersionUID = 1L;
    public static final String TABLE_NAME = "MA_Machine";
    public static final String ENTITY_NAME = "ManufacturingMachine";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_CLIENT = "client";
    public static final String PROPERTY_ORGANIZATION = "organization";
    public static final String PROPERTY_ACTIVE = "active";
    public static final String PROPERTY_CREATIONDATE = "creationDate";
    public static final String PROPERTY_CREATEDBY = "createdBy";
    public static final String PROPERTY_UPDATED = "updated";
    public static final String PROPERTY_UPDATEDBY = "updatedBy";
    public static final String PROPERTY_NAME = "name";
    public static final String PROPERTY_PURCHASEYEAR = "purchaseYear";
    public static final String PROPERTY_LIFESPAN = "lifespan";
    public static final String PROPERTY_SEARCHKEY = "searchKey";
    public static final String PROPERTY_COSTCENTER = "costCenter";
    public static final String PROPERTY_MACHINECATEGORY = "machineCategory";
    public static final String PROPERTY_MANUFACTURINGCOSTCENTERMACHINELIST = "manufacturingCostCenterMachineList";
    public static final String PROPERTY_MANUFACTURINGMACHINECOSTLIST = "manufacturingMachineCostList";
    public static final String PROPERTY_MANUFACTURINGMACHINESTATIONLIST = "manufacturingMachineStationList";
    public static final String PROPERTY_MANUFACTURINGMAINTENANCELIST = "manufacturingMaintenanceList";
    public static final String PROPERTY_MANUFACTURINGMAINTENANCESCHEDULELIST = "manufacturingMaintenanceScheduleList";
    public static final String PROPERTY_MANUFACTURINGOPERATIONMACHINELIST = "manufacturingOperationMachineList";
    public static final String PROPERTY_MANUFACTURINGPRODUCTIONRUNMACHINELIST = "manufacturingProductionRunMachineList";

    public Machine() {
        setDefaultValue(PROPERTY_ACTIVE, true);
        setDefaultValue(PROPERTY_MANUFACTURINGCOSTCENTERMACHINELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_MANUFACTURINGMACHINECOSTLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_MANUFACTURINGMACHINESTATIONLIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_MANUFACTURINGMAINTENANCELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_MANUFACTURINGMAINTENANCESCHEDULELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_MANUFACTURINGOPERATIONMACHINELIST, new ArrayList<Object>());
        setDefaultValue(PROPERTY_MANUFACTURINGPRODUCTIONRUNMACHINELIST, new ArrayList<Object>());
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
        return (Client) get(PROPERTY_CLIENT);
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

    public String getName() {
        return (String) get(PROPERTY_NAME);
    }

    public void setName(String name) {
        set(PROPERTY_NAME, name);
    }

    public Date getPurchaseYear() {
        return (Date) get(PROPERTY_PURCHASEYEAR);
    }

    public void setPurchaseYear(Date purchaseYear) {
        set(PROPERTY_PURCHASEYEAR, purchaseYear);
    }

    public Long getLifespan() {
        return (Long) get(PROPERTY_LIFESPAN);
    }

    public void setLifespan(Long lifespan) {
        set(PROPERTY_LIFESPAN, lifespan);
    }

    public String getSearchKey() {
        return (String) get(PROPERTY_SEARCHKEY);
    }

    public void setSearchKey(String searchKey) {
        set(PROPERTY_SEARCHKEY, searchKey);
    }

    public CostCenter getCostCenter() {
        return (CostCenter) get(PROPERTY_COSTCENTER);
    }

    public void setCostCenter(CostCenter costCenter) {
        set(PROPERTY_COSTCENTER, costCenter);
    }

    public MachineType getMachineCategory() {
        return (MachineType) get(PROPERTY_MACHINECATEGORY);
    }

    public void setMachineCategory(MachineType machineCategory) {
        set(PROPERTY_MACHINECATEGORY, machineCategory);
    }

    @SuppressWarnings("unchecked")
    public List<CostCenterMachine> getManufacturingCostCenterMachineList() {
      return (List<CostCenterMachine>) get(PROPERTY_MANUFACTURINGCOSTCENTERMACHINELIST);
    }

    public void setManufacturingCostCenterMachineList(List<CostCenterMachine> manufacturingCostCenterMachineList) {
        set(PROPERTY_MANUFACTURINGCOSTCENTERMACHINELIST, manufacturingCostCenterMachineList);
    }

    @SuppressWarnings("unchecked")
    public List<MachineCost> getManufacturingMachineCostList() {
      return (List<MachineCost>) get(PROPERTY_MANUFACTURINGMACHINECOSTLIST);
    }

    public void setManufacturingMachineCostList(List<MachineCost> manufacturingMachineCostList) {
        set(PROPERTY_MANUFACTURINGMACHINECOSTLIST, manufacturingMachineCostList);
    }

    @SuppressWarnings("unchecked")
    public List<WorkCenterMachine> getManufacturingMachineStationList() {
      return (List<WorkCenterMachine>) get(PROPERTY_MANUFACTURINGMACHINESTATIONLIST);
    }

    public void setManufacturingMachineStationList(List<WorkCenterMachine> manufacturingMachineStationList) {
        set(PROPERTY_MANUFACTURINGMACHINESTATIONLIST, manufacturingMachineStationList);
    }

    @SuppressWarnings("unchecked")
    public List<Maintenance> getManufacturingMaintenanceList() {
      return (List<Maintenance>) get(PROPERTY_MANUFACTURINGMAINTENANCELIST);
    }

    public void setManufacturingMaintenanceList(List<Maintenance> manufacturingMaintenanceList) {
        set(PROPERTY_MANUFACTURINGMAINTENANCELIST, manufacturingMaintenanceList);
    }

    @SuppressWarnings("unchecked")
    public List<MaintenanceSchedule> getManufacturingMaintenanceScheduleList() {
      return (List<MaintenanceSchedule>) get(PROPERTY_MANUFACTURINGMAINTENANCESCHEDULELIST);
    }

    public void setManufacturingMaintenanceScheduleList(List<MaintenanceSchedule> manufacturingMaintenanceScheduleList) {
        set(PROPERTY_MANUFACTURINGMAINTENANCESCHEDULELIST, manufacturingMaintenanceScheduleList);
    }

    @SuppressWarnings("unchecked")
    public List<OperationMachine> getManufacturingOperationMachineList() {
      return (List<OperationMachine>) get(PROPERTY_MANUFACTURINGOPERATIONMACHINELIST);
    }

    public void setManufacturingOperationMachineList(List<OperationMachine> manufacturingOperationMachineList) {
        set(PROPERTY_MANUFACTURINGOPERATIONMACHINELIST, manufacturingOperationMachineList);
    }

    @SuppressWarnings("unchecked")
    public List<ProductionRunMachine> getManufacturingProductionRunMachineList() {
      return (List<ProductionRunMachine>) get(PROPERTY_MANUFACTURINGPRODUCTIONRUNMACHINELIST);
    }

    public void setManufacturingProductionRunMachineList(List<ProductionRunMachine> manufacturingProductionRunMachineList) {
        set(PROPERTY_MANUFACTURINGPRODUCTIONRUNMACHINELIST, manufacturingProductionRunMachineList);
    }

}
