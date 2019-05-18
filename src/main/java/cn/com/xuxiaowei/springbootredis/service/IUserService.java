package cn.com.xuxiaowei.springbootredis.service;

import cn.com.xuxiaowei.springbootredis.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户表（测试） 服务类
 * </p>
 *
 * @author 徐晓伟
 * @since 2019-05-18
 */
public interface IUserService extends IService<User> {

    /**
     * 插入一条记录（选择字段，策略插入，Redis）
     * <p>
     * 无论如何都插入到数据并保存到Redis
     * <p>
     *
     * @param entity 要插入的实体对象
     * @return 实体对象（插入结果返回了实体类主键）
     */
    User saveCachePut(User entity);

    /**
     * <p>
     * TableId 注解存在更新记录，否插入一条记录，Redis
     * </p>
     * 无论如何都 插入/更新 到数据并保存到Redis
     * <p>
     *
     * @param entity 实体对象
     * @return 返回 插入/更新 到数据库/Redis的实体类对象（含主键）
     */
    User saveOrUpdateCachePut(User entity);
}
