package com.wms.dao.auto;

import com.wms.dao.example.PutawayStrategyDetailTExample;
import com.wms.entity.auto.PutawayStrategyDetailTEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IPutawayStrategyDetailTDao {
    long countByExample(PutawayStrategyDetailTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUTAWAY_STRATEGY_DETAIL_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int deleteWithVersionByExample(@Param("version") Long version, @Param("example") PutawayStrategyDetailTExample example);

    int deleteByExample(PutawayStrategyDetailTExample example);

    int insert(PutawayStrategyDetailTEntity record);

    int insertSelective(PutawayStrategyDetailTEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUTAWAY_STRATEGY_DETAIL_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    PutawayStrategyDetailTEntity selectOneByExample(PutawayStrategyDetailTExample example);

    List<PutawayStrategyDetailTEntity> selectByExample(PutawayStrategyDetailTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUTAWAY_STRATEGY_DETAIL_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByExample(@Param("version") Long version, @Param("record") PutawayStrategyDetailTEntity record, @Param("example") PutawayStrategyDetailTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUTAWAY_STRATEGY_DETAIL_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByExampleSelective(@Param("version") Long version, @Param("record") PutawayStrategyDetailTEntity record, @Param("example") PutawayStrategyDetailTExample example);

    int updateByExampleSelective(@Param("record") PutawayStrategyDetailTEntity record, @Param("example") PutawayStrategyDetailTExample example);

    int updateByExample(@Param("record") PutawayStrategyDetailTEntity record, @Param("example") PutawayStrategyDetailTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUTAWAY_STRATEGY_DETAIL_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") PutawayStrategyDetailTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUTAWAY_STRATEGY_DETAIL_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteWithVersionByExample(@Param("version") Long version, @Param("example") PutawayStrategyDetailTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUTAWAY_STRATEGY_DETAIL_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Long putawayStrategyDetailId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUTAWAY_STRATEGY_DETAIL_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteWithVersionByPrimaryKey(@Param("version") Long version, @Param("key") Long putawayStrategyDetailId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUTAWAY_STRATEGY_DETAIL_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    PutawayStrategyDetailTEntity selectByPrimaryKeyWithLogicalDelete(@Param("putawayStrategyDetailId") Long putawayStrategyDetailId, @Param("andLogicalDeleted") boolean andLogicalDeleted);
}