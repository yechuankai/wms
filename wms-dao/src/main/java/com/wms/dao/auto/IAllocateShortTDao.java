package com.wms.dao.auto;

import com.wms.dao.example.AllocateShortTExample;
import com.wms.entity.auto.AllocateShortTEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IAllocateShortTDao {
    long countByExample(AllocateShortTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ALLOCATE_SHORT_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int deleteWithVersionByExample(@Param("version") Long version, @Param("example") AllocateShortTExample example);

    int deleteByExample(AllocateShortTExample example);

    int insert(AllocateShortTEntity record);

    int insertSelective(AllocateShortTEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ALLOCATE_SHORT_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    AllocateShortTEntity selectOneByExample(AllocateShortTExample example);

    List<AllocateShortTEntity> selectByExample(AllocateShortTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ALLOCATE_SHORT_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByExample(@Param("version") Long version, @Param("record") AllocateShortTEntity record, @Param("example") AllocateShortTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ALLOCATE_SHORT_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByExampleSelective(@Param("version") Long version, @Param("record") AllocateShortTEntity record, @Param("example") AllocateShortTExample example);

    int updateByExampleSelective(@Param("record") AllocateShortTEntity record, @Param("example") AllocateShortTExample example);

    int updateByExample(@Param("record") AllocateShortTEntity record, @Param("example") AllocateShortTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ALLOCATE_SHORT_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") AllocateShortTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ALLOCATE_SHORT_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteWithVersionByExample(@Param("version") Long version, @Param("example") AllocateShortTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ALLOCATE_SHORT_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Long allocateShortId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ALLOCATE_SHORT_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteWithVersionByPrimaryKey(@Param("version") Long version, @Param("key") Long allocateShortId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ALLOCATE_SHORT_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    AllocateShortTEntity selectByPrimaryKeyWithLogicalDelete(@Param("allocateShortId") Long allocateShortId, @Param("andLogicalDeleted") boolean andLogicalDeleted);
}