require("../../../common/manifest.js");
require("../../../common/vendor.js");
global.webpackJsonp([8],{"+9II":function(t,e,a){"use strict";var n=a("51hf"),s=a("j6jd");var r=function(t){a("FBYX")},i=a("ybqe")(n.a,s.a,r,null,null);e.a=i.exports},"51hf":function(t,e,a){"use strict";var n=a("Xxa5"),s=a.n(n),r=a("exGp"),i=a.n(r),c=a("vLgD"),o=a("VsUZ"),u=a("L/cW"),v=a("EFqf"),d=a.n(v);e.a={components:{wxParse:u.a},data:function(){return{share:"",id:"",summary:""}},methods:{preview:function(t,e){},navigate:function(t,e){},fetchSharePostById:function(){var t=this;return i()(s.a.mark(function e(){var a,n;return s.a.wrap(function(e){for(;;)switch(e.prev=e.next){case 0:return a=t.id,e.next=3,Object(c.a)(o.g+"/"+a,"GET",{});case 3:t.share=e.sent,n=t.share.summary,console.log("summary",n),t.summary=d()(n);case 7:case"end":return e.stop()}},e,t)}))()},buy:function(){var t=this;return i()(s.a.mark(function e(){var a;return s.a.wrap(function(e){for(;;)switch(e.prev=e.next){case 0:return a=t.id,e.next=3,Object(c.a)(o.g+"/buy/"+a,"GET",{});case 3:wx.navigateTo({url:"/pages/share/buy-success/main?id="+a});case 4:case"end":return e.stop()}},e,t)}))()}},onLoad:function(){this.id=this.$root.$mp.query.id,console.log("detail",this.id),this.fetchSharePostById()}}},FBYX:function(t,e){},Tw9l:function(t,e,a){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var n=a("5nAL"),s=a.n(n),r=a("+9II");new s.a(r.a).$mount()},j6jd:function(t,e,a){"use strict";var n={render:function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"detail-wrapper"},[a("div",{staticClass:"detail-header"},[a("h1",{staticClass:"title"},[t._v(t._s(t.share.title))]),t._v(" "),a("div",{staticClass:"intro"},[a("div",{staticClass:"author"},[t._v("作者："+t._s(t.share.author))]),t._v(" "),a("div",{staticClass:"count"},[t._v("下载数："+t._s(t.share.buyCount))])])],1),t._v(" "),a("div",{staticClass:"content"},[a("wxParse",{attrs:{content:t.summary,eventid:"0",mpcomid:"0"},on:{preview:t.preview,navigate:t.navigate}})],1),t._v(" "),a("div",{slot:"footer"},[a("van-submit-bar",{attrs:{price:100*t.share.price,label:"积分","button-text":"兑换",currency:"฿",eventid:"1",mpcomid:"1"},on:{click:function(e){t.buy()}}})],1),t._v(" "),a("van-toast",{attrs:{id:"van-toast",mpcomid:"2"}})],1)},staticRenderFns:[]};e.a=n}},["Tw9l"]);