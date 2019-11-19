package com.sovannarith.mixer.service.impl;


import org.springframework.stereotype.Service;

@Service
public class HTMLService {

    String htmlToAdd = "<div class=\"content-header\">\n" +
            "                <h2>A Guide to the Java LinkedList</h2>\n" +
            "                <div class=\"sub-content-header\">\n" +
            "                    <p>Last Updated : July 19, 2019</p>\n" +
            "                    <a href=\"#\">Baeldung (Content Testing)</a>\n" +
            "                    <span class=\"content-tag\">\n" +
            "                        <a href=\"#\">#Java</a>\n" +
            "                        <a href=\"#\">#Java Collection</a>\n" +
            "                    </span>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "            <div class=\"content-body\">\n" +
            "                <h3>Introduction</h3>\n" +
            "                <div class=\"sub-content-body\">\n" +
            "                    <p>LinkedList is a doubly-linked list implementation of the List and Deque interfaces. It implements\n" +
            "                        all optional list operations and permits all elements (including null).</p>\n" +
            "                </div>\n" +
            "                <h3>Features</h3>\n" +
            "                <div class=\"sub-content-body\">\n" +
            "                    <p>Below you can find the most important properties of the LinkedList:</p>\n" +
            "                    <ul>\n" +
            "                        <li>\n" +
            "                            Operations that index into the list will traverse the list from the beginning or the end,\n" +
            "                            whichever is closer to the specified index\n" +
            "                        </li>\n" +
            "                        <li>It is not synchronized</li>\n" +
            "                        <li>Its Iterator and ListIterator iterators are fail-fast (which means that after the iterator\"s\n" +
            "                            creation, if the list is modified, a ConcurrentModificationException will be thrown)\n" +
            "                        </li>\n" +
            "                        <li>Every element is a node, which keeps a reference to the next and previous ones</li>\n" +
            "                        <li>It maintains insertion order</li>\n" +
            "                    </ul>\n" +
            "                    <p>Although LinkedList is not synchronized, we can retrieve a synchronized version of it by calling the Collections.synchronizedList method, like:</p>\n" +
            "                    <div class=\"code\">\n" +
            "                        LinkedList&#60;Object&#62; linkedList = new LinkedList&#60;&#62;();\n" +
            "                    </div>\n" +
            "\n" +
            "                </div>\n" +
            "            </div>";

    private String convertToHtml() {
        String mdText = "#A Guide to the Java LinkedList\n*tag*Java, Java Collection*end-tag*";
        String staticc = "<div class=\"sub-content-header\">\n<p>Last Updated : July 19, 2019</p> <a href=\"#\">Baeldung (Content Testing)</a>\n";
        String[] lines = mdText.split(System.getProperty("line.separator"));
        StringBuilder html = new StringBuilder();
        html.append("<div class=\"content-header\">\n");
        for (String line : lines) {
            if (line.startsWith("#")) {
                line = line.replaceFirst("#", "<h2>");
                html.append(line).append("</h2>");
                html.append(staticc);
            } else if (line.startsWith("*tag*")) {
                html.append("<span class=\"content-tag\">\n");
                String tagStr = line.replace("*tag*", "").replace("*end-tag*", "");
                String[] tags = tagStr.contains(",") ? tagStr.split(",") : tagStr.split("");
                for (String tag : tags) {
                    html.append("<a href=\"#\">").append(tag).append("</a>");
                }
                html.append("</span>\n");
            }
        }
        html.append("</div>").append("</div>");
        return html.toString();

    }

    public String getHTML() {
        return convertToHtml();
    }
}
