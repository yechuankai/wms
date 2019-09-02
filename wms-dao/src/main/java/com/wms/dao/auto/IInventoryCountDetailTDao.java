package com.wms.dao.auto;

import com.wms.dao.example.InventoryCountDetailTExample;
import com.wms.entity.auto.InventoryCountDetailTEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IInventoryCountDetailTDao {
    long countByExample(InventoryCountDetailTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INVENTORY_COUNT_DETAIL_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int deleteWithVersionByExample(@Param("version") Long version, @Param("example") InventoryCountDetailTExample example);

    int deleteByExample(InventoryCountDetailTExample example);

    int insert(InventoryCountDetailTEntity record);

    int insertSelective(InventoryCountDetailTEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INVENTORY_COUNT_DETAIL_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    InventoryCountDetailTEntity selectOneByExample(InventoryCountDetailTExample example);

    List<InventoryCountDetailTEntity> selectByExample(InventoryCountDetailTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INVENTORY_COUNT_DETAIL_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByExample(@Param("version") Long version, @Param("record") InventoryCountDetailTEntity record, @Param("example") InventoryCountDetailTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INVENTORY_COUNT_DETAIL_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByExampleSelective(@Param("version") Long version, @Param("record") InventoryCountDetailTEntity record, @Param("example") InventoryCountDetailTExample example);

    int updateByExampleSelective(@Param("record") InventoryCountDetailTEntity record, @Param("example") InventoryCountDetailTExample example);

    int updateByExample(@Param("record") InventoryCountDetailTEntity record, @Param("example") InventoryCountDetailTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INVENTORY_COUNT_DETAIL_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") InventoryCountDetailTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INVENTORY_COUNT_DETAIL_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteWithVersionByExample(@Param("version") Long version, @Param("example") InventoryCountDetailTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INVENTORY_COUNT_DETAIL_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Long inventoryCountDetailId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INVENTORY_COUNT_DETAIL_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteWithVersionByPrimaryKey(@Param("version") Long version, @Param("key") Long inventoryCountDetailId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INVENTORY_COUNT_DETAIL_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    InventoryCountDetailTEntity selectByPrimaryKeyWithLogicalDelete(@Param("inventoryCountDetailId") Long inventoryCountDetailId, @Param("andLogicalDeleted") boolean andLogicalDeleted);
}