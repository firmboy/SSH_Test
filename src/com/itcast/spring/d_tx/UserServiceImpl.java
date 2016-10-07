package com.itcast.spring.d_tx;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

@Transactional
public class UserServiceImpl implements UserService {

	private UserDao dao;

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	private TransactionTemplate transactionTemplate;

	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

	/**
	 * 声明事务方式
	 */
	public void pay(User out, User in, double money) {

		dao.outMoney(out, money);
		int num = 1 / 0;
		dao.inMoney(in, money);

	}

	/**
	 * 手动编程模式
	 */
	public void pay1(final User out, final User in, final double money) {

		transactionTemplate.execute(new TransactionCallback<User>() {
			@Override
			public User doInTransaction(TransactionStatus arg0) {
				dao.outMoney(out, money);
				int num = 1 / 0;
				dao.inMoney(in, money);
				return null;
			}
		});
	}

	public void save(User user) {
		dao.save(user);
	}

}
