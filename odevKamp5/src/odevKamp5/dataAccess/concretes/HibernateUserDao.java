package odevKamp5.dataAccess.concretes;

import java.util.List;

import odevKamp5.dataAccess.abstracts.UserDao;
import odevKamp5.entities.concretes.User;

public class HibernateUserDao extends HibernateEntityRepositoryBase<User> implements UserDao {

}
