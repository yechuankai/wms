package com.wms.dao.auto;

import com.wms.dao.example.StatusHistoryTExample;
import com.wms.entity.auto.StatusHistoryTEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IStatusHistoryTDao {
    long countByExample(StatusHistoryTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STATUS_HISTORY_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int deleteWithVersionByExample(@Param("version") Long version, @Param("example") StatusHistoryTExample example);

    int deleteByExample(StatusHistoryTExample example);

    int insert(StatusHistoryTEntity record);

    int insertSelective(StatusHistoryTEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STATUS_HISTORY_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    StatusHistoryTEntity selectOneByExample(StatusHistoryTExample example);

    List<StatusHistoryTEntity> selectByExample(StatusHistoryTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STATUS_HISTORY_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByExample(@Param("version") Long version, @Param("record") StatusHistoryTEntity record, @Param("example") StatusHistoryTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STATUS_HISTORY_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByExampleSelective(@Param("version") Long version, @Param("record") StatusHistoryTEntity record, @Param("example") StatusHistoryTExample example);

    int updateByExampleSelective(@Param("record") StatusHistoryTEntity record, @Param("example") StatusHistoryTExample example);

    int updateByExample(@Param("record") StatusHistoryTEntity record, @Param("example") StatusHistoryTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STATUS_HISTORY_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") StatusHistoryTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STATUS_HISTORY_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteWithVersionByExample(@Param("version") Long version, @Param("example") StatusHistoryTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STATUS_HISTORY_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Long historyId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STATUS_HISTORY_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteWithVersionByPrimaryKey(@Param("version") Long version, @Param("key") Long historyId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STATUS_HISTORY_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    StatusHistoryTEntity selectByPrimaryKeyWithLogicalDelete(@Param("historyId") Long historyId, @Param("andLogicalDeleted") boolean andLogicalDeleted);
}