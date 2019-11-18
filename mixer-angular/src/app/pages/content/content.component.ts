import {AfterViewChecked, Component, OnInit} from '@angular/core';

@Component({
    selector: 'app-content',
    templateUrl: './content.component.html',
    styleUrls: ['./content.component.scss']
})
export class ContentComponent implements OnInit, AfterViewChecked {

    htmlToAdd: string;

    constructor() {
        this.htmlToAdd='<div class="content-header">\n' +
            '                <h2>A Guide to the Java LinkedList</h2>\n' +
            '                <div class="sub-content-header">\n' +
            '                    <p>July 19, 2019</p>\n' +
            '                    <p>Baeldung (Content Testing)</p>\n' +
            '                    <span class="content-tag">\n' +
            '                        <p>#Java</p>\n' +
            '                        <p>#Java Collection</p>\n' +
            '                    </span>\n' +
            '                </div>\n' +
            '            </div>\n' +
            '            <div class="content-body">\n' +
            '                <h3>Introduction</h3>\n' +
            '                <div class="sub-content-body">\n' +
            '                    <p>LinkedList is a doubly-linked list implementation of the List and Deque interfaces. It implements\n' +
            '                        all optional list operations and permits all elements (including null).</p>\n' +
            '                </div>\n' +
            '                <h3>Features</h3>\n' +
            '                <div class="sub-content-body">\n' +
            '                    <p>Below you can find the most important properties of the LinkedList:</p>\n' +
            '                    <ul>\n' +
            '                        <li>\n' +
            '                            Operations that index into the list will traverse the list from the beginning or the end,\n' +
            '                            whichever is closer to the specified index\n' +
            '                        </li>\n' +
            '                        <li>It is not synchronized</li>\n' +
            '                        <li>Its Iterator and ListIterator iterators are fail-fast (which means that after the iterator\'s\n' +
            '                            creation, if the list is modified, a ConcurrentModificationException will be thrown)\n' +
            '                        </li>\n' +
            '                        <li>Every element is a node, which keeps a reference to the next and previous ones</li>\n' +
            '                        <li>It maintains insertion order</li>\n' +
            '                    </ul>\n' +
            '                    <p>Although LinkedList is not synchronized, we can retrieve a synchronized version of it by calling the Collections.synchronizedList method, like:</p>\n' +
            '                    <div class="code">\n' +
            '                        LinkedList&#60;Object&#62; linkedList = new LinkedList&#60;&#62;();\n' +
            '                    </div>\n' +
            '\n' +
            '                </div>\n' +
            '            </div>';
    }

    ngOnInit() {
    }

    ngAfterViewChecked(): void {
    }

}
