package com.wms.entity.auto;

import com.wms.entity.BaseEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class InventoryCountHeaderTEntity extends BaseEntity {
    private Long inventoryCountHeaderId;

    private String countNumber;

    private Long inventoryCountRequestId;

    private String type;

    private String replayFlag;

    private Long parentCountHeaderId;

    private String parentCountNumber;

    private String status;

    private String remark;

    private Long companyId;

    private Long warehouseId;

    private String delFlag;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    private Long updateVersion;

    private String description;

    public Long getInventoryCountHeaderId() {
        return inventoryCountHeaderId;
    }

    public void setInventoryCountHeaderId(Long inventoryCountHeaderId) {
        this.inventoryCountHeaderId = inventoryCountHeaderId;
    }

    public String getCountNumber() {
        return countNumber;
    }

    public void setCountNumber(String countNumber) {
        this.countNumber = countNumber == null ? null : countNumber.trim();
    }

    public Long getInventoryCountRequestId() {
        return inventoryCountRequestId;
    }

    public void setInventoryCountRequestId(Long inventoryCountRequestId) {
        this.inventoryCountRequestId = inventoryCountRequestId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getReplayFlag() {
        return replayFlag;
    }

    public void setReplayFlag(String replayFlag) {
        this.replayFlag = replayFlag == null ? null : replayFlag.trim();
    }

    public Long getParentCountHeaderId() {
        return parentCountHeaderId;
    }

    public void setParentCountHeaderId(Long parentCountHeaderId) {
        this.parentCountHeaderId = parentCountHeaderId;
    }

    public String getParentCountNumber() {
        return parentCountNumber;
    }

    public void setParentCountNumber(String parentCountNumber) {
        this.parentCountNumber = parentCountNumber == null ? null : parentCountNumber.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INVENTORY_COUNT_HEADER_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public void andLogicalDeleted(boolean deleted) {
        setDelFlag(deleted ? DelFlag.IS_DELETED.value() : DelFlag.NOT_DELETED.value());
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateVersion() {
        return updateVersion;
    }

    public void setUpdateVersion(Long updateVersion) {
        this.updateVersion = updateVersion;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", inventoryCountHeaderId=").append(inventoryCountHeaderId);
        sb.append(", countNumber=").append(countNumber);
        sb.append(", inventoryCountRequestId=").append(inventoryCountRequestId);
        sb.append(", type=").append(type);
        sb.append(", replayFlag=").append(replayFlag);
        sb.append(", parentCountHeaderId=").append(parentCountHeaderId);
        sb.append(", parentCountNumber=").append(parentCountNumber);
        sb.append(", status=").append(status);
        sb.append(", remark=").append(remark);
        sb.append(", companyId=").append(companyId);
        sb.append(", warehouseId=").append(warehouseId);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateVersion=").append(updateVersion);
        sb.append(", description=").append(description);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        InventoryCountHeaderTEntity other = (InventoryCountHeaderTEntity) that;
        return (this.getInventoryCountHeaderId() == null ? other.getInventoryCountHeaderId() == null : this.getInventoryCountHeaderId().equals(other.getInventoryCountHeaderId()))
            && (this.getCountNumber() == null ? other.getCountNumber() == null : this.getCountNumber().equals(other.getCountNumber()))
            && (this.getInventoryCountRequestId() == null ? other.getInventoryCountRequestId() == null : this.getInventoryCountRequestId().equals(other.getInventoryCountRequestId()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getReplayFlag() == null ? other.getReplayFlag() == null : this.getReplayFlag().equals(other.getReplayFlag()))
            && (this.getParentCountHeaderId() == null ? other.getParentCountHeaderId() == null : this.getParentCountHeaderId().equals(other.getParentCountHeaderId()))
            && (this.getParentCountNumber() == null ? other.getParentCountNumber() == null : this.getParentCountNumber().equals(other.getParentCountNumber()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getWarehouseId() == null ? other.getWarehouseId() == null : this.getWarehouseId().equals(other.getWarehouseId()))
            && (this.getDelFlag() == null ? other.getDelFlag() == null : this.getDelFlag().equals(other.getDelFlag()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getUpdateVersion() == null ? other.getUpdateVersion() == null : this.getUpdateVersion().equals(other.getUpdateVersion()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getInventoryCountHeaderId() == null) ? 0 : getInventoryCountHeaderId().hashCode());
        result = prime * result + ((getCountNumber() == null) ? 0 : getCountNumber().hashCode());
        result = prime * result + ((getInventoryCountRequestId() == null) ? 0 : getInventoryCountRequestId().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getReplayFlag() == null) ? 0 : getReplayFlag().hashCode());
        result = prime * result + ((getParentCountHeaderId() == null) ? 0 : getParentCountHeaderId().hashCode());
        result = prime * result + ((getParentCountNumber() == null) ? 0 : getParentCountNumber().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getWarehouseId() == null) ? 0 : getWarehouseId().hashCode());
        result = prime * result + ((getDelFlag() == null) ? 0 : getDelFlag().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getUpdateVersion() == null) ? 0 : getUpdateVersion().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INVENTORY_COUNT_HEADER_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static InventoryCountHeaderTEntity.Builder builder() {
        return new InventoryCountHeaderTEntity.Builder();
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table INVENTORY_COUNT_HEADER_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static class Builder {
        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table INVENTORY_COUNT_HEADER_T
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private InventoryCountHeaderTEntity obj;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table INVENTORY_COUNT_HEADER_T
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder() {
            this.obj = new InventoryCountHeaderTEntity();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column INVENTORY_COUNT_HEADER_T.INVENTORY_COUNT_HEADER_ID
         *
         * @param inventoryCountHeaderId the value for INVENTORY_COUNT_HEADER_T.INVENTORY_COUNT_HEADER_ID
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder inventoryCountHeaderId(Long inventoryCountHeaderId) {
            obj.setInventoryCountHeaderId(inventoryCountHeaderId);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column INVENTORY_COUNT_HEADER_T.COUNT_NUMBER
         *
         * @param countNumber the value for INVENTORY_COUNT_HEADER_T.COUNT_NUMBER
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder countNumber(String countNumber) {
            obj.setCountNumber(countNumber);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column INVENTORY_COUNT_HEADER_T.INVENTORY_COUNT_REQUEST_ID
         *
         * @param inventoryCountRequestId the value for INVENTORY_COUNT_HEADER_T.INVENTORY_COUNT_REQUEST_ID
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder inventoryCountRequestId(Long inventoryCountRequestId) {
            obj.setInventoryCountRequestId(inventoryCountRequestId);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column INVENTORY_COUNT_HEADER_T.TYPE
         *
         * @param type the value for INVENTORY_COUNT_HEADER_T.TYPE
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder type(String type) {
            obj.setType(type);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column INVENTORY_COUNT_HEADER_T.REPLAY_FLAG
         *
         * @param replayFlag the value for INVENTORY_COUNT_HEADER_T.REPLAY_FLAG
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder replayFlag(String replayFlag) {
            obj.setReplayFlag(replayFlag);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column INVENTORY_COUNT_HEADER_T.PARENT_COUNT_HEADER_ID
         *
         * @param parentCountHeaderId the value for INVENTORY_COUNT_HEADER_T.PARENT_COUNT_HEADER_ID
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder parentCountHeaderId(Long parentCountHeaderId) {
            obj.setParentCountHeaderId(parentCountHeaderId);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column INVENTORY_COUNT_HEADER_T.PARENT_COUNT_NUMBER
         *
         * @param parentCountNumber the value for INVENTORY_COUNT_HEADER_T.PARENT_COUNT_NUMBER
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder parentCountNumber(String parentCountNumber) {
            obj.setParentCountNumber(parentCountNumber);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column INVENTORY_COUNT_HEADER_T.STATUS
         *
         * @param status the value for INVENTORY_COUNT_HEADER_T.STATUS
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder status(String status) {
            obj.setStatus(status);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column INVENTORY_COUNT_HEADER_T.REMARK
         *
         * @param remark the value for INVENTORY_COUNT_HEADER_T.REMARK
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder remark(String remark) {
            obj.setRemark(remark);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column INVENTORY_COUNT_HEADER_T.COMPANY_ID
         *
         * @param companyId the value for INVENTORY_COUNT_HEADER_T.COMPANY_ID
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder companyId(Long companyId) {
            obj.setCompanyId(companyId);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column INVENTORY_COUNT_HEADER_T.WAREHOUSE_ID
         *
         * @param warehouseId the value for INVENTORY_COUNT_HEADER_T.WAREHOUSE_ID
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder warehouseId(Long warehouseId) {
            obj.setWarehouseId(warehouseId);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column INVENTORY_COUNT_HEADER_T.DEL_FLAG
         *
         * @param delFlag the value for INVENTORY_COUNT_HEADER_T.DEL_FLAG
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder delFlag(String delFlag) {
            obj.setDelFlag(delFlag);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column INVENTORY_COUNT_HEADER_T.CREATE_BY
         *
         * @param createBy the value for INVENTORY_COUNT_HEADER_T.CREATE_BY
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder createBy(String createBy) {
            obj.setCreateBy(createBy);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column INVENTORY_COUNT_HEADER_T.CREATE_TIME
         *
         * @param createTime the value for INVENTORY_COUNT_HEADER_T.CREATE_TIME
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder createTime(Date createTime) {
            obj.setCreateTime(createTime);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column INVENTORY_COUNT_HEADER_T.UPDATE_BY
         *
         * @param updateBy the value for INVENTORY_COUNT_HEADER_T.UPDATE_BY
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder updateBy(String updateBy) {
            obj.setUpdateBy(updateBy);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column INVENTORY_COUNT_HEADER_T.UPDATE_TIME
         *
         * @param updateTime the value for INVENTORY_COUNT_HEADER_T.UPDATE_TIME
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder updateTime(Date updateTime) {
            obj.setUpdateTime(updateTime);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column INVENTORY_COUNT_HEADER_T.UPDATE_VERSION
         *
         * @param updateVersion the value for INVENTORY_COUNT_HEADER_T.UPDATE_VERSION
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder updateVersion(Long updateVersion) {
            obj.setUpdateVersion(updateVersion);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column INVENTORY_COUNT_HEADER_T.DESCRIPTION
         *
         * @param description the value for INVENTORY_COUNT_HEADER_T.DESCRIPTION
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder description(String description) {
            obj.setDescription(description);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table INVENTORY_COUNT_HEADER_T
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public InventoryCountHeaderTEntity build() {
            return this.obj;
        }
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table INVENTORY_COUNT_HEADER_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum DelFlag {
        NOT_DELETED(new String("N"), "未删除"),
        IS_DELETED(new String("Y"), "已删除");

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table INVENTORY_COUNT_HEADER_T
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String value;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table INVENTORY_COUNT_HEADER_T
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String name;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table INVENTORY_COUNT_HEADER_T
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        DelFlag(String value, String name) {
            this.value = value;
            this.name = name;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table INVENTORY_COUNT_HEADER_T
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.value;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table INVENTORY_COUNT_HEADER_T
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.value;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table INVENTORY_COUNT_HEADER_T
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getName() {
            return this.name;
        }
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table INVENTORY_COUNT_HEADER_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        inventoryCountHeaderId("INVENTORY_COUNT_HEADER_ID", "inventoryCountHeaderId", "DECIMAL", false),
        countNumber("COUNT_NUMBER", "countNumber", "VARCHAR", false),
        inventoryCountRequestId("INVENTORY_COUNT_REQUEST_ID", "inventoryCountRequestId", "DECIMAL", false),
        type("TYPE", "type", "VARCHAR", true),
        replayFlag("REPLAY_FLAG", "replayFlag", "CHAR", false),
        parentCountHeaderId("PARENT_COUNT_HEADER_ID", "parentCountHeaderId", "DECIMAL", false),
        parentCountNumber("PARENT_COUNT_NUMBER", "parentCountNumber", "VARCHAR", false),
        status("STATUS", "status", "VARCHAR", true),
        remark("REMARK", "remark", "VARCHAR", false),
        companyId("COMPANY_ID", "companyId", "DECIMAL", false),
        warehouseId("WAREHOUSE_ID", "warehouseId", "DECIMAL", false),
        delFlag("DEL_FLAG", "delFlag", "CHAR", false),
        createBy("CREATE_BY", "createBy", "VARCHAR", false),
        createTime("CREATE_TIME", "createTime", "TIMESTAMP", false),
        updateBy("UPDATE_BY", "updateBy", "VARCHAR", false),
        updateTime("UPDATE_TIME", "updateTime", "TIMESTAMP", false),
        updateVersion("UPDATE_VERSION", "updateVersion", "DECIMAL", false),
        description("DESCRIPTION", "description", "VARCHAR", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table INVENTORY_COUNT_HEADER_T
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String BEGINNING_DELIMITER = "";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table INVENTORY_COUNT_HEADER_T
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String ENDING_DELIMITER = "";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table INVENTORY_COUNT_HEADER_T
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table INVENTORY_COUNT_HEADER_T
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table INVENTORY_COUNT_HEADER_T
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table INVENTORY_COUNT_HEADER_T
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table INVENTORY_COUNT_HEADER_T
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table INVENTORY_COUNT_HEADER_T
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table INVENTORY_COUNT_HEADER_T
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table INVENTORY_COUNT_HEADER_T
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table INVENTORY_COUNT_HEADER_T
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table INVENTORY_COUNT_HEADER_T
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table INVENTORY_COUNT_HEADER_T
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table INVENTORY_COUNT_HEADER_T
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table INVENTORY_COUNT_HEADER_T
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table INVENTORY_COUNT_HEADER_T
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}