!function(e,t){"object"==typeof exports&&"object"==typeof module?module.exports=t():"function"==typeof define&&define.amd?define([],t):"object"==typeof exports?exports["NativeShare.js"]=t():e["NativeShare.js"]=t()}(this,function(){return function(e){function t(r){if(n[r])return n[r].exports;var o=n[r]={i:r,l:!1,exports:{}};return e[r].call(o.exports,o,o.exports,t),o.l=!0,o.exports}var n={};return t.m=e,t.c=n,t.d=function(e,n,r){t.o(e,n)||Object.defineProperty(e,n,{configurable:!1,enumerable:!0,get:r})},t.n=function(e){var n=e&&e.__esModule?function(){return e.default}:function(){return e};return t.d(n,"a",n),n},t.o=function(e,t){return Object.prototype.hasOwnProperty.call(e,t)},t.p="",t(t.s=0)}([function(e,t,n){"use strict";function r(){}function o(e){var t=arguments.length>1&&void 0!==arguments[1]?arguments[1]:r,n=document.getElementsByTagName("script")[0],o=document.createElement("script");o.src=e,o.async=!0,n.parentNode.insertBefore(o,n),o.onload=t}function i(e,t){if(null==e)throw new TypeError("Cannot convert undefined or null to object");for(var n=Object(e),r=1;r<arguments.length;r++){var o=arguments[r];if(null!=o)for(var i in o)Object.prototype.hasOwnProperty.call(o,i)&&(n[i]=o[i])}return n}function a(e){if(se)location.href=e;else{var t=document.createElement("iframe");t.style.display="none",t.src=e,document.body.appendChild(t),setTimeout(function(){t&&t.parentNode&&t.parentNode.removeChild(t)},2e3)}}function c(e){var t=arguments.length>1&&void 0!==arguments[1]&&arguments[1],n=[];for(var r in e)t?n.push(r+"="+encodeURIComponent(e[r])):n.push(r+"="+e[r]);return n.join("&")}function u(e){var t=document.createElement("a");return t.href=e,t.hostname}function l(e){Oe?Oe.content=e:document.head.insertAdjacentHTML("beforeend",'<meta name="description" content="'+e+'">')}function f(e){je?je.href=e:document.head.insertAdjacentHTML("beforeend",'<link rel="shortcut icon" href="'+e+'">')}function s(e){document.title=e}function p(e){return c({share_id:924053302,url:_e.encode(e.link),title:_e.encode(e.title),description:_e.encode(e.desc),previewimageUrl:_e.encode(e.icon),image_url:_e.encode(e.icon)})}function h(){a((se?"mqqapi://share/to_fri?src_type=web&version=1&file_type=news":"mqqapi://share/to_fri?src_type=isqqBrowser&version=1&file_type=news")+"&"+p(Se))}function b(){a((se?"mqqapi://share/to_fri?file_type=news&src_type=web&version=1&generalpastboard=1&shareType=1&cflag=1&objectlocation=pasteboard&callback_type=scheme&callback_name=QQ41AF4B2A":"mqqapi://share/to_qzone?src_type=isqqBrowser&version=1&file_type=news&req_type=1")+"&"+p(Se))}function y(){var e={url:Se.link,title:Se.title,pic:Se.icon,desc:Se.desc};location.href="http://sns.qzone.qq.com/cgi-bin/qzshare/cgi_qzshare_onekey?"+c(e,!0)}function d(){var e={url:Se.link,title:Se.title,pic:Se.icon};location.href="http://service.weibo.com/share/share.php?"+c(e,!0)}function w(e,t){if(!(e instanceof t))throw new TypeError("Cannot call a class as a function")}function v(e,t,n){return t in e?Object.defineProperty(e,t,{value:n,enumerable:!0,configurable:!0,writable:!0}):e[t]=n,e}function g(e,t){if(!(e instanceof t))throw new TypeError("Cannot call a class as a function")}function m(e,t){if(!e)throw new ReferenceError("this hasn't been initialised - super() hasn't been called");return!t||"object"!=typeof t&&"function"!=typeof t?e:t}function _(e,t){if("function"!=typeof t&&null!==t)throw new TypeError("Super expression must either be null or a function, not "+typeof t);e.prototype=Object.create(t&&t.prototype,{constructor:{value:e,enumerable:!1,writable:!0,configurable:!0}}),t&&(Object.setPrototypeOf?Object.setPrototypeOf(e,t):e.__proto__=t)}function O(e,t,n){return t in e?Object.defineProperty(e,t,{value:n,enumerable:!0,configurable:!0,writable:!0}):e[t]=n,e}function j(e,t){if(!(e instanceof t))throw new TypeError("Cannot call a class as a function")}function S(e,t){if(!e)throw new ReferenceError("this hasn't been initialised - super() hasn't been called");return!t||"object"!=typeof t&&"function"!=typeof t?e:t}function k(e,t){if("function"!=typeof t&&null!==t)throw new TypeError("Super expression must either be null or a function, not "+typeof t);e.prototype=Object.create(t&&t.prototype,{constructor:{value:e,enumerable:!1,writable:!0,configurable:!0}}),t&&(Object.setPrototypeOf?Object.setPrototypeOf(e,t):e.__proto__=t)}function P(e,t,n){return t in e?Object.defineProperty(e,t,{value:n,enumerable:!0,configurable:!0,writable:!0}):e[t]=n,e}function C(e,t){if(!(e instanceof t))throw new TypeError("Cannot call a class as a function")}function q(e,t){if(!e)throw new ReferenceError("this hasn't been initialised - super() hasn't been called");return!t||"object"!=typeof t&&"function"!=typeof t?e:t}function T(e,t){if("function"!=typeof t&&null!==t)throw new TypeError("Super expression must either be null or a function, not "+typeof t);e.prototype=Object.create(t&&t.prototype,{constructor:{value:e,enumerable:!1,writable:!0,configurable:!0}}),t&&(Object.setPrototypeOf?Object.setPrototypeOf(e,t):e.__proto__=t)}function E(e,t){if(!(e instanceof t))throw new TypeError("Cannot call a class as a function")}function D(e,t){if(!e)throw new ReferenceError("this hasn't been initialised - super() hasn't been called");return!t||"object"!=typeof t&&"function"!=typeof t?e:t}function x(e,t){if("function"!=typeof t&&null!==t)throw new TypeError("Super expression must either be null or a function, not "+typeof t);e.prototype=Object.create(t&&t.prototype,{constructor:{value:e,enumerable:!1,writable:!0,configurable:!0}}),t&&(Object.setPrototypeOf?Object.setPrototypeOf(e,t):e.__proto__=t)}function Q(e,t){if(!(e instanceof t))throw new TypeError("Cannot call a class as a function")}function M(e,t){if(!e)throw new ReferenceError("this hasn't been initialised - super() hasn't been called");return!t||"object"!=typeof t&&"function"!=typeof t?e:t}function N(e,t){if("function"!=typeof t&&null!==t)throw new TypeError("Super expression must either be null or a function, not "+typeof t);e.prototype=Object.create(t&&t.prototype,{constructor:{value:e,enumerable:!1,writable:!0,configurable:!0}}),t&&(Object.setPrototypeOf?Object.setPrototypeOf(e,t):e.__proto__=t)}function A(e,t){if(!(e instanceof t))throw new TypeError("Cannot call a class as a function")}function U(e,t){if(!e)throw new ReferenceError("this hasn't been initialised - super() hasn't been called");return!t||"object"!=typeof t&&"function"!=typeof t?e:t}function B(e,t){if("function"!=typeof t&&null!==t)throw new TypeError("Super expression must either be null or a function, not "+typeof t);e.prototype=Object.create(t&&t.prototype,{constructor:{value:e,enumerable:!1,writable:!0,configurable:!0}}),t&&(Object.setPrototypeOf?Object.setPrototypeOf(e,t):e.__proto__=t)}function R(e,t){if(!(e instanceof t))throw new TypeError("Cannot call a class as a function")}function W(e,t){if(!e)throw new ReferenceError("this hasn't been initialised - super() hasn't been called");return!t||"object"!=typeof t&&"function"!=typeof t?e:t}function I(e,t){if("function"!=typeof t&&null!==t)throw new TypeError("Super expression must either be null or a function, not "+typeof t);e.prototype=Object.create(t&&t.prototype,{constructor:{value:e,enumerable:!1,writable:!0,configurable:!0}}),t&&(Object.setPrototypeOf?Object.setPrototypeOf(e,t):e.__proto__=t)}function z(e,t){if(!(e instanceof t))throw new TypeError("Cannot call a class as a function")}function F(e,t){if(!e)throw new ReferenceError("this hasn't been initialised - super() hasn't been called");return!t||"object"!=typeof t&&"function"!=typeof t?e:t}function L(e,t){if("function"!=typeof t&&null!==t)throw new TypeError("Super expression must either be null or a function, not "+typeof t);e.prototype=Object.create(t&&t.prototype,{constructor:{value:e,enumerable:!1,writable:!0,configurable:!0}}),t&&(Object.setPrototypeOf?Object.setPrototypeOf(e,t):e.__proto__=t)}function Z(e,t){if(!(e instanceof t))throw new TypeError("Cannot call a class as a function")}function J(e,t){if(!e)throw new ReferenceError("this hasn't been initialised - super() hasn't been called");return!t||"object"!=typeof t&&"function"!=typeof t?e:t}function H(e,t){if("function"!=typeof t&&null!==t)throw new TypeError("Super expression must either be null or a function, not "+typeof t);e.prototype=Object.create(t&&t.prototype,{constructor:{value:e,enumerable:!1,writable:!0,configurable:!0}}),t&&(Object.setPrototypeOf?Object.setPrototypeOf(e,t):e.__proto__=t)}function X(e,t){if(!(e instanceof t))throw new TypeError("Cannot call a class as a function")}function G(e,t){if(!e)throw new ReferenceError("this hasn't been initialised - super() hasn't been called");return!t||"object"!=typeof t&&"function"!=typeof t?e:t}function K(e,t){if("function"!=typeof t&&null!==t)throw new TypeError("Super expression must either be null or a function, not "+typeof t);e.prototype=Object.create(t&&t.prototype,{constructor:{value:e,enumerable:!1,writable:!0,configurable:!0}}),t&&(Object.setPrototypeOf?Object.setPrototypeOf(e,t):e.__proto__=t)}function V(e,t){if(!(e instanceof t))throw new TypeError("Cannot call a class as a function")}function Y(e,t){if(!e)throw new ReferenceError("this hasn't been initialised - super() hasn't been called");return!t||"object"!=typeof t&&"function"!=typeof t?e:t}function $(e,t){if("function"!=typeof t&&null!==t)throw new TypeError("Super expression must either be null or a function, not "+typeof t);e.prototype=Object.create(t&&t.prototype,{constructor:{value:e,enumerable:!1,writable:!0,configurable:!0}}),t&&(Object.setPrototypeOf?Object.setPrototypeOf(e,t):e.__proto__=t)}function ee(e,t){if(!(e instanceof t))throw new TypeError("Cannot call a class as a function")}function te(e,t){if(!e)throw new ReferenceError("this hasn't been initialised - super() hasn't been called");return!t||"object"!=typeof t&&"function"!=typeof t?e:t}function ne(e,t){if("function"!=typeof t&&null!==t)throw new TypeError("Super expression must either be null or a function, not "+typeof t);e.prototype=Object.create(t&&t.prototype,{constructor:{value:e,enumerable:!1,writable:!0,configurable:!0}}),t&&(Object.setPrototypeOf?Object.setPrototypeOf(e,t):e.__proto__=t)}function re(e,t){if(!(e instanceof t))throw new TypeError("Cannot call a class as a function")}function oe(e,t){if(!e)throw new ReferenceError("this hasn't been initialised - super() hasn't been called");return!t||"object"!=typeof t&&"function"!=typeof t?e:t}function ie(e,t){if("function"!=typeof t&&null!==t)throw new TypeError("Super expression must either be null or a function, not "+typeof t);e.prototype=Object.create(t&&t.prototype,{constructor:{value:e,enumerable:!1,writable:!0,configurable:!0}}),t&&(Object.setPrototypeOf?Object.setPrototypeOf(e,t):e.__proto__=t)}Object.defineProperty(t,"__esModule",{value:!0});var ae,ce=navigator.userAgent,ue=/(iPad).*OS\s([\d_]+)/.test(ce),le=/(iPod)(.*OS\s([\d_]+))?/.test(ce),fe=!ue&&/(iPhone\sOS)\s([\d_]+)/.test(ce),se=ue||le||fe,pe=/(Android);?[\s\/]+([\d.]+)?/.test(ce),he=/micromessenger/i.test(ce),be=/QQ\/([\d\.]+)/.test(ce),ye=/Qzone\//.test(ce),de=/MQQBrowser/i.test(ce)&&!he&&!be,we=/UCBrowser/i.test(ce),ve=/mobile.*baidubrowser/i.test(ce),ge=/SogouMobileBrowser/i.test(ce),me=/baiduboxapp/i.test(ce),_e={_keyStr:"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=",encode:function(e){var t,n,r,o,i,a,c,u="",l=0;for(e=_e._utf8_encode(e);l<e.length;)t=e.charCodeAt(l++),n=e.charCodeAt(l++),r=e.charCodeAt(l++),o=t>>2,i=(3&t)<<4|n>>4,a=(15&n)<<2|r>>6,c=63&r,isNaN(n)?a=c=64:isNaN(r)&&(c=64),u=u+this._keyStr.charAt(o)+this._keyStr.charAt(i)+this._keyStr.charAt(a)+this._keyStr.charAt(c);return u},_utf8_encode:function(e){e=e.replace(/\r\n/g,"\n");for(var t="",n=0;n<e.length;n++){var r=e.charCodeAt(n);r<128?t+=String.fromCharCode(r):r>127&&r<2048?(t+=String.fromCharCode(r>>6|192),t+=String.fromCharCode(63&r|128)):(t+=String.fromCharCode(r>>12|224),t+=String.fromCharCode(r>>6&63|128),t+=String.fromCharCode(63&r|128))}return t}},Oe=document.querySelector("meta[name=description]"),je=document.querySelector("link[rel*=icon]"),Se={link:location.href,title:function(){return document.title}(),desc:function(){return Object(Oe).content||""}(),icon:function(){return Object(je).href||location.protocol+"//"+location.hostname+"/favicon.ico"}(),from:"",success:r,fail:r,trigger:r},ke=function(){function e(e,t){for(var n=0;n<t.length;n++){var r=t[n];r.enumerable=r.enumerable||!1,r.configurable=!0,"value"in r&&(r.writable=!0),Object.defineProperty(e,r.key,r)}}return function(t,n,r){return n&&e(t.prototype,n),r&&e(t,r),t}}(),Pe=function(){function e(t){w(this,e),this._shareData=Se,this._config={syncDescToTag:!1,syncIconToTag:!1,syncTitleToTag:!1},this.setConfig(t)}return ke(e,[{key:"getShareData",value:function(){return i({},this._shareData)}},{key:"setShareData",value:function(){var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{};i(this._shareData,e),this._config.syncDescToTag&&l(this._shareData.desc),this._config.syncIconToTag&&f(this._shareData.icon),this._config.syncTitleToTag&&s(this._shareData.title)}},{key:"setConfig",value:function(){var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{};i(this._config,e)}},{key:"getConfig",value:function(){return i({},this._config)}}]),e}(),Ce=Pe,qe=function(){function e(e,t){for(var n=0;n<t.length;n++){var r=t[n];r.enumerable=r.enumerable||!1,r.configurable=!0,"value"in r&&(r.writable=!0),Object.defineProperty(e,r.key,r)}}return function(t,n,r){return n&&e(t.prototype,n),r&&e(t,r),t}}(),Te=function(e){function t(e){g(this,t);var n=m(this,(t.__proto__||Object.getPrototypeOf(t)).call(this,e));return o("https://jsapi.qq.com/get?api=app.share"),n}return _(t,e),qe(t,[{key:"call",value:function(){var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:"default",t=arguments[1];this.setShareData(t);var n=this.getShareData(),r=this.constructor.commamdMap[String(e).toLowerCase()];browser.app.share({title:n.title,description:n.desc,url:n.link,img_url:n.icon,from:n.from,to_app:r})}}]),t}(Ce);Te.commamdMap=(ae={},v(ae,"wechattimeline",8),v(ae,"wechatfriend",1),v(ae,"qqfriend",4),v(ae,"qzone",3),v(ae,"weibo",11),v(ae,"copyurl",10),v(ae,"more",5),v(ae,"generateqrcode",7),v(ae,"default",void 0),ae);var Ee,De=Te,xe=function(){function e(e,t){for(var n=0;n<t.length;n++){var r=t[n];r.enumerable=r.enumerable||!1,r.configurable=!0,"value"in r&&(r.writable=!0),Object.defineProperty(e,r.key,r)}}return function(t,n,r){return n&&e(t.prototype,n),r&&e(t,r),t}}(),Qe=function(e){function t(e){return j(this,t),S(this,(t.__proto__||Object.getPrototypeOf(t)).call(this,e))}return k(t,e),xe(t,[{key:"call",value:function(){var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:"default",t=arguments[1];this.setShareData(t);var n=this.getShareData(),r=this.constructor.commamdMap[String(e).toLowerCase()];ucbrowser.web_shareEX?ucbrowser.web_shareEX(JSON.stringify({title:n.title,content:n.desc,sourceUrl:n.link,imageUrl:n.icon,source:n.from,target:r})):ucbrowser.web_share(title,desc,link,r,"",from,"")}}]),t}(Ce);Qe.commamdMap=(Ee={},O(Ee,"wechattimeline","kWeixinFriend"),O(Ee,"wechatfriend","kWeixin"),O(Ee,"qqfriend","kQQ"),O(Ee,"qzone","kQZone"),O(Ee,"weibo","kSinaWeibo"),O(Ee,"default",void 0),Ee);var Me,Ne=Qe,Ae=function(){function e(e,t){for(var n=0;n<t.length;n++){var r=t[n];r.enumerable=r.enumerable||!1,r.configurable=!0,"value"in r&&(r.writable=!0),Object.defineProperty(e,r.key,r)}}return function(t,n,r){return n&&e(t.prototype,n),r&&e(t,r),t}}(),Ue=function(e){function t(e){return C(this,t),q(this,(t.__proto__||Object.getPrototypeOf(t)).call(this,e))}return T(t,e),Ae(t,[{key:"call",value:function(){var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:"default",t=arguments[1];this.setShareData(t);var n=this.getShareData(),r=this.constructor.commamdMap[String(e).toLowerCase()];ucweb.startRequest("shell.page_share",[n.title,n.desc,n.link,r,"",n.from,n.icon])}}]),t}(Ce);Ue.commamdMap=(Me={},P(Me,"wechattimeline","WechatTimeline"),P(Me,"wechatfriend","WechatFriends"),P(Me,"qqfriend","QQ"),P(Me,"qzone","Qzone"),P(Me,"weibo","SinaWeibo"),P(Me,"default",""),Me);var Be=Ue,Re=function(){function e(e,t){for(var n=0;n<t.length;n++){var r=t[n];r.enumerable=r.enumerable||!1,r.configurable=!0,"value"in r&&(r.writable=!0),Object.defineProperty(e,r.key,r)}}return function(t,n,r){return n&&e(t.prototype,n),r&&e(t,r),t}}(),We=function(e){function t(e){return E(this,t),D(this,(t.__proto__||Object.getPrototypeOf(t)).call(this,e))}return x(t,e),Re(t,[{key:"call",value:function(e,t){this.setShareData(t);var n=this.getShareData();_flyflowNative.exec("bd_utils","shareWebPage",JSON.stringify({title:n.title,content:n.desc,landurl:n.link,imageurl:n.icon,shareSource:n.from}),"")}}]),t}(Ce),Ie=We,ze=function(){function e(e,t){for(var n=0;n<t.length;n++){var r=t[n];r.enumerable=r.enumerable||!1,r.configurable=!0,"value"in r&&(r.writable=!0),Object.defineProperty(e,r.key,r)}}return function(t,n,r){return n&&e(t.prototype,n),r&&e(t,r),t}}(),Fe=function(e){function t(e){return Q(this,t),M(this,(t.__proto__||Object.getPrototypeOf(t)).call(this,e))}return N(t,e),ze(t,[{key:"call",value:function(e,t){this.setShareData(t);var n=this.getShareData();location.href="baidubrowserapp://bd_utils?action=shareWebPage¶ms="+encodeURIComponent(JSON.stringify({title:n.title,content:n.desc,imageurl:n.icon,landurl:n.link,mediaType:0,share_type:"webpage"}))}}]),t}(Ce),Le=Fe,Ze=function(){function e(e,t){for(var n=0;n<t.length;n++){var r=t[n];r.enumerable=r.enumerable||!1,r.configurable=!0,"value"in r&&(r.writable=!0),Object.defineProperty(e,r.key,r)}}return function(t,n,r){return n&&e(t.prototype,n),r&&e(t,r),t}}(),Je=function(e){function t(e){return A(this,t),U(this,(t.__proto__||Object.getPrototypeOf(t)).call(this,e))}return B(t,e),Ze(t,[{key:"call",value:function(e,t){this.setShareData(t);var n=this.getShareData();SogouMse.Utility.shareWithInfo({shareTitle:n.title,shareContent:n.desc,shareImageUrl:n.icon,shareUrl:n.link})}}]),t}(Ce),He=Je,Xe=function(){function e(e,t){for(var n=0;n<t.length;n++){var r=t[n];r.enumerable=r.enumerable||!1,r.configurable=!0,"value"in r&&(r.writable=!0),Object.defineProperty(e,r.key,r)}}return function(t,n,r){return n&&e(t.prototype,n),r&&e(t,r),t}}(),Ge=function e(t,n,r){null===t&&(t=Function.prototype);var o=Object.getOwnPropertyDescriptor(t,n);if(void 0===o){var i=Object.getPrototypeOf(t);return null===i?void 0:e(i,n,r)}if("value"in o)return o.value;var a=o.get;if(void 0!==a)return a.call(r)},Ke=function(e){function t(e){R(this,t);var n=W(this,(t.__proto__||Object.getPrototypeOf(t)).call(this,e));return n.setConfig(e),n}return I(t,e),Xe(t,[{key:"call",value:function(e,t){this.setShareData(t)}},{key:"setConfig",value:function(e){Ge(t.prototype.__proto__||Object.getPrototypeOf(t.prototype),"setConfig",this).call(this,e),this.init(this.getConfig().wechatConfig)}},{key:"init",value:function(e){var t=this;e&&o("https://res.wx.qq.com/open/js/jweixin-1.2.0.js",function(){wx.config(i({debug:!1,jsApiList:["onMenuShareTimeline","onMenuShareAppMessage","onMenuShareQQ","onMenuShareWeibo","onMenuShareQZone"]},e));var n=t._shareData,r={};Object.defineProperty(r,"trigger",{get:function(){return function(){i(r,{title:n.title,desc:n.desc,link:n.link,imgUrl:n.icon,type:n.type,dataUrl:n.dataUrl,success:n.success,fail:n.fail,cancel:n.fail}),n.trigger.apply(n,arguments)}},set:function(e){n.trigger=e},enumerable:!0}),wx.ready(function(){wx.onMenuShareAppMessage(r),wx.onMenuShareQQ(r),wx.onMenuShareQZone(r),wx.onMenuShareWeibo(r),wx.onMenuShareTimeline(r)})})}}]),t}(Ce),Ve=Ke,Ye=function(){function e(e,t){for(var n=0;n<t.length;n++){var r=t[n];r.enumerable=r.enumerable||!1,r.configurable=!0,"value"in r&&(r.writable=!0),Object.defineProperty(e,r.key,r)}}return function(t,n,r){return n&&e(t.prototype,n),r&&e(t,r),t}}(),$e=function(e){function t(e){return z(this,t),F(this,(t.__proto__||Object.getPrototypeOf(t)).call(this,e))}return L(t,e),Ye(t,[{key:"call",value:function(){var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:"default",t=arguments[1];if(this.setShareData(t),"weibo"!==(e=String(e).toLowerCase()))throw"qqfriend"===e?h():"qzone"===e&&b(),new Error("the browser may not support command "+e+"!");d()}}]),t}(Ce),et=$e,tt=function(){function e(e,t){for(var n=0;n<t.length;n++){var r=t[n];r.enumerable=r.enumerable||!1,r.configurable=!0,"value"in r&&(r.writable=!0),Object.defineProperty(e,r.key,r)}}return function(t,n,r){return n&&e(t.prototype,n),r&&e(t,r),t}}(),nt=function(e){function t(e){Z(this,t);var n=J(this,(t.__proto__||Object.getPrototypeOf(t)).call(this,e));return n.init(),n}return H(t,e),tt(t,[{key:"call",value:function(){var e=(arguments.length>0&&void 0!==arguments[0]&&arguments[0],arguments[1]);this.setShareData(e),mqq.ui.showShareMenu()}},{key:"init",value:function(){var e=this;o("https://open.mobile.qq.com/sdk/qqapi.js",function(){var t=e._shareData;mqq.ui.setOnShareHandler(function(e){mqq.ui.shareMessage({back:!0,share_type:e,title:t.title,desc:t.desc,share_url:t.link,image_url:t.icon,sourceName:t.from},function(e){0===e.retCode?t.success(e):t.fail(e)})})})}}]),t}(Ce),rt=nt,ot=function(){function e(e,t){for(var n=0;n<t.length;n++){var r=t[n];r.enumerable=r.enumerable||!1,r.configurable=!0,"value"in r&&(r.writable=!0),Object.defineProperty(e,r.key,r)}}return function(t,n,r){return n&&e(t.prototype,n),r&&e(t,r),t}}(),it=function e(t,n,r){null===t&&(t=Function.prototype);var o=Object.getOwnPropertyDescriptor(t,n);if(void 0===o){var i=Object.getPrototypeOf(t);return null===i?void 0:e(i,n,r)}if("value"in o)return o.value;var a=o.get;if(void 0!==a)return a.call(r)},at=function(e){function t(e){X(this,t);var n=G(this,(t.__proto__||Object.getPrototypeOf(t)).call(this,e));return n.init(),n}return K(t,e),ot(t,[{key:"setShareData",value:function(e){it(t.prototype.__proto__||Object.getPrototypeOf(t.prototype),"setShareData",this).call(this,e);var n=this.getShareData();u(n.link)!==location.hostname&&(n.link=location.href,console.warn("安卓的QQ自带浏览器分享url必须跟页面url同一个域名，已自动为你设置为当前页面的url"));try{mqq.data.setShareInfo({share_url:n.link,title:n.title,desc:n.desc,image_url:n.icon},function(e){!0!==e&&console.warn(e)})}catch(e){}}},{key:"call",value:function(){var e=(arguments.length>0&&void 0!==arguments[0]&&arguments[0],arguments[1]);this.setShareData(e),mqq.ui.showShareMenu()}},{key:"init",value:function(){var e=this;o("https://open.mobile.qq.com/sdk/qqapi.js",function(){e.setShareData()})}}]),t}(Ce),ct=at,ut=function(){function e(e,t){for(var n=0;n<t.length;n++){var r=t[n];r.enumerable=r.enumerable||!1,r.configurable=!0,"value"in r&&(r.writable=!0),Object.defineProperty(e,r.key,r)}}return function(t,n,r){return n&&e(t.prototype,n),r&&e(t,r),t}}(),lt=function(e){function t(e){V(this,t);var n=Y(this,(t.__proto__||Object.getPrototypeOf(t)).call(this,e));return n.init(),n}return $(t,e),ut(t,[{key:"call",value:function(){var e=this,t=(arguments.length>0&&void 0!==arguments[0]&&arguments[0],arguments[1]);this.setShareData(t);for(var n=this.getShareData(),r=[],o=[],i=[],a=[],c=0;c<5;c++)r.push(n.icon),a.push(n.link),o.push(n.title),i.push(n.desc);QZAppExternal.setShare(function(t){0!=t.code&&(e.hasSomethingWrong=!0)},{type:"share",image:r,title:o,summary:i,shareURL:a})}},{key:"setShareData",value:function(e){try{this.call("default",e)}catch(e){}}},{key:"init",value:function(){var e=this;o("https://qzonestyle.gtimg.cn/qzone/phone/m/v4/widget/mobile/jsbridge.js",function(){e.call("default")})}}]),t}(Ce),ft=lt,st=function(){function e(e,t){for(var n=0;n<t.length;n++){var r=t[n];r.enumerable=r.enumerable||!1,r.configurable=!0,"value"in r&&(r.writable=!0),Object.defineProperty(e,r.key,r)}}return function(t,n,r){return n&&e(t.prototype,n),r&&e(t,r),t}}(),pt=function(e){function t(e){return ee(this,t),te(this,(t.__proto__||Object.getPrototypeOf(t)).call(this,e))}return ne(t,e),st(t,[{key:"call",value:function(e,t){this.setShareData(t);var n=this.getShareData();window.NativeShareFailCallback=n.fail,window.NativeShareSuccessCallback=n.success,location.href="baiduboxapp://callShare?"+["options="+encodeURIComponent(JSON.stringify({title:n.title,imageUrl:"",mediaType:"all",content:n.desc,linkUrl:n.link,iconUrl:n.icon})),"errorcallback=window.NativeShareFailCallback","successcallback=window.NativeShareSuccessCallback"].join("&")}}]),t}(Ce),ht=pt,bt=function(){function e(e,t){for(var n=0;n<t.length;n++){var r=t[n];r.enumerable=r.enumerable||!1,r.configurable=!0,"value"in r&&(r.writable=!0),Object.defineProperty(e,r.key,r)}}return function(t,n,r){return n&&e(t.prototype,n),r&&e(t,r),t}}(),yt=function(e){function t(e){return re(this,t),oe(this,(t.__proto__||Object.getPrototypeOf(t)).call(this,e))}return ie(t,e),bt(t,[{key:"call",value:function(e,t){this.setShareData(t);var n=this.getShareData();window.NativeShareFailCallback=n.fail,window.NativeShareSuccessCallback=n.success,prompt("BdboxApp:"+JSON.stringify({obj:"Bdbox_android_utils",func:"callShare",args:['{\n                            imageUrl: "",\n                            mediaType: "all",\n                            title: "'+n.title+'",\n                            content: "'+n.desc+'",\n                            linkUrl: "'+n.link+'",\n                            iconUrl: "'+n.icon+'"\n                        }',"window.NativeShareSuccessCallback","window.NativeShareFailCallback"]}))}}]),t}(Ce),dt=yt;n.d(t,"Share",function(){return Ce}),n.d(t,"QQMobileBrowser",function(){return De}),n.d(t,"UCIosBrowser",function(){return Ne}),n.d(t,"UCAndroidBrowser",function(){return Be}),n.d(t,"BaiduAndroidBrowser",function(){return Ie}),n.d(t,"BaiduIosBrowser",function(){return Le}),n.d(t,"SogouIosBrowser",function(){return He}),n.d(t,"BaiduIos",function(){return ht}),n.d(t,"BaiduAndroid",function(){return dt}),n.d(t,"Wechat",function(){return Ve}),n.d(t,"Others",function(){return et}),n.d(t,"QQIos",function(){return rt}),n.d(t,"QQAndroid",function(){return ct}),n.d(t,"QZone",function(){return ft}),n.d(t,"shareToQQ",function(){return h}),n.d(t,"shareToQZone",function(){return b}),n.d(t,"shareToWeibo4Web",function(){return d}),n.d(t,"shareToQZone4Web",function(){return y});var wt=void 0;wt=he?Ve:be&&se?rt:be&&pe?ct:ye?ft:de?De:we&&se?Ne:we&&pe?Be:ve&&pe?Ie:ve&&se?Le:ge&&se?He:me&&se?ht:me&&pe?dt:et,window.NativeShare=wt,t.default=wt}])});