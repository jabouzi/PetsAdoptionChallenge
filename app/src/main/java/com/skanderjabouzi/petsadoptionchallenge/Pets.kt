package com.skanderjabouzi.petsadoptionchallenge

import java.io.Serializable

data class Pet(val id: Int, val name: String, val description: String, val image: Int) : Serializable

//Description text from http://gaddafipsum.com/

val pets = listOf(
    Pet(id = 1,
        name = "Street",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Et tortor at risus viverra adipiscing. Tincidunt praesent semper feugiat nibh sed. Sit amet dictum sit amet",
        image = R.drawable.street),
    Pet(id = 2,
        name = "Winegeart",
        description = "Consectetur lorem donec massa sapien. Tempus imperdiet nulla malesuada pellentesque. Elementum eu facilisis sed odio. Elementum sagittis vitae et leo duis ut diam",
        image = R.drawable.winegeart),
    Pet(id = 3,
        name = "Stone",
        description = "Enim lobortis scelerisque fermentum dui. Sagittis vitae et leo duis ut diam quam nulla. Massa vitae tortor condimentum lacinia quis. Venenatis lectus magna fringilla urna porttitor rhoncus dolor",
        image = R.drawable.stone),
    Pet(id = 4,
        name = "Lucas",
        description = "Fusce ut placerat orci nulla pellentesque dignissim enim sit. Eu consequat ac felis donec et odio pellentesque diam. Metus vulputate eu scelerisque felis imperdiet proin fermentum",
        image = R.drawable.lucas),
    Pet(id= 5,
        name = "Sayfullina",
        description = "Lectus quam id leo in vitae turpis. Ut venenatis tellus in metus vulputate. Venenatis lectus magna fringilla urna porttitor rhoncus. Porttitor rhoncus dolor purus non enim praesent elementum facilisis",
                image = R.drawable.sayfullina),
    Pet(id = 6,
        name = "Pangarkar",
        description = "Scelerisque fermentum dui faucibus in ornare quam viverra orci sagittis. Est placerat in egestas erat imperdiet. Aliquet nibh praesent tristique magna sit. Enim praesent elementum facilisis leo",
        image = R.drawable.pangarkar),
    Pet(id = 7,
        name = "Nickson",
        description = "Et leo duis ut diam quam nulla porttitor. Nam at lectus urna duis convallis. Sagittis orci a scelerisque purus semper eget. Facilisi cras fermentum odio eu feugiat pretium nibh",
        image = R.drawable.nickson),
    Pet(id = 8,
        name = "Olia",
        description = "Rhoncus dolor purus non enim praesent elementum facilisis. Sit amet facilisis magna etiam. A pellentesque sit amet porttitor eget dolor. Non diam phasellus vestibulum lorem sed risus. Sem integer vitae justo eget magna fermentum iaculis.",
        image = R.drawable.olia),
    Pet(id = 9,
        name = "Rana",
        description = "Nunc faucibus a pellentesque sit amet. Curabitur vitae nunc sed velit dignissim sodales ut. Maecenas volutpat blandit aliquam etiam. Dignissim cras tincidunt lobortis feugiat. Ac turpis egestas sed tempus urna",
        image = R.drawable.rana),
    Pet(id = 10,
        name = "Tam",
        description = "Quis ipsum suspendisse ultrices gravida dictum fusce ut placerat orci. Aliquam sem et tortor consequat id porta nibh venenatis cras. Non tellus orci ac auctor augue mauris",
        image = R.drawable.tam)
)