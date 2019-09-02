package com.wms.dao.auto;

import com.wms.dao.example.SkuTExample;
import com.wms.entity.auto.SkuTEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ISkuTDao {
    long countByExample(SkuTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SKU_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int deleteWithVersionByExample(@Param("version") Long version, @Param("example") SkuTExample example);

    int deleteByExample(SkuTExample example);

    int insert(SkuTEntity record);

    int insertSelective(SkuTEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SKU_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SkuTEntity selectOneByExample(SkuTExample example);

    List<SkuTEntity> selectByExample(SkuTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SKU_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByExample(@Param("version") Long version, @Param("record") SkuTEntity record, @Param("example") SkuTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SKU_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByExampleSelective(@Param("version") Long version, @Param("record") SkuTEntity record, @Param("example") SkuTExample example);

    int updateByExampleSelective(@Param("record") SkuTEntity record, @Param("example") SkuTExample example);

    int updateByExample(@Param("record") SkuTEntity record, @Param("example") SkuTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SKU_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") SkuTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SKU_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteWithVersionByExample(@Param("version") Long version, @Param("example") SkuTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SKU_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Long skuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SKU_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteWithVersionByPrimaryKey(@Param("version") Long version, @Param("key") Long skuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SKU_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SkuTEntity selectByPrimaryKeyWithLogicalDelete(@Param("skuId") Long skuId, @Param("andLogicalDeleted") boolean andLogicalDeleted);
}