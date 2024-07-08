package dao;

public class Test {
    public static void main(String[] args) {

        String dbType = "Oracle";
        UserInfo userInfo = new UserInfo("100", "asd123", "이순신");

        UserInfoDao userInfoDao = null;
        if (dbType.equals("Oracle")) {
            userInfoDao = new UserInfoOracleDao();
        } else if (dbType.equals("Mysql")) {
            userInfoDao = new UserInfoMysqlDao();
        } else if (dbType.equals("Mongo")) {
            userInfoDao = new UserInfoMongoDao();
        } else {
            System.out.println("오류");
        }

        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);

    }
}
