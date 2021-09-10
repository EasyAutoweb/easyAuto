var OwlCarousel = {
	initOwlCarousel: function() {
		jQuery(document).ready(function() {
			var e = jQuery(".owl-slider");
			e.owlCarousel({
				itemsDesktop: [1e3, 4],
				itemsDesktopSmall: [900, 4],
				itemsTablet: [600, 3],
				itemsMobile: [479, 2]
			}), jQuery(".next-v1").click(function() {
				e.trigger("owl.next")
			}), jQuery(".prev-v1").click(function() {
				e.trigger("owl.prev")
			})
		}), jQuery(document).ready(function() {
			var e = jQuery(".owl-slider-v2");
			e.owlCarousel({
				items: [4],
				itemsDesktop: [1e3, 5],
				itemsDesktopSmall: [900, 4],
				itemsTablet: [600, 3],
				itemsMobile: [479, 2],
				slideSpeed: 1e3
			}), jQuery(".next-v2").click(function() {
				e.trigger("owl.next")
			}), jQuery(".prev-v2").click(function() {
				e.trigger("owl.prev")
			})
		}), jQuery(document).ready(function() {
			jQuery(".owl-slider-v3").owlCarousel({
				items: 9,
				autoPlay: 5e3,
				itemsDesktop: [1e3, 5],
				itemsDesktopSmall: [900, 4],
				itemsTablet: [600, 3],
				itemsMobile: [300, 2]
			})
		}), jQuery(document).ready(function() {
			jQuery(".owl-slider-v4").owlCarousel({
				items: 3,
				itemsDesktop : [1000,3],
				itemsDesktopSmall : [900,2],
				itemsTablet: [600, 1],
				itemsMobile: [479, 1]
			})
		}), jQuery(document).ready(function() {
			jQuery(".owl-slider-v5").owlCarousel({
				items: 4,
				itemsDesktop : [1200,3],
				itemsDesktopSmall : [1000,3],
				itemsDesktopSmall2 : [900,2],
				itemsTablet: [600, 2],
				itemsMobile: [479, 1]
			})
		}), jQuery(document).ready(function() {
			jQuery(".owl-slider-v6").owlCarousel({
				items: 4,
				itemsDesktop : [1200,4],
				itemsDesktopSmall : [1000,3],
				itemsDesktopSmall2 : [900,2],
				itemsTablet: [600, 2],
				itemsMobile: [479, 1],
			})
		}),  jQuery(document).ready(function() {
			jQuery(".owl-slider-v8").owlCarousel({
				items: 1,
				itemsDesktop : [1200,1],
				itemsDesktopSmall : [1000,1],
				itemsDesktopSmall2 : [900,1],
				itemsTablet: [600, 1],
				itemsMobile: [479, 1],
				navigation:true,
				margin: 10,
				/*
				navigationText: [
					"<i class='fa fa-chevron-left'></i>",
					"<i class='fa fa-chevron-right'></i>"
				]
				*/
			})
		})
	}
};