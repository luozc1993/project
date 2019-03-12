/*! vue-ydui v1.2.6 by YDCSS (c) 2018 Licensed MIT */
!function(e,t){"object"==typeof exports&&"object"==typeof module?module.exports=t():"function"==typeof define&&define.amd?define([],t):"object"==typeof exports?exports.ydui=t():e.ydui=t()}(this,function(){return function(e){function t(o){if(n[o])return n[o].exports;var i=n[o]={exports:{},id:o,loaded:!1};return e[o].call(i.exports,i,i.exports,t),i.loaded=!0,i.exports}var n={};return t.m=e,t.c=n,t.p="/dist/",t(0)}({0:function(e,t,n){"use strict";function o(e){return e&&e.__esModule?e:{default:e}}Object.defineProperty(t,"__esModule",{value:!0}),t.KeyBoard=void 0;var i=n(99),r=o(i);t.KeyBoard=r.default},1:function(e,t){e.exports=function(e,t,n,o){var i,r=e=e||{},a=typeof e.default;"object"!==a&&"function"!==a||(i=e,r=e.default);var s="function"==typeof r?r.options:r;if(t&&(s.render=t.render,s.staticRenderFns=t.staticRenderFns),n&&(s._scopeId=n),o){var l=s.computed||(s.computed={});Object.keys(o).forEach(function(e){var t=o[e];l[e]=function(){return t}})}return{esModule:i,exports:r,options:s}}},2:function(e,t){e.exports=function(){var e=[];return e.toString=function(){for(var e=[],t=0;t<this.length;t++){var n=this[t];n[2]?e.push("@media "+n[2]+"{"+n[1]+"}"):e.push(n[1])}return e.join("")},e.i=function(t,n){"string"==typeof t&&(t=[[null,t,""]]);for(var o={},i=0;i<this.length;i++){var r=this[i][0];"number"==typeof r&&(o[r]=!0)}for(i=0;i<t.length;i++){var a=t[i];"number"==typeof a[0]&&o[a[0]]||(n&&!a[2]?a[2]=n:n&&(a[2]="("+a[2]+") and ("+n+")"),e.push(a))}},e}},3:function(e,t,n){function o(e){for(var t=0;t<e.length;t++){var n=e[t],o=d[n.id];if(o){o.refs++;for(var i=0;i<o.parts.length;i++)o.parts[i](n.parts[i]);for(;i<n.parts.length;i++)o.parts.push(r(n.parts[i]));o.parts.length>n.parts.length&&(o.parts.length=n.parts.length)}else{for(var a=[],i=0;i<n.parts.length;i++)a.push(r(n.parts[i]));d[n.id]={id:n.id,refs:1,parts:a}}}}function i(){var e=document.createElement("style");return e.type="text/css",u.appendChild(e),e}function r(e){var t,n,o=document.querySelector('style[data-vue-ssr-id~="'+e.id+'"]');if(o){if(b)return h;o.parentNode.removeChild(o)}if(m){var r=p++;o=f||(f=i()),t=a.bind(null,o,r,!1),n=a.bind(null,o,r,!0)}else o=i(),t=s.bind(null,o),n=function(){o.parentNode.removeChild(o)};return t(e),function(o){if(o){if(o.css===e.css&&o.media===e.media&&o.sourceMap===e.sourceMap)return;t(e=o)}else n()}}function a(e,t,n,o){var i=n?"":o.css;if(e.styleSheet)e.styleSheet.cssText=g(t,i);else{var r=document.createTextNode(i),a=e.childNodes;a[t]&&e.removeChild(a[t]),a.length?e.insertBefore(r,a[t]):e.appendChild(r)}}function s(e,t){var n=t.css,o=t.media,i=t.sourceMap;if(o&&e.setAttribute("media",o),i&&(n+="\n/*# sourceURL="+i.sources[0]+" */",n+="\n/*# sourceMappingURL=data:application/json;base64,"+btoa(unescape(encodeURIComponent(JSON.stringify(i))))+" */"),e.styleSheet)e.styleSheet.cssText=n;else{for(;e.firstChild;)e.removeChild(e.firstChild);e.appendChild(document.createTextNode(n))}}var l="undefined"!=typeof document,c=n(4),d={},u=l&&(document.head||document.getElementsByTagName("head")[0]),f=null,p=0,b=!1,h=function(){},m="undefined"!=typeof navigator&&/msie [6-9]\b/.test(navigator.userAgent.toLowerCase());e.exports=function(e,t,n){b=n;var i=c(e,t);return o(i),function(t){for(var n=[],r=0;r<i.length;r++){var a=i[r],s=d[a.id];s.refs--,n.push(s)}t?(i=c(e,t),o(i)):i=[];for(var r=0;r<n.length;r++){var s=n[r];if(0===s.refs){for(var l=0;l<s.parts.length;l++)s.parts[l]();delete d[s.id]}}}};var g=function(){var e=[];return function(t,n){return e[t]=n,e.filter(Boolean).join("\n")}}()},4:function(e,t){e.exports=function(e,t){for(var n=[],o={},i=0;i<t.length;i++){var r=t[i],a=r[0],s=r[1],l=r[2],c=r[3],d={id:e+":"+i,css:s,media:l,sourceMap:c};o[a]?o[a].parts.push(d):n.push(o[a]={id:a,parts:[d]})}return n}},5:function(e,t){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var n=function(){var e=function(e){e.preventDefault(),e.stopPropagation()},t=!1;return{lock:function(n){t||(t=!0,(n||document).addEventListener("touchmove",e))},unlock:function(n){t=!1,(n||document).removeEventListener("touchmove",e)}}}(),o=function(){return{lock:function(e){i&&c(e||document.body,"g-fix-ios-prevent-scroll")},unlock:function(e){i&&d(e||document.body,"g-fix-ios-prevent-scroll")}}}(),i=!!(window.navigator&&window.navigator.userAgent||"").match(/\(i[^;]+;( U;)? CPU.+Mac OS X/),r=function(e){var t=/^#([a-fA-F0-9]){3}(([a-fA-F0-9]){3})?$/,n=/^[rR][gG][bB][aA]\(\s*((25[0-5]|2[0-4]\d|1?\d{1,2})\s*,\s*){3}\s*(\.|\d+\.)?\d+\s*\)$/,o=/^[rR][gG][bB]\(\s*((25[0-5]|2[0-4]\d|1?\d{1,2})\s*,\s*){2}(25[0-5]|2[0-4]\d|1?\d{1,2})\s*\)$/;return t.test(e)||n.test(e)||o.test(e)},a=function(e){for(var t=e;t&&"HTML"!==t.tagName&&"BODY"!==t.tagName&&1===t.nodeType;){var n=document.defaultView.getComputedStyle(t).overflowY;if("scroll"===n||"auto"===n)return t;t=t.parentNode}return window},s=function(e,t){var n=e===window?document.body.offsetHeight:e.offsetHeight,o=e===window?0:e.getBoundingClientRect().top,i=t.getBoundingClientRect().top-o,r=i+t.offsetHeight;return i>=0&&i<n||r>0&&r<=n},l=function(e,t){return t=t||"",!(0===t.replace(/\s/g,"").length||!e)&&new RegExp(" "+t+" ").test(" "+e.className+" ")},c=function(e,t){l(e,t)||(e.className=""===e.className?t:e.className+" "+t)},d=function(e,t){if(l(e,t)){for(var n=" "+e.className.replace(/[\t\r\n]/g,"")+" ";n.indexOf(" "+t+" ")>=0;)n=n.replace(" "+t+" "," ");e.className=n.replace(/^\s+|\s+$/g,"")}},u=function(e){function t(n,o,i){if(n===o)return void("function"==typeof r&&r());var a=n+i>o?o:n+i;n>o&&(a=n-i<o?o:n-i),e===window?window.scrollTo(a,a):e.scrollTop=a,window.requestAnimationFrame(function(){return t(a,o,i)})}var n=arguments.length>1&&void 0!==arguments[1]?arguments[1]:0,o=arguments[2],i=arguments.length>3&&void 0!==arguments[3]?arguments[3]:500,r=arguments[4];window.requestAnimationFrame||(window.requestAnimationFrame=window.webkitRequestAnimationFrame||window.mozRequestAnimationFrame||window.msRequestAnimationFrame||function(e){return window.setTimeout(e,1e3/60)});var a=Math.abs(n-o),s=Math.ceil(a/i*50);t(n,o,s)};t.pageScroll=n,t.preventScroll=o,t.isIOS=i,t.isColor=r,t.getScrollview=a,t.checkInview=s,t.addClass=c,t.removeClass=d,t.scrollTop=u},8:function(e,t,n){t=e.exports=n(2)(),t.push([e.id,".yd-mask{position:fixed;bottom:0;right:0;left:0;top:0;display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;-webkit-box-pack:center;-webkit-justify-content:center;-ms-flex-pack:center;justify-content:center;-webkit-box-align:center;-webkit-align-items:center;-ms-flex-align:center;align-items:center;pointer-events:none;-webkit-transition:opacity .2s ease-in;transition:opacity .2s ease-in;opacity:0}",""])},9:function(e,t,n){n(11);var o=n(1)(n(12),n(10),null,null);e.exports=o.exports},10:function(e,t){e.exports={render:function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("div",{staticClass:"yd-mask",style:e.styles},[e._t("default")],2)},staticRenderFns:[]}},11:function(e,t,n){var o=n(8);"string"==typeof o&&(o=[[e.id,o,""]]),o.locals&&(e.exports=o.locals);n(3)("01c2f03b",o,!0)},12:function(e,t,n){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var o=n(5);t.default={name:"yd-mask",data:function(){return{show:this.value}},props:{value:{type:Boolean,default:!1},bgcolor:{type:String,default:"#000"},zindex:{default:1500},opacity:{default:.5},animated:{type:Boolean,default:!0}},watch:{value:function(e){var t=this;this.show=e,o.isIOS&&(e?(0,o.addClass)(this.scrollView,"g-fix-ios-overflow-scrolling-bug"):setTimeout(function(){(0,o.removeClass)(t.scrollView,"g-fix-ios-overflow-scrolling-bug")},200))}},computed:{styles:function(){var e={"z-index":this.zindex,"background-color":this.bgcolor};return this.show&&(e.opacity=this.opacity,e["pointer-events"]="auto"),e}},mounted:function(){this.scrollView=(0,o.getScrollview)(this.$el)},beforeDestroy:function(){o.isIOS&&(0,o.removeClass)(this.scrollView,"g-fix-ios-overflow-scrolling-bug")}}},65:function(e,t,n){t=e.exports=n(2)(),t.push([e.id,'.yd-keyboard{position:fixed;bottom:0;left:0;width:100%;z-index:1502;-webkit-transform:translateY(100%);transform:translateY(100%);-webkit-transition:-webkit-transform .2s;transition:-webkit-transform .2s;transition:transform .2s;transition:transform .2s,-webkit-transform .2s;background-color:#f7f7f7}.yd-keyboard-active{-webkit-transform:translate(0);transform:translate(0)}.yd-keyboard-content{background-color:#fff;margin-top:15px;position:relative}.yd-keyboard-content:before{content:"";position:absolute;z-index:0;top:-1px;left:0;width:100%;height:1px;background-image:-webkit-linear-gradient(bottom,#ececec 50%,transparent 0);background-image:linear-gradient(0deg,#ececec 50%,transparent 0)}.yd-keyboard-title{overflow:hidden;padding:10px 0 6px;color:#222;margin-bottom:1px;font-size:12px;text-align:center;background-color:#fff}.yd-keyboard-title:before{font-family:YDUI-INLAY;content:"\\E60A";font-size:13px;color:#ff2424;line-height:1;margin-right:3px}.yd-keyboard-numbers{font-size:24px;background-color:#fff}.yd-keyboard-numbers>li{width:100%}.yd-keyboard-numbers>li,.yd-keyboard-numbers>li>a{display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex}.yd-keyboard-numbers>li>a{width:1%;-webkit-box-flex:1;-webkit-flex:1;-ms-flex:1;flex:1;color:#666;height:50px;position:relative;-webkit-box-pack:center;-webkit-justify-content:center;-ms-flex-pack:center;justify-content:center;-webkit-box-align:center;-webkit-align-items:center;-ms-flex-align:center;align-items:center;overflow:hidden}.yd-keyboard-numbers>li>a:not(:last-child):after{content:"";position:absolute;z-index:0;top:0;right:0;width:1px;height:100%;background-image:-webkit-linear-gradient(left,#f5f5f5 50%,transparent 0);background-image:linear-gradient(90deg,#f5f5f5 50%,transparent 0)}.yd-keyboard-numbers>li>a:before{content:"";position:absolute;z-index:0;top:-1px;left:0;width:100%;height:1px;background-image:-webkit-linear-gradient(bottom,#f5f5f5 50%,transparent 0);background-image:linear-gradient(0deg,#f5f5f5 50%,transparent 0);top:0}.yd-keyboard-numbers>li:last-child>a:last-child,.yd-keyboard-numbers>li:last-child>a:nth-last-child(3){background-color:#f7f7f7;font-size:15px;color:#686868}.yd-keyboard-numbers>li:last-child>a:last-child:after{font-family:YDUI-INLAY;content:"\\E609";font-size:30px}.yd-keyboard-head{height:40px;display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;-webkit-box-pack:center;-webkit-justify-content:center;-ms-flex-pack:center;justify-content:center;-webkit-box-align:center;-webkit-align-items:center;-ms-flex-align:center;align-items:center;color:#444;font-size:15px;position:relative}.yd-keyboard-head:after{height:1px;position:absolute;z-index:0;bottom:0;left:0;content:"";width:100%;background-image:-webkit-linear-gradient(bottom,#ececec 50%,transparent 0);background-image:linear-gradient(0deg,#ececec 50%,transparent 0)}.yd-keyboard-head>strong{font-weight:400}.yd-keyboard-password{margin:0 40px;display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;position:relative;background-color:#fff}.yd-keyboard-password:after{content:"";width:200%;height:200%;-webkit-transform:scale(.5);transform:scale(.5);position:absolute;border:1px solid #ececec;top:0;left:0;-webkit-transform-origin:0 0;transform-origin:0 0;border-radius:4px}.yd-keyboard-password li{-webkit-box-flex:1;-webkit-flex:1;-ms-flex:1;flex:1;position:relative;display:-webkit-box;display:-webkit-flex;display:-ms-flexbox;display:flex;-webkit-box-pack:center;-webkit-justify-content:center;-ms-flex-pack:center;justify-content:center;-webkit-box-align:center;-webkit-align-items:center;-ms-flex-align:center;align-items:center;height:50px}.yd-keyboard-password li:not(:last-child):after{content:"";width:1px;height:50%;position:absolute;right:0;top:25%;background-color:#ececec;-webkit-transform:scaleX(.5);transform:scaleX(.5)}.yd-keyboard-password li i{width:6px;height:6px;border-radius:50%;background-color:#000}.yd-keyboard-error{padding:2px 40px;color:red;overflow:hidden;height:25px;line-height:25px;font-size:12px;text-align:left}',""])},99:function(e,t,n){n(243);var o=n(1)(n(279),n(198),null,null);e.exports=o.exports},198:function(e,t){e.exports={render:function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("div",[n("yd-mask",{attrs:{opacity:e.maskerOpacity},nativeOn:{click:function(t){e.close(t)}},model:{value:e.show,callback:function(t){e.show=t},expression:"show"}}),e._v(" "),n("div",{staticClass:"yd-keyboard",class:e.show?"yd-keyboard-active":""},[n("div",{staticClass:"yd-keyboard-head"},[n("strong",[e._v(e._s(e.inputText))])]),e._v(" "),n("div",{staticClass:"yd-keyboard-error"},[e._v(e._s(e.error))]),e._v(" "),n("ul",{staticClass:"yd-keyboard-password"},e._l(6,function(t,o){return n("li",{key:o},[n("i",{directives:[{name:"show",rawName:"v-show",value:e.nums.length>=t,expression:"nums.length >= n"}]})])})),e._v(" "),n("div",{staticClass:"yd-keyboard-content"},[n("div",{staticClass:"yd-keyboard-title"},[e._v(e._s(e.title))]),e._v(" "),n("ul",{staticClass:"yd-keyboard-numbers"},e._l(4,function(t,o){return n("li",{key:o},[e.triggerClose?[4==t?n("a",{attrs:{href:"javascript:;"},on:{click:function(t){t.stopPropagation(),e.close(t)}}},[e._v(e._s(e.cancelText))]):e._e()]:[4==t?n("a",{attrs:{href:"javascript:;"}}):e._e()],e._v(" "),e.isMobile?e._l(e.numsArr.slice(3*(t-1),3*t),function(t,o){return n("a",{key:o,attrs:{href:"javascript:;"},on:{touchstart:function(n){n.stopPropagation(),e.numclick(t)}}},[e._v(e._s(t))])}):e._l(e.numsArr.slice(3*(t-1),3*t),function(t,o){return n("a",{key:o,attrs:{href:"javascript:;"},on:{click:function(n){n.stopPropagation(),e.numclick(t)}}},[e._v(e._s(t))])}),e._v(" "),4==t?n("a",{attrs:{href:"javascript:;"},on:{click:function(t){t.stopPropagation(),e.backspace(t)}}}):e._e()],2)}))])])],1)},staticRenderFns:[]}},243:function(e,t,n){var o=n(65);"string"==typeof o&&(o=[[e.id,o,""]]),o.locals&&(e.exports=o.locals);n(3)("e97e6658",o,!0)},279:function(e,t,n){"use strict";function o(e){return e&&e.__esModule?e:{default:e}}Object.defineProperty(t,"__esModule",{value:!0});var i=n(5),r=n(9),a=o(r);t.default={name:"yd-keyboard",components:{"yd-mask":a.default},data:function(){return{nums:"",show:this.value,error:"",numsArr:[1,2,3,4,5,6,7,8,9,0]}},props:{callback:{type:Function},disorder:{type:Boolean,default:!1},value:{type:Boolean,default:!1},title:{type:String,default:"YDUI安全键盘"},cancelText:{type:String,default:"取消"},inputText:{type:String,default:"输入数字密码"},triggerClose:{type:Boolean,default:!0},maskerOpacity:{validator:function(e){return/^([0]|[1-9]\d*)?(\.\d*)?$/.test(e)},default:.5}},watch:{value:function(e){i.isIOS&&(e?i.pageScroll.lock():i.pageScroll.unlock()),this.nums="",this.error="",this.show=e,this.show&&this.disorder&&(this.numsArr=this.upsetOrder(this.numsArr))},nums:function(e){e.length>=6&&this.callback&&this.callback(e)}},methods:{init:function(){var e=this;this.$on("ydui.keyboard.error",function(t){e.setError(t)}),this.$on("ydui.keyboard.close",this.close)},numclick:function(e){this.error="",this.nums.length>=6||(this.nums+=e)},backspace:function(){var e=this.nums;e&&(this.nums=e.substr(0,e.length-1))},upsetOrder:function(e){for(var t=Math.floor,n=Math.random,o=e.length,i=void 0,r=void 0,a=void 0,s=t(o/2)+1;s--;)i=t(n()*o),r=t(n()*o),i!==r&&(a=e[i],e[i]=e[r],e[r]=a);return e},close:function(){this.triggerClose&&this.$emit("input",!1)},setError:function(e){this.error=e,this.nums=""}},created:function(){var e=window.navigator&&window.navigator.userAgent||"";this.isMobile=!!e.match(/AppleWebKit.*Mobile.*/)||"ontouchstart"in document.documentElement,this.$nextTick(this.init)},beforeDestroy:function(){this.close(),i.pageScroll.unlock()}}}})});