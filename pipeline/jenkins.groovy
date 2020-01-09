env.APP_CHINESE_NAME = "测试项目"
env.APP_ENGLISH_NAME = "demo_project"
env.IS_USE_CODE_CHECK = isOnline()


def isOnline() {
    if ( "${params.BRANCH}" ==  "master") {
        return true
    } else {
        return false
    }


}