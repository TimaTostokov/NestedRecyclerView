package jolchu.tolik.nestedrecyclerview

data class ParentItem(
    val title: String,
    val logo: Int,
    val mList: List<ChildItem>
)