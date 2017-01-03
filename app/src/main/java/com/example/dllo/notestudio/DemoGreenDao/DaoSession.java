package com.example.dllo.notestudio.DemoGreenDao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.example.dllo.notestudio.DemoGreenDao.BeanPerson;

import com.example.dllo.notestudio.DemoGreenDao.BeanPersonDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig beanPersonDaoConfig;

    private final BeanPersonDao beanPersonDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        beanPersonDaoConfig = daoConfigMap.get(BeanPersonDao.class).clone();
        beanPersonDaoConfig.initIdentityScope(type);

        beanPersonDao = new BeanPersonDao(beanPersonDaoConfig, this);

        registerDao(BeanPerson.class, beanPersonDao);
    }
    
    public void clear() {
        beanPersonDaoConfig.clearIdentityScope();
    }

    public BeanPersonDao getBeanPersonDao() {
        return beanPersonDao;
    }

}
