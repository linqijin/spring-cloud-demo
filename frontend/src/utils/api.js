// 后端接口基础路径
// export const BASE_API_URL = 'https://t.itmuch.com';
export const BASE_API_URL = 'http://172.20.8.16:5566';
export const USER_CENTER_URL = BASE_API_URL + '/user-center'
export const CONTENT_CENTER_URL = BASE_API_URL + '/content-center'
export const BONUS_CENTER_URL = BASE_API_URL + '/bonus-center'

// 登录地址
export const LOGIN_URL = USER_CENTER_URL + '/login/miniapp';
// 公告接口地址
export const NOTICE_URL = CONTENT_CENTER_URL + '/notices/newest';
// share
export const SHARE_POST_URL = CONTENT_CENTER_URL + '/posts/shares';
// 预览地址
export const SHARE_POST_PREVIEW_URL = CONTENT_CENTER_URL + '/preview';
// 用户主地址
// export const USER_URL = BASE_API_URL + USER_CENTER_URL + '/users';
// 签到地址
export const SIGN_URL = BONUS_CENTER_URL + '/sign';
// 转发地址npm 
export const FORWARD_URL = BONUS_CENTER_URL + '/forward';
// 我的积分明细
export const USER_BONUS_LOG_URL = BONUS_CENTER_URL + '/bonus-logs';
// 我的投稿
export const USER_MY_CONTRIBUTION_URL = CONTENT_CENTER_URL + '/contributions';
// 当前登录人员的个人信息
export const USER_URL_ME = USER_CENTER_URL + '/me';
// 完善个人信息
export const USER_URL_COMPLETE = USER_CENTER_URL + '/complete';
// 投稿
export const SHARE_POST_CONTRIBUTE_URL = CONTENT_CENTER_URL + '/contribute';

export const TOKEN_URL = 'https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=wxf6800ba517d9ded2&secret=c88e5a288f146086329e28d3a609f097';
