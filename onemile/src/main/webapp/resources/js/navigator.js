$(function(){
	$("#confirmbtn").click(function(){
		if('geolocation' in navigator){
		    navigator.geolocation.getCurrentPosition((position) => {
		    	
		    	let lat = position.coords.latitude;
		    	let lng = position.coords.longitude;
		    	
		    	getAddr(lat,lng);
		    });

		}
	});
	function getAddr(lat,lng){
		let geocoder = new kakao.maps.services.Geocoder();

	    let coord = new kakao.maps.LatLng(lat, lng);
	    let callback = function(result, status) {
	        if (status === kakao.maps.services.Status.OK) {
	            console.log(result);
	        }
	        
	    };
	    geocoder.coord2RegionCode(lng,lat,callback);
	}
});
