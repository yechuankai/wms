package com.wms.dao.auto;

import com.wms.dao.example.SysUserOnlineTExample;
import com.wms.entity.auto.SysUserOnlineTEntity;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ISysUserOnlineTDao {
    long countByExample(SysUserOnlineTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_USER_ONLINE_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int deleteWithVersionByExample(@Param("version") Long version, @Param("example") SysUserOnlineTExample example);

    int deleteByExample(SysUserOnlineTExample example);

    int insert(SysUserOnlineTEntity record);

    int insertSelective(SysUserOnlineTEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_USER_ONLINE_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SysUserOnlineTEntity selectOneByExample(SysUserOnlineTExample example);

    List<SysUserOnlineTEntity> selectByExample(SysUserOnlineTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_USER_ONLINE_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByExample(@Param("version") Long version, @Param("record") SysUserOnlineTEntity record, @Param("example") SysUserOnlineTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_USER_ONLINE_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int updateWithVersionByExampleSelective(@Param("version") Long version, @Param("record") SysUserOnlineTEntity record, @Param("example") SysUserOnlineTExample example);

    int updateByExampleSelective(@Param("record") SysUserOnlineTEntity record, @Param("example") SysUserOnlineTExample example);

    int updateByExample(@Param("record") SysUserOnlineTEntity record, @Param("example") SysUserOnlineTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_USER_ONLINE_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") SysUserOnlineTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_USER_ONLINE_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteWithVersionByExample(@Param("version") Long version, @Param("example") SysUserOnlineTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_USER_ONLINE_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(String sessionid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_USER_ONLINE_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteWithVersionByPrimaryKey(@Param("version") Long version, @Param("key") String sessionid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_USER_ONLINE_T
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    SysUserOnlineTEntity selectByPrimaryKeyWithLogicalDelete(@Param("sessionid") String sessionid, @Param("andLogicalDeleted") boolean andLogicalDeleted);
}