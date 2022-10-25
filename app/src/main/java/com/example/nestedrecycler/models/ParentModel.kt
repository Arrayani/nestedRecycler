package com.example.nestedrecycler.models

/**

 * Author: Roni Reynal Fitri  on $ {DATE} $ {HOUR}: $ {MINUTE}

 * Email: biruprinting@gmail.com

 */
data class ParentModel (
    val title : String = "",
    val children : List<ChildModel>
)