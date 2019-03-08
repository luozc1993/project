<template>
	<view class="content">
		<view class="serach-view">
			<mSearch :show="false" @search="search($event,1)"></mSearch>
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
.serach-view{padding: 0 20upx;}
</style>
