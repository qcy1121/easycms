package in.zamo.mappers;

import in.zamo.model.Account;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;


/**
 * 
 * @author fuxin
 *
 */

@Repository
public interface AccountMapper{
	@Delete("delete from Account where id=#{id}")
	int deleteAccount(int id);
	
	@Insert("insert into Account(username,password) values(#{username},#{password})")
	void createAccount(Account account);
	@Update("update Account set username=#{username}, password=#{password} where id=#{id}")
	void updateAccount(Account account);
	
	@Select("select * from Account where id=#{id}")
	Account findAccountById(int id);
	
	@Select("select * from Account")
	List<Account> findAccountAll();
	
	@Select("select count(*) from Account")
	int findAccountTotal();
}