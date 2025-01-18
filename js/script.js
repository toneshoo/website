var swiper = new Swiper(".mySwiper", {
		slidesPerView: 1,
	grabCursor:true,
		loop: true,
		pagination: {
			el: ".swiper-pagination",
			clickable: true,
		},
		navigation: {
			nextEl: ".swiper-button-next",
			prevEl: ".swiper-button-prev",
		},
	});

$( document ).ready(function() {
	// var active = 0;
	// $(".hamburger").on('click', function(event) {
	// 	if(active == 0){
	// 		$(this).addClass('is-active');
	// 		active = 1;
	// 	} else {
	// 		$(this).removeClass('is-active');
	// 		active = 0;
	// 	}
	// });

	$(".hamburger").on('click', function(event) {
		if( $(this).hasClass('is-active') ){
			$(this).removeClass('is-active');
			$(".links").removeClass('is-active');
		} else {
			$(this).addClass('is-active');
			$(".links").addClass('is-active');
		}
	});
	$(".links a").on('click', function(event) {
		$(".hamburger").removeClass('is-active');
		$(".links").removeClass('is-active');
	});

	// Wow Animations 
	wow = new WOW({
		boxClass:     'wow',      // default
		animateClass: 'animate__animated', // default
		offset:       100,          // default
		mobile:       true,       // default
		live:         true        // default
	});
	wow.init();	
});