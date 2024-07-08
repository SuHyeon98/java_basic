package dao;

public class UserInfoMongoDao implements UserInfoDao{
    @Override
    public void insertUserInfo(UserInfo userinfo) {
        System.out.println("Mongo DB에 데이터 추가");
    }

    @Override
    public void updateUserInfo(UserInfo userinfo) {
        System.out.println("Mongo DB에 데이터 수정");
    }

    @Override
    public void deleteUserInfo(UserInfo userinfo) {
        System.out.println("Mongo DB에 데이터 삭제");
    }
}
