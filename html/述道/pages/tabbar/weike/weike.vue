<template>
	<view class="content">
		<view class="serach-view">
			<mSearch :show="false" @search="search($event,1)"></mSearch>
		</view>
		<view class="videos">
			<view class="title">
				<text>视频标题</text>
			</view>
			<view class="video">
				<video src="http://vjs.zencdn.net/v/oceans.mp4" show-play-btn="false" style="width: 100%;" contain="fill" autoplay="true" controls></video>
			</view>
			<view></view>
		</view>
		
		
		
	</view>
</template>

<script>
	
	import mSearch from '../../../components/mehaotian-search.vue';
	
	export default {
		components: {
			mSearch
		},
		data() {
			return {
				
			};
		},
		methods:{
			search(e, val) {
				console.log(e, val);
			}
    }
	}
</script>

<style>
/*搜索*/
.serach-view{padding: 0 30upx;}
/*视频*/
.videos .title{height: 32px;line-height: 32px;font-size: 14px;padding-left: 5px;}
</style>
