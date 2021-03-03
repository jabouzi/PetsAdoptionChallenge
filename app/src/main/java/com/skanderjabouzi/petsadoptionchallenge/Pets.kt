package com.skanderjabouzi.petsadoptionchallenge

import java.io.Serializable

data class Pet(val id: Int, val name: String, val description: String, val image: Int) : Serializable

//Description text from http://gaddafipsum.com/

val pets = listOf(
    Pet(id = 1,
        name = "Street",
        description = "The struggle to liberate domestic servants from their status of slavery and to transform them into partners, where their material production can be divided into its necessary basic components, is an inevitable process\n" +
            "This consistency inevitably necessitates returning to sound natural rules to solve the economic problems that are the result of all previous historical attempts to formulate solutions that ignore these rules",
        image = R.drawable.street),
    Pet(id = 2,
        name = "Winegeart",
        description = "To demand equality between man and woman in carrying heavy weights while the woman is pregnant is unjust and cruel\n" +
            "To imitate them is as stupid as it is dangerous to civilization and humanity\n" +
            "In this ﬁnal stage, proﬁt will disappear, as will the need for money",
        image = R.drawable.winegeart),
    Pet(id = 3,
        name = "Stone",
        description = "Originally, the public grandstands were designed to demarcate the masses from the playing ﬁelds and grounds; to prevent the masses from having access to the playing ﬁelds\n" +
            "For this reason, human communities struggle for their own national unity, the basis for their survival",
        image = R.drawable.stone),
    Pet(id = 4,
        name = "Lucas",
        description = "Driving woman to do man's work is a ﬂagrant aggression against the femininity with which she is naturally provided and which defines a natural purpose essential to life\n" +
            "The animal, horse, mule, camel, or the like, which was a component of production, has been replaced by factories and huge machines",
        image = R.drawable.lucas),
    Pet(id= 5,
        name = "Sayfullina",
        description = "It is, therefore, of great importance for human society to maintain the cohesiveness of the family, the tribe, the nation and the world in order to benefit from the advantages, privileges, values and ideals yielded by the solidarity, cohesiveness, unity, intimacy and love of family, tribe, nation and humanity",
                image = R.drawable.sayfullina),
    Pet(id = 6,
        name = "Pangarkar",
        description = "In the world of man, this is as much a historical reality as it is a social reality\n" +
            "An individual has the right to express himself or herself even if he or she behaves irrationally to demonstrate his or her insanity",
        image = R.drawable.pangarkar),
    Pet(id = 7,
        name = "Nickson",
        description = "These natural rules have produced natural socialism based on equality among the components of economic production, and have maintained public consumption almost equal to natural production among individuals\n" +
            "It follows that a tribe is an enlarged family",
        image = R.drawable.nickson),
    Pet(id = 8,
        name = "Olia",
        description = "These developments include the determination of ﬁxed working hours, overtime pay, leaves, minimal wages, proﬁt sharing, the participation of workers in administration, the banning of arbitrary dismissal, social security, the right to strike, and other provisions contained in labour codes of almost all contemporary legislation",
        image = R.drawable.olia),
    Pet(id = 9,
        name = "Rana",
        description = "Hence, human experiences through history have produced a new experiment in a unique attempt to culminate the struggle of persons to complete their freedom, to achieve happiness through satisfying their needs, to ward off exploitation by others, to put an end to tyranny, and to ﬁnd a method to distribute the wealth of the society equitably, without exploiting others or compromising their needs",
        image = R.drawable.rana),
    Pet(id = 10,
        name = "Tam",
        description = "It is a problem that will inevitably remain without solution until the process of the uniﬁcation of languages has passed through time, provided that the hereditary factor loses its effect on subsequent generations through the passage of sufficient time",
        image = R.drawable.tam)
)