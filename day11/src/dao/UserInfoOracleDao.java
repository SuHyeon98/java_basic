package dao;

public class UserInfoOracleDao implements UserInfoDao{
    @Override
    public void insertUserInfo(UserInfo userinfo) {
        System.out.println("오라클 DB에 데이터 추가");
    }

    @Override
    public void updateUserInfo(UserInfo userinfo) {
        System.out.println("오라클 DB에 데이터 수정");
    }

    @Override
    public void deleteUserInfo(UserInfo userinfo) {
        System.out.println("오라클 DB에 데이터 삭제");
    }
}
