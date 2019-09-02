package com.wms.dao.auto;

import com.wms.dao.example.LotAttributeTExample;
import com.wms.entity.auto.LotAttributeTEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ILotAttributeTDao {
    long countByExample(LotAttributeTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LOT_ATTRIBUTE_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int deleteWithVersionByExample(@Param("version") Long version, @Param("example") LotAttributeTExample example);

    int deleteByExample(LotAttributeTExample example);

    int insert(LotAttributeTEntity record);

    int insertSelective(LotAttributeTEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LOT_ATTRIBUTE_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LotAttributeTEntity selectOneByExample(LotAttributeTExample example);

    List<LotAttributeTEntity> selectByExample(LotAttributeTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LOT_ATTRIBUTE_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByExample(@Param("version") Long version, @Param("record") LotAttributeTEntity record, @Param("example") LotAttributeTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LOT_ATTRIBUTE_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByExampleSelective(@Param("version") Long version, @Param("record") LotAttributeTEntity record, @Param("example") LotAttributeTExample example);

    int updateByExampleSelective(@Param("record") LotAttributeTEntity record, @Param("example") LotAttributeTExample example);

    int updateByExample(@Param("record") LotAttributeTEntity record, @Param("example") LotAttributeTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LOT_ATTRIBUTE_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") LotAttributeTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LOT_ATTRIBUTE_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteWithVersionByExample(@Param("version") Long version, @Param("example") LotAttributeTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LOT_ATTRIBUTE_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Long lotAttributeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LOT_ATTRIBUTE_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteWithVersionByPrimaryKey(@Param("version") Long version, @Param("key") Long lotAttributeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LOT_ATTRIBUTE_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LotAttributeTEntity selectByPrimaryKeyWithLogicalDelete(@Param("lotAttributeId") Long lotAttributeId, @Param("andLogicalDeleted") boolean andLogicalDeleted);
}