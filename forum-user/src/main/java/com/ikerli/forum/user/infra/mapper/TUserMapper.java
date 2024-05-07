package com.ikerli.forum.user.infra.mapper;

import com.ikerli.forum.user.domain.entity.TUser;
import com.ikerli.forum.user.domain.entity.TUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Tue May 07 15:09:07 CST 2024
     */
    long countByExample(TUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Tue May 07 15:09:07 CST 2024
     */
    int deleteByExample(TUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Tue May 07 15:09:07 CST 2024
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Tue May 07 15:09:07 CST 2024
     */
    int insert(TUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Tue May 07 15:09:07 CST 2024
     */
    int insertSelective(TUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Tue May 07 15:09:07 CST 2024
     */
    List<TUser> selectByExample(TUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Tue May 07 15:09:07 CST 2024
     */
    TUser selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Tue May 07 15:09:07 CST 2024
     */
    int updateByExampleSelective(@Param("record") TUser record, @Param("example") TUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Tue May 07 15:09:07 CST 2024
     */
    int updateByExample(@Param("record") TUser record, @Param("example") TUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Tue May 07 15:09:07 CST 2024
     */
    int updateByPrimaryKeySelective(TUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Tue May 07 15:09:07 CST 2024
     */
    int updateByPrimaryKey(TUser record);
}