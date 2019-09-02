package com.wms.dao.auto;

import com.wms.dao.example.SysMonitorLogTExample;
import com.wms.entity.auto.SysMonitorLogTEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ISysMonitorLogTDao {
    long countByExample(SysMonitorLogTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_MONITOR_LOG_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int deleteWithVersionByExample(@Param("version") Long version, @Param("example") SysMonitorLogTExample example);

    int deleteByExample(SysMonitorLogTExample example);

    int insert(SysMonitorLogTEntity record);

    int insertSelective(SysMonitorLogTEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_MONITOR_LOG_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SysMonitorLogTEntity selectOneByExample(SysMonitorLogTExample example);

    List<SysMonitorLogTEntity> selectByExample(SysMonitorLogTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_MONITOR_LOG_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByExample(@Param("version") Long version, @Param("record") SysMonitorLogTEntity record, @Param("example") SysMonitorLogTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_MONITOR_LOG_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByExampleSelective(@Param("version") Long version, @Param("record") SysMonitorLogTEntity record, @Param("example") SysMonitorLogTExample example);

    int updateByExampleSelective(@Param("record") SysMonitorLogTEntity record, @Param("example") SysMonitorLogTExample example);

    int updateByExample(@Param("record") SysMonitorLogTEntity record, @Param("example") SysMonitorLogTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_MONITOR_LOG_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") SysMonitorLogTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_MONITOR_LOG_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteWithVersionByExample(@Param("version") Long version, @Param("example") SysMonitorLogTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_MONITOR_LOG_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Long monitorLogId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_MONITOR_LOG_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteWithVersionByPrimaryKey(@Param("version") Long version, @Param("key") Long monitorLogId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_MONITOR_LOG_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SysMonitorLogTEntity selectByPrimaryKeyWithLogicalDelete(@Param("monitorLogId") Long monitorLogId, @Param("andLogicalDeleted") boolean andLogicalDeleted);
}